package fev.management.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fev.management.entity.FevEvent;
import fev.management.entity.FevInventoryStatus;

@Repository
public interface InventoryStatusRepository extends CrudRepository<FevInventoryStatus, Integer> {

    //Find inventory Status by status
    @Query(nativeQuery = true, value = "select * from fev_inventory_status where status = :status")
    FevInventoryStatus findByStatus(@Param("status") String status);
}
