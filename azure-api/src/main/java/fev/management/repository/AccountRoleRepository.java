package fev.management.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fev.management.entity.FevAccountRole;

@Repository
public interface AccountRoleRepository extends CrudRepository<FevAccountRole, Integer> {

    @Query(nativeQuery = true, value = "select * from fptueventclub.fev_account_role where role = :role")
    FevAccountRole findByRole(@Param("role") String role);
}
