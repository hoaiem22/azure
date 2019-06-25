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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fev.management.entity.FevAccount;
import fev.management.repository.AccountRepository;
import fev.management.service.UserService;

@Controller
public class AccountController implements BaseController<FevAccount, FevAccount> {

	/** For logging. */
	private final static Logger LOG = LoggerFactory.getLogger(EventController.class);

	private final String path = "/accounts";

	@Autowired
	AccountRepository accountRepository;

	@Autowired
	private UserService userService;

	// GET
	// Get all account
	@GetMapping(path = path, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@Override
	public List<FevAccount> getAll() {
		// TODO Auto-generated method stub
		return (List<FevAccount>) accountRepository.findAll();
	}

	// Get account By ID
	@GetMapping(path = path + "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@Override
	public Optional<FevAccount> getByID(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return accountRepository.findById(id);
	}

	@GetMapping(path + "/count")
	@ResponseBody
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return (int) accountRepository.count();
	}

	// Delete account by id
	@DeleteMapping(path = path + "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	@Override
	public void deleteByID(@PathVariable("id") int id) {
		accountRepository.deleteById(id);

	}

	// Create new account
	@PostMapping(path = path, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	@Override
	public void create(@RequestBody FevAccount object) {
		// TODO Auto-generated method stub
		if (accountRepository.findByUsername(object.getUsername()) != null) {
			LOG.info("{} is exist!", object.getId());
			return;
		}
		accountRepository.save(object);
	}

	// Update account
	@PutMapping(path = path + "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public void update(@RequestBody FevAccount object, @PathVariable("id") int id) {
		// TODO Auto-generated method stub
		FevAccount account = accountRepository.findById(id).get();
		if (account == null) {
			return;
		} else {
			if (object.getPassword() != null) {
				account.setPassword(object.getPassword());
			}
			if (object.getRole() != null) {
				account.setRole(object.getRole());
			}
			if (object.getNote() != null) {
				account.setNote(object.getNote());
			}
		}
		accountRepository.save(account);
	}

	@RequestMapping(value = path + "/checkLogin/username={username}&password={password}", method = RequestMethod.POST)
	@ResponseBody
	public boolean checkLogin(@PathVariable("username") String username, @PathVariable("password") String password) {
		// TODO Auto-generated method stub

		return userService.checkLogin(username, password);
	}

	@RequestMapping(value = path + "/checkLogin/username={username}&password={password}", method = RequestMethod.GET)
	@ResponseBody
	public boolean checkLogin2(@PathVariable("username") String username, @PathVariable("password") String password) {
		// TODO Auto-generated method stub

		return userService.checkLogin(username, password);
	}

}