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
import fev.management.entity.FevTransaction;
import fev.management.repository.TransactionRepository;

@Controller
public class TransactionController implements BaseController<FevTransaction> {

    /** For logging. */
    private final static Logger LOG = LoggerFactory.getLogger(EventController.class);

    private final String path = "/transactions";

    @Autowired
    TransactionRepository transactionRepository;

    // GET
    // Display all album
    @GetMapping(path)
    @ResponseBody
    @Override
    public List<FevTransaction> getAll() {
        // TODO Auto-generated method stub
        return (List<FevTransaction>) transactionRepository.findAll();
    }

    // Get Album By ID
    @GetMapping(path + "/{id}")
    @ResponseBody
    @Override
    public Optional<FevTransaction> getByID(@PathVariable("id") int id) {
        // TODO Auto-generated method stub
        return transactionRepository.findById(id);
    }

    @GetMapping(path + "/count")
    @ResponseBody
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return (int) transactionRepository.count();
    }

    // Get Event By ID
    @DeleteMapping(path + "/{id}")
    @ResponseBody
    @Override
    public void deleteByID(@PathVariable("id") int id) {
        transactionRepository.deleteById(id);

    }

    @PostMapping(path + "/{transaction}")
    @ResponseBody
    @Override
    public void create(@PathVariable("transaction") FevTransaction object) {
        // TODO Auto-generated method stub
        transactionRepository.save(object);
    }

    // Create new Event
    @PutMapping(path + "/{transaction}")
    @ResponseBody
    @Override
    public void update(@RequestBody FevTransaction object, @PathVariable("id") int id) {
        // TODO Auto-generated method stub
        transactionRepository.save(object);
    }
}