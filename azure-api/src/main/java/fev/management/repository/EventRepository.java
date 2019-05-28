package fev.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fev.management.entity.FevEvent;

@Repository
public interface EventRepository extends CrudRepository<FevEvent, Integer> {
    
    //Get all Event with custom query
    @Query(nativeQuery = true, value = "select e.id, e.name, e.start, e.end, e.time, e.place, m.fullname, e.note from fev_event e\r\n" + 
            "    inner join fev_member m on m.id = e.leader;")
    List<Object[]> getAll();
    
    //Find event by event's name
    @Query(nativeQuery = true, value = "select * from fev_event where name = :name")
    FevEvent findByName(@Param("name") String name);
}
