package fev.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fev.management.entity.FevEvent;
import fev.management.entity.FevInventory;

@Repository
public interface InventoryRepository extends CrudRepository<FevInventory, Integer> {

    //Get all inventory with custom query
    @Query(nativeQuery = true, value = "select i.id, ii.name, i.quantity, m.fullname, `is`.status, i.note from fev_inventory i\r\n" + 
            "inner join fev_inventory_item ii on ii.id = i.item\r\n" + 
            "inner join fev_member m on m.id = i.holder\r\n" + 
            "inner join fev_inventory_status `is` on `is`.id = i.status")
    List<Object[]> getAll();
}
