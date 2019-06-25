package fev.management.api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;


@RequestMapping("/api")
public interface BaseController<O, I> {

    // GET
    // Display all event
    public abstract List<O> getAll();

    // Get Event By ID
    public abstract Optional<O> getByID(@PathVariable("id") int id);

    //Get total
    public abstract int getCount();
    
    // DELETE
    // Get Event By ID
    public abstract void deleteByID( int id);
    
    //CREATE
    public abstract void create(@RequestBody I i);

    //UPDATE
    public abstract void update(@RequestBody I i, @PathVariable("id") int id);

}
