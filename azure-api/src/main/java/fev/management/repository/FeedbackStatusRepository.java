package fev.management.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fev.management.entity.FevFeedbackStatus;

@Repository
public interface FeedbackStatusRepository extends CrudRepository<FevFeedbackStatus, Integer> {

    //Find feedback Status by status
    @Query(nativeQuery = true, value = "select * from fev_feedback_status where status = :status")
    FevFeedbackStatus findByStatus(@Param("status") String status);
}
