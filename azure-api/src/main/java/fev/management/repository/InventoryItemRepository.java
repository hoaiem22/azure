package fev.management.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fev.management.entity.FevEvent;
import fev.management.entity.FevInventoryItem;
import fev.management.entity.FevInventoryStatus;

@Repository
public interface InventoryItemRepository extends CrudRepository<FevInventoryItem, Integer> {

    //Find inventory Item by name
    @Query(nativeQuery = true, value = "select * from fev_inventory_item where name = :name")
    FevInventoryItem findByName(@Param("name") String name);
}
