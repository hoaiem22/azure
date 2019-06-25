package fev.management.api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;


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
    public abstract void create(@RequestBody Object object);
    
    //UPDATE
    public abstract void update(Object object, @PathVariable("id") int id);

}
