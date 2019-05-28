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
import fev.management.entity.FevInventory;
import fev.management.repository.InventoryRepository;


@Controller
public class InventoryController implements BaseController<FevInventory> {

    /** For logging. */
    private final static Logger LOG = LoggerFactory.getLogger(EventController.class);

    private final String path = "/inventory";

    @Autowired
    InventoryRepository inventoryRepository;

    // GET
    // Display all album
    @GetMapping(path)
    @ResponseBody
    @Override
    public List<FevInventory> getAll() {
        // TODO Auto-generated method stub
        return (List<FevInventory>) inventoryRepository.findAll();
    }

    // Get Album By ID
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

    // Get Event By ID
    @DeleteMapping(path + "/{id}")
    @ResponseBody
    @Override
    public void deleteByID(@PathVariable("id") int id) {
        inventoryRepository.deleteById(id);

    }

    @PostMapping(path + "/{album}")
    @ResponseBody
    @Override
    public void create(@PathVariable("album") FevInventory object) {
        // TODO Auto-generated method stub
        inventoryRepository.save(object);
    }

    // Create new Event
    @PutMapping(path + "/{album}")
    @ResponseBody
    @Override
    public void update(@RequestBody FevInventory object, @PathVariable("id") int id) {
        // TODO Auto-generated method stub
        inventoryRepository.save(object);
    }

}
