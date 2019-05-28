package fev.management.api;

import java.lang.annotation.Inherited;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fev.management.entity.FevEvent;
import fev.management.entity.FevFeedback;

@RequestMapping("/api")
public interface BaseController<Object> {

    // GET
    // Display all event
    public abstract List<Object> getAll();

    // Get Event By ID
    public abstract Optional<Object> getByID(@PathVariable("id") int id);

    //Get total
    public abstract int getCount();
    
    // DELETE
    // Get Event By ID
    public abstract void deleteByID( int id);
    
    //CREATE
    public abstract void create(Object object);
    
    //UPDATE
    public abstract void update(Object object, @PathVariable("id") int id);

}
