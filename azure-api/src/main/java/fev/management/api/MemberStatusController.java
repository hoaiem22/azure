package fev.management.api;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import fev.management.entity.FevMemberPosition;
import fev.management.entity.FevMemberStatus;
import fev.management.repository.MemberPositionRepository;
import fev.management.repository.MemberStatusRepository;
@CrossOrigin
@Controller
public class MemberStatusController implements BaseController<FevMemberStatus,FevMemberStatus>{

	/** For logging. */
	private final static Logger LOG = LoggerFactory.getLogger(MemberStatusController.class);

	private final String path = "/members/status";

	@Autowired
	MemberStatusRepository memberStatusRepo;

	// GET
	// Display all member status
	@GetMapping(path)
	@ResponseBody
	@Override
	public List<FevMemberStatus> getAll() {
		// TODO Auto-generated method stub
		return (List<FevMemberStatus>) memberStatusRepo.findAll();
	}

	// Get member status By ID
	@GetMapping(path + "/{id}")
	@ResponseBody
	@Override
	public Optional<FevMemberStatus> getByID(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return memberStatusRepo.findById(id);
	}

	@GetMapping(path + "/count")
	@ResponseBody
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return (int) memberStatusRepo.count();
	}

	// Get member status By ID
	@DeleteMapping(path + "/{id}")
	@ResponseBody
	@Override
	public void deleteByID(@PathVariable("id") int id) {
		memberStatusRepo.deleteById(id);

	}
	// Create new status
	@PostMapping(path)
	@ResponseBody
	@Override
	public void create(@RequestBody FevMemberStatus object) {
		// TODO Auto-generated method stub
		memberStatusRepo.save(object);
	}

	// Update member status
	@PutMapping(path = path + "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }) 
	@ResponseBody
	@Override
	public void update(@RequestBody FevMemberStatus object, @PathVariable("id") int id) {
		// TODO Auto-generated method stub
		FevMemberStatus memberStatus = memberStatusRepo.findById(id).get();
		if (memberStatus == null) {
			return;
		} else {
			if (object.getStatus() != null) {
				memberStatus.setStatus(object.getStatus());
			}
			if (object.getNote() != null) {
				memberStatus.setNote(object.getNote());
			}
		}
		memberStatusRepo.save(object);
	}

}
