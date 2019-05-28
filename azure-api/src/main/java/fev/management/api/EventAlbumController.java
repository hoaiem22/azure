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
import fev.management.entity.FevEventAlbum;
import fev.management.repository.EventAlbumRepository;
import fev.management.repository.EventRepository;

@Controller
public class EventAlbumController implements BaseController<FevEventAlbum> {

	/** For logging. */
	private final static Logger LOG = LoggerFactory.getLogger(EventAlbumController.class);

	private final String path = "/events/albums";

	@Autowired
	EventAlbumRepository eventAlbumRepository;

	// GET
	// Display all album
	@GetMapping(path = path, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@Override
	public List<FevEventAlbum> getAll() {
		// TODO Auto-generated method stub
		return (List<FevEventAlbum>) eventAlbumRepository.findAll();
	}

	// Get Album By ID
	@GetMapping(path = path + "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@Override
	public Optional<FevEventAlbum> getByID(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return eventAlbumRepository.findById(id);
	}

	@GetMapping(path + "/count")
	@ResponseBody
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return (int) eventAlbumRepository.count();
	}

	// Delete Event By ID
	@DeleteMapping(path = path + "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@Override
	public void deleteByID(@PathVariable("id") int id) {
		eventAlbumRepository.deleteById(id);

	}

	@PostMapping(path = path, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	@Override
	public void create(@RequestBody FevEventAlbum object) {
		// TODO Auto-generated method stub
		if (eventAlbumRepository.findById(object.getId()).get() != null) {
			LOG.info("{} is exist!", object.getId());
			return;
		}
		eventAlbumRepository.save(object);
	}

	// Create new Event
	@PutMapping(path = path, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	@Override
	public void update(@RequestBody FevEventAlbum object, @PathVariable("id") int id) {
		// TODO Auto-generated method stub
		FevEventAlbum eventAlbum = eventAlbumRepository.findById(id).get();
		if (eventAlbum == null) {
			return;
		} else {
			if (object.getEvent() != null) {
				eventAlbum.setEvent(object.getEvent());
			}
			if (object.getImg() != null) {
				eventAlbum.setImg(object.getImg());
			}
		}
		eventAlbumRepository.save(eventAlbum);
	}

	// GET
	// Get event's album By event id
	@GetMapping(path = path + "/album/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<FevEventAlbum> getByID(@PathVariable("id") String id) {
		// TODO Auto-generated method stub
		return (List<FevEventAlbum>) eventAlbumRepository.getAlbumByID(id);
	}
}
