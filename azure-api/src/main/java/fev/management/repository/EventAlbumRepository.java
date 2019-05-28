package fev.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fev.management.entity.FevAccount;
import fev.management.entity.FevEvent;
import fev.management.entity.FevEventAlbum;

@Repository
public interface EventAlbumRepository extends CrudRepository<FevEventAlbum, Integer> {
    
    //Find album by event ID
    @Query(nativeQuery = true, value = "SELECT id, event, img FROM fptueventclub.fev_event_album\r\n" + 
            "where event = :id")
    List<FevEventAlbum> getAlbumByID(@Param("id") String id);
    
    
    //Get event album with custom query
    @Query(nativeQuery = true, value = "select ea.id, e.name, ea.img from fev_event_album ea\r\n" + 
            "inner join fev_event e on ea.event = e.id")
    List<Object[]> getAll();
}
