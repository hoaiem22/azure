package fev.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fev.management.entity.FevEvent;
import fev.management.entity.FevTransaction;

@Repository
public interface TransactionRepository extends CrudRepository<FevTransaction, Integer> {

    //Get all transtion with custom query
    @Query(nativeQuery = true, value = "select t.id, tt.type, t.content, t.money, e.name, m.fullname, t.note from fev_transaction t\r\n" + 
            "inner join fev_transaction_type tt on tt.id = t.type\r\n" + 
            "inner join fev_event e on e.id = t.event\r\n" + 
            "inner join fev_member m on m.id = t.burden")
    List<Object[]> getAll();
}
