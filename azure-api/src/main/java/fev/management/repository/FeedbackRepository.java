package fev.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fev.management.entity.FevEvent;
import fev.management.entity.FevFeedback;

@Repository
public interface FeedbackRepository extends CrudRepository<FevFeedback, Integer> {

    //Get all feedback with custom query
    @Query(nativeQuery = true, value = "select f.id, f.sender, f.content, fs.status, f.note from fev_feedback f \r\n" + 
            "inner join fev_feedback_status fs on fs.id = f.status")
    List<Object[]> getAll();
}
