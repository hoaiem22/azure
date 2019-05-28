package fev.management.api;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import fev.management.entity.FevAccount;
import fev.management.entity.FevEvent;
import fev.management.entity.FevEventAlbum;
import fev.management.repository.EventRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
public class EventController implements BaseController<FevEvent> {

	/** For logging. */
	private final static Logger LOG = LoggerFactory.getLogger(EventController.class);

	private final String path = "/events";

	@Autowired
	EventRepository eventRepository;

	// GET
	// Display all event
	@GetMapping(path = path, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Get All Event")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = String.class),
			@ApiResponse(code = 422, message = "Event not found"),
			@ApiResponse(code = 417, message = "Exception failed") })
	@ResponseBody
	public List<FevEvent> getAll() {

		return (List<FevEvent>) eventRepository.findAll();
		// return "Get All Event";
	}

	// Get Event By ID
	@GetMapping(path = path + "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public Optional<FevEvent> getByID(@PathVariable("id") int id) {

		return eventRepository.findById(id);
	}

	// Return total of event
	@GetMapping(path + "/count")
	@ResponseBody
	@Override
	public int getCount() {

		return (int) eventRepository.count();
	}

	// DELETE
	// Get Event By ID
	@DeleteMapping(path + "/{id}")
	@ResponseBody
	public void deleteByID(@PathVariable("id") int id) {

		eventRepository.deleteById(id);

	}

	// CREATE
	// Create new Event
	@PostMapping(path = path, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public void create(@RequestBody FevEvent object) {
		if (eventRepository.findById(object.getId()).get() != null) {
			LOG.info("{} is exist!", object.getId());
			return;
		}
		eventRepository.save(object);
	}

	// UPDATE
	// Create new Event
	@PutMapping(path = path, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public void update(@RequestBody FevEvent object, @PathVariable("id") int id) {
		FevEvent event = eventRepository.findById(id).get();
		if (event == null) {
			return;
		} else {
			if (object.getName() != null) {
				event.setName(object.getName());
			}
			if (object.getStart() != null) {
				event.setStart(object.getStart());
			}
			if (object.getEnd() != null) {
				event.setEnd(object.getEnd());
			}
			if (object.getTime() != null) {
				event.setTime(object.getTime());
			}
			if (object.getPlace() != null) {
				event.setPlace(object.getPlace());
			}
			if (object.getLeader() != null) {
				event.setLeader(object.getLeader());
			}
			if (object.getNote() != null) {
				event.setNote(object.getNote());
			}
		}
		eventRepository.save(event);
	}

}
