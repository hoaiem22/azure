package fev.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fev.management.entity.FevEvent;
import fev.management.entity.FevEventMember;

@Repository
public interface EventMemberRepository extends CrudRepository<FevEventMember, Integer> {

    //Get all event member with custom query
    @Query(nativeQuery = true, value = "select em.id, e.name, m.fullname, em.note from fev_event_member em\r\n" + 
            "inner join fev_event e on e.id = em.event\r\n" + 
            "inner join fev_member m on m.id = em.member")
    List<Object[]> getAll();
}
