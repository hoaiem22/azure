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
import fev.management.entity.FevFeedbackStatus;
import fev.management.entity.FevInventoryStatus;
import fev.management.repository.InventoryStatusRepository;

@Controller
public class InventoryStatusController implements BaseController<FevInventoryStatus,FevInventoryStatus> {

	/** For logging. */
	private final static Logger LOG = LoggerFactory.getLogger(EventController.class);

	private final String path = "/inventory/status";

	@Autowired
	InventoryStatusRepository inventoryStatusRepository;

	// GET
	// Display all inventory status
	@GetMapping(path)
	@ResponseBody
	@Override
	public List<FevInventoryStatus> getAll() {
		// TODO Auto-generated method stub
		return (List<FevInventoryStatus>) inventoryStatusRepository.findAll();
	}

	// Get inventory status By ID
	@GetMapping(path + "/{id}")
	@ResponseBody
	@Override
	public Optional<FevInventoryStatus> getByID(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return inventoryStatusRepository.findById(id);
	}

	@GetMapping(path + "/count")
	@ResponseBody
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return (int) inventoryStatusRepository.count();
	}

	// Get inventory status By ID
	@DeleteMapping(path + "/{id}")
	@ResponseBody
	@Override
	public void deleteByID(@PathVariable("id") int id) {
		inventoryStatusRepository.deleteById(id);

	}

	//Add new inventory status
	@PostMapping(path)
	@ResponseBody
	@Override
	public void create(@RequestBody FevInventoryStatus object) {
		// TODO Auto-generated method stub
		inventoryStatusRepository.save(object);
	}

	// Update inventory status
	@PutMapping(path = path + "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	@Override
	public void update(@RequestBody FevInventoryStatus object, @PathVariable("id") int id) {
		// TODO Auto-generated method stub
		FevInventoryStatus inStatus = inventoryStatusRepository.findById(id).get();
		if (inStatus == null) {
			return;
		} else {
			if (object.getStatus() != null) {
				inStatus.setStatus(object.getStatus());
			}
			if (object.getNote() != null) {
				inStatus.setNote(object.getNote());
			}
		}
		inventoryStatusRepository.save(object);
	}
}
