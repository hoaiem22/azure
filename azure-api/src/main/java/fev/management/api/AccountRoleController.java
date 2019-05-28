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
import fev.management.entity.FevAccountRole;
import fev.management.repository.AccountRoleRepository;

@Controller
public class AccountRoleController implements BaseController<FevAccountRole> {

	/** For logging. */
	private final static Logger LOG = LoggerFactory.getLogger(EventController.class);

	private final String path = "/account/roles";

	@Autowired
	AccountRoleRepository accountRoleRepository;

	// GET
	// Display all album
	@GetMapping(path = path, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@Override
	public List<FevAccountRole> getAll() {
		// TODO Auto-generated method stub
		return (List<FevAccountRole>) accountRoleRepository.findAll();
	}

	// Get account role By ID
	@GetMapping(path = path + "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@Override
	public Optional<FevAccountRole> getByID(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return accountRoleRepository.findById(id);
	}

	@GetMapping(path + "/count")
	@ResponseBody
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return (int) accountRoleRepository.count();
	}

	// Delete account role By ID
	@DeleteMapping(path = path + "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@Override
	public void deleteByID(@PathVariable("id") int id) {
		accountRoleRepository.deleteById(id);

	}

	// Create new Account Role
	@PostMapping(path = path, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	@Override
	public void create(@RequestBody FevAccountRole object) {
		// TODO Auto-generated method stub
		if (accountRoleRepository.findById(object.getId()).get() != null) {
			LOG.info("{} is exist!", object.getId());
			return;
		}
		accountRoleRepository.save(object);
	}

	// Update Account role
	@PutMapping(path = path + "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	@Override
	public void update(@RequestBody FevAccountRole object, @PathVariable("id") int id) {
		// TODO Auto-generated method stub
		FevAccountRole accountRole = accountRoleRepository.findById(id).get();
		if (accountRole == null) {
			return;
		} else {
			if (object.getRole() != null) {
				accountRole.setRole(object.getRole());
			}
			if (object.getNote() != null) {
				accountRole.setNote(object.getNote());
			}
		}
		accountRoleRepository.save(accountRole);
	}
}