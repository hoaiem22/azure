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
import fev.management.entity.FevMemberPosition;
import fev.management.entity.FevTransactionType;
import fev.management.repository.TransactionTypeRepository;

@Controller
public class TransactionTypeController implements BaseController<FevTransactionType,FevTransactionType> {

	/** For logging. */
	private final static Logger LOG = LoggerFactory.getLogger(EventController.class);

	private final String path = "/transactions/types";

	@Autowired
	TransactionTypeRepository transactionTypeRepository;

	// GET
	// Display all transaction type
	@GetMapping(path)
	@ResponseBody
	@Override
	public List<FevTransactionType> getAll() {
		// TODO Auto-generated method stub
		return (List<FevTransactionType>) transactionTypeRepository.findAll();
	}

	// Get transaction type By ID
	@GetMapping(path + "/{id}")
	@ResponseBody
	@Override
	public Optional<FevTransactionType> getByID(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return transactionTypeRepository.findById(id);
	}

	@GetMapping(path + "/count")
	@ResponseBody
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return (int) transactionTypeRepository.count();
	}

	// Get transaction type By ID
	@DeleteMapping(path + "/{id}")
	@ResponseBody
	@Override
	public void deleteByID(@PathVariable("id") int id) {
		transactionTypeRepository.deleteById(id);

	}

	// Create new transaction type
	@PostMapping(path)
	@ResponseBody
	@Override
	public void create(@RequestBody FevTransactionType object) {
		// TODO Auto-generated method stub
		transactionTypeRepository.save(object);
	}

	// Update transaction type
	@PutMapping(path = path + "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	@Override
	public void update(@RequestBody FevTransactionType object, @PathVariable("id") int id) {
		// TODO Auto-generated method stub
		FevTransactionType transactionType = transactionTypeRepository.findById(id).get();
		if (transactionType == null) {
			return;
		} else {
			if (object.getType() != null) {
				transactionType.setType(object.getType());
			}
			if (object.getNote() != null) {
				transactionType.setNote(object.getNote());
			}
		}
		transactionTypeRepository.save(object);
	}
}