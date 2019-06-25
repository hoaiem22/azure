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
import fev.management.entity.FevInventory;
import fev.management.repository.InventoryRepository;


@Controller
public class InventoryController implements BaseController<FevInventory,FevInventory> {

    /** For logging. */
    private final static Logger LOG = LoggerFactory.getLogger(EventController.class);

    private final String path = "/inventory";

    @Autowired
    InventoryRepository inventoryRepository;

    // GET
    // Display all inventory
    @GetMapping(path)
    @ResponseBody
    @Override
    public List<FevInventory> getAll() {
        // TODO Auto-generated method stub
        return (List<FevInventory>) inventoryRepository.findAll();
    }

    // Get inventory By ID
    @GetMapping(path + "/{id}")
    @ResponseBody
    @Override
    public Optional<FevInventory> getByID(@PathVariable("id") int id) {
        // TODO Auto-generated method stub
        return inventoryRepository.findById(id);
    }

    @GetMapping(path + "/count")
    @ResponseBody
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return (int) inventoryRepository.count();
    }

    // Get inventory By ID
    @DeleteMapping(path + "/{id}")
    @ResponseBody
    @Override
    public void deleteByID(@PathVariable("id") int id) {
        inventoryRepository.deleteById(id);

    }

    // Add new inventory
    @PostMapping(path)
    @ResponseBody
    @Override
    public void create(@RequestBody FevInventory object) {
        // TODO Auto-generated method stub
        inventoryRepository.save(object);
    }

    // Update inventory
    @PutMapping(path = path + "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    @Override
    public void update(@RequestBody FevInventory object, @PathVariable("id") int id) {
        // TODO Auto-generated method stub
    	FevInventory inventory = inventoryRepository.findById(id).get();
		if (inventory == null) {
			return;
		} else {
			if (object.getItem() != null) {
				inventory.setItem(object.getItem());
			}
			if (object.getQuantity() != null) {
				inventory.setQuantity(object.getQuantity());
			}
			if (object.getHolder() != null) {
				inventory.setHolder(object.getHolder());
			}
			if (object.getStatus() != null) {
				inventory.setStatus(object.getStatus());
			}
			if (object.getNote() != null) {
				inventory.setNote(object.getNote());
			}
		}
        inventoryRepository.save(object);
    }

}
