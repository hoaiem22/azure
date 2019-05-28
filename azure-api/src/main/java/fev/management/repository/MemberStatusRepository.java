package fev.management.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fev.management.entity.FevEvent;
import fev.management.entity.FevMemberStatus;

@Repository
public interface MemberStatusRepository extends CrudRepository<FevMemberStatus, Integer> {

    @Query(nativeQuery = true, value = "select * from fptueventclub.fev_member_status where status = :status")
    FevMemberStatus findByStatus(@Param("status") String status);
}
