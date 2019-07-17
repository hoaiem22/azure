package fev.management.api;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import fev.management.entity.FevAccount;
import fev.management.entity.FevMember;
import fev.management.entity.FevMemberPosition;
import fev.management.repository.MemberPositionRepository;
@CrossOrigin

@Controller
public class MemberPositionController implements BaseController<FevMemberPosition,FevMemberPosition> {

	/** For logging. */
	private final static Logger LOG = LoggerFactory.getLogger(EventController.class);

	private final String path = "/members/positions";

	@Autowired
	MemberPositionRepository memberPositionRepository;

	// GET
	// Display all member position
	@GetMapping(path)
	@ResponseBody
	@Override
	public List<FevMemberPosition> getAll() {
		// TODO Auto-generated method stub
		return (List<FevMemberPosition>) memberPositionRepository.findAll();
	}

	// Get member position By ID
	@GetMapping(path + "/{id}")
	@ResponseBody
	@Override
	public Optional<FevMemberPosition> getByID(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return memberPositionRepository.findById(id);
	}

	@GetMapping(path + "/count")
	@ResponseBody
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return (int) memberPositionRepository.count();
	}

	// Get member position By ID
	@DeleteMapping(path + "/{id}")
	@ResponseBody
	@Override
	public void deleteByID(@PathVariable("id") int id) {
		memberPositionRepository.deleteById(id);

	}
	// Create new Event
	@PostMapping(path)
	@ResponseBody
	@Override
	public void create(@RequestBody FevMemberPosition object) {
		// TODO Auto-generated method stub
		memberPositionRepository.save(object);
	}

	// Update member position
	@PutMapping(path = path + "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }) 
	@ResponseBody
	@Override
	public void update(@RequestBody FevMemberPosition object, @PathVariable("id") int id) {
		// TODO Auto-generated method stub
		FevMemberPosition memberPosition = memberPositionRepository.findById(id).get();
		if (memberPosition == null) {
			return;
		} else {
			if (object.getPosition() != null) {
				memberPosition.setPosition(object.getPosition());
			}
			if (object.getNote() != null) {
				memberPosition.setNote(object.getNote());
			}
		}
		memberPositionRepository.save(object);
	}
}