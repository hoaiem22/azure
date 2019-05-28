package fev.management.api;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import fev.management.entity.FevAccount;
import fev.management.entity.FevInventoryStatus;
import fev.management.repository.InventoryStatusRepository;

@Controller
public class InventoryStatusController implements BaseController<FevInventoryStatus> {

	/** For logging. */
	private final static Logger LOG = LoggerFactory.getLogger(EventController.class);

	private final String path = "/inventory/status";

	@Autowired
	InventoryStatusRepository inventoryStatusRepository;

	// GET
	// Display all album
	@GetMapping(path)
	@ResponseBody
	@Override
	public List<FevInventoryStatus> getAll() {
		// TODO Auto-generated method stub
		return (List<FevInventoryStatus>) inventoryStatusRepository.findAll();
	}

	// Get Album By ID
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

	// Get Event By ID
	@DeleteMapping(path + "/{id}")
	@ResponseBody
	@Override
	public void deleteByID(@PathVariable("id") int id) {
		inventoryStatusRepository.deleteById(id);

	}

	@PostMapping(path + "/{inveItemStatus}")
	@ResponseBody
	@Override
	public void create(@PathVariable("inveStatus") FevInventoryStatus object) {
		// TODO Auto-generated method stub
		inventoryStatusRepository.save(object);
	}

	// Create new Event
	@PutMapping(path + "/{inveItemStatus}")
	@ResponseBody
	@Override
	public void update(@RequestBody FevInventoryStatus object, @PathVariable("id") int id) {
		// TODO Auto-generated method stub
		inventoryStatusRepository.save(object);
	}
}
