package fev.management.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fev.management.entity.FevEvent;
import fev.management.entity.FevMemberPosition;

@Repository
public interface MemberPositionRepository extends CrudRepository<FevMemberPosition, Integer> {
    
    @Query(nativeQuery =true, value = "select * from fptueventclub.fev_member_position where position = :position")
    FevMemberPosition findByPosition(@Param("position") String position);
}
