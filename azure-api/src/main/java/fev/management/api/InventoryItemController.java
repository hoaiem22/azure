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
import fev.management.entity.FevInventoryItem;
import fev.management.repository.InventoryItemRepository;


@Controller
public class InventoryItemController implements BaseController<FevInventoryItem> {

    /** For logging. */
    private final static Logger LOG = LoggerFactory.getLogger(EventController.class);

    private final String path = "/inventory/items";

    @Autowired
    InventoryItemRepository inventoryItemRepository;

    // GET
    // Display all inventory item
    @GetMapping(path)
    @ResponseBody
    @Override
    public List<FevInventoryItem> getAll() {
        // TODO Auto-generated method stub
        return (List<FevInventoryItem>) inventoryItemRepository.findAll();
    }

    // Get inventory item By ID
    @GetMapping(path + "/{id}")
    @ResponseBody
    @Override
    public Optional<FevInventoryItem> getByID(@PathVariable("id") int id) {
        // TODO Auto-generated method stub
        return inventoryItemRepository.findById(id);
    }

    @GetMapping(path + "/count")
    @ResponseBody
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return (int) inventoryItemRepository.count();
    }

    // Delete inventory item By ID
    @DeleteMapping(path + "/{id}")
    @ResponseBody
    @Override
    public void deleteByID(@PathVariable("id") int id) {
        inventoryItemRepository.deleteById(id);

    }

    //Add new inventory item
    @PostMapping(path)
    @ResponseBody
    @Override
    public void create(@RequestBody FevInventoryItem object) {
        // TODO Auto-generated method stub
        inventoryItemRepository.save(object);
    }

    // Create new inventory item
    @PutMapping(path = path + "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    @Override
    public void update(@RequestBody FevInventoryItem object, @PathVariable("id") int id) {
        // TODO Auto-generated method stub
    	FevInventoryItem inventoryItem = inventoryItemRepository.findById(id).get();
		if (inventoryItem == null) {
			return;
		} else {
			if (object.getName() != null) {
				inventoryItem.setName(object.getName());
			}
			if (object.getAddress() != null) {
				inventoryItem.setAddress(object.getAddress());
			}
			if (object.getPrice() != null) {
				inventoryItem.setPrice(object.getPrice());
			}
			if (object.getNote() != null) {
				inventoryItem.setNote(object.getNote());
			}
		}
        inventoryItemRepository.save(object);
    }

}
