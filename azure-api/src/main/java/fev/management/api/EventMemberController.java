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
import fev.management.entity.FevEventMember;
import fev.management.repository.EventMemberRepository;

@Controller
public class EventMemberController implements BaseController<FevEventMember> {

    /** For logging. */
    private final static Logger LOG = LoggerFactory.getLogger(EventController.class);

    private final String path = "/events/members";

    @Autowired
    EventMemberRepository eventMemberRepository;

    // GET
    // Display all album
    @GetMapping(path=path, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    @Override
    public List<FevEventMember> getAll() {
        // TODO Auto-generated method stub
        return (List<FevEventMember>) eventMemberRepository.findAll();
    }

    // Get Album By ID
    @GetMapping(path = path + "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    @Override
    public Optional<FevEventMember> getByID(@PathVariable("id") int id) {
        // TODO Auto-generated method stub
        return eventMemberRepository.findById(id);
    }

    @GetMapping(path + "/count")
    @ResponseBody
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return (int) eventMemberRepository.count();
    }

    // Get Event By ID
    @DeleteMapping(path + "/{id}")
    @ResponseBody
    @Override
    public void deleteByID(@PathVariable("id") int id) {
        // TODO Auto-generated method stub
        eventMemberRepository.deleteById(id);
    }

    @PostMapping(path = path + "/{em}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    @Override
    public void create(@PathVariable("em") FevEventMember object) {
        // TODO Auto-generated method stub
    	if (eventMemberRepository.findById(object.getId()).get() != null) {
			LOG.info("{} is exist!", object.getId());
			return;
		}
        eventMemberRepository.save(object);
    }

    // Create new Event
    @PutMapping(path + "/{em}")
    @ResponseBody
    @Override
    public void update(@RequestBody FevEventMember object, @PathVariable("id") int id) {
        // TODO Auto-generated method stub
    	FevEventMember eventMember = eventMemberRepository.findById(id).get();
		if (eventMember == null) {
			return;
		} else {
			if (object.getEvent() != null) {
				eventMember.setEvent(object.getEvent());
			}
			if (object.getMember1() != null) {
				eventMember.setMember1(object.getMember1());
			}
			if (object.getNote() != null) {
				eventMember.setNote(object.getNote());
			}
		}
        eventMemberRepository.save(object);
    }

}
