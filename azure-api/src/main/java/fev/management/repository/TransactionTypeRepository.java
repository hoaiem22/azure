package fev.management.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fev.management.entity.FevEvent;
import fev.management.entity.FevTransactionType;

@Repository
public interface TransactionTypeRepository extends CrudRepository<FevTransactionType, Integer> {
    
    //Find transaction type by type
    @Query(nativeQuery = true, value = "select * from fev_transaction_type where type = :type")
    FevTransactionType findByType(@Param("type") String type);
}
