package fev.management.api;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fev.management.entity.FevAccount;
import fev.management.entity.FevFeedbackStatus;
import fev.management.entity.FevMember;
import fev.management.repository.MemberRepository;

@Controller
public class MemberController implements BaseController<FevMember> {

	/** For logging. */
	private final static Logger LOG = LoggerFactory.getLogger(EventController.class);

	private final String path = "/members";

	@Autowired
	MemberRepository memberRepository;

	// GET
	// Display all member
	@CrossOrigin
	@GetMapping(path)
	@ResponseBody
	@Override
	public List<FevMember> getAll() {
		// TODO Auto-generated method stub
		return (List<FevMember>) memberRepository.findAll();
	}

	// Get member By ID
	@GetMapping(path + "/{id}")
	@ResponseBody
	@Override
	public Optional<FevMember> getByID(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return memberRepository.findById(id);
	}

	// Find members by name
	@PostMapping(path + "/name" )
	@ResponseBody
	public List<FevMember> getByName(@Valid @RequestBody String name) {
		// TODO Auto-generated method stub
		return memberRepository.findByName(name);
	}

	@GetMapping(path + "/count")
	@ResponseBody
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return (int) memberRepository.count();
	}

	// Get member By ID
	@DeleteMapping(path + "/{id}")
	@ResponseBody
	@Override
	public void deleteByID(@PathVariable("id") int id) {
		memberRepository.deleteById(id);

	}

	// Create new member
	@PostMapping(path)
	@ResponseBody
	@Override
	public void create(@Valid @RequestBody FevMember object) {
		// TODO Auto-generated method stub
		memberRepository.save(object);
	}

	//Update member
	@PutMapping(path = path + "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	@Override
	public void update(@RequestBody FevMember object, @PathVariable("id") int id) {
		// TODO Auto-generated method stub
		FevMember member = memberRepository.findById(id).get();
		if (member == null) {
			return;
		} else {
			if (object.getFullname() != null) {
				member.setFullname(object.getFullname());
			}
			if (object.getStudentID() != null) {
				member.setStudentID(object.getStudentID());
			}
			if (object.getBirthdate() != null) {
				member.setBirthdate(object.getBirthdate());
			}
			if (object.getSex() != null) {
				member.setSex(object.getSex());
			}
			if (object.getAddress() != null) {
				member.setAddress(object.getAddress());
			}
			if (object.getPhone() != null) {
				member.setPhone(object.getPhone());
			}
			if (object.getPosition() != null) {
				member.setPosition(object.getPosition());
			}
			if (object.getStatus() != null) {
				member.setStatus(object.getStatus());
			}
			if (object.getPoint() != null) {
				member.setPoint(object.getPoint());
			}
			if (object.getNote() != null) {
				member.setNote(object.getNote());
			}
		}
		memberRepository.save(object);
	}

	@RequestMapping(value = path + "/fetch", method = RequestMethod.GET)
	public List<FevMember> getAllFetch(HttpServletRequest request, HttpServletResponse resp) {

		// TODO Auto-generated method stub
		return (List<FevMember>) memberRepository.findAll();
	}
}