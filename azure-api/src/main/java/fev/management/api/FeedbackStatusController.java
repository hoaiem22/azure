package fev.management.api;

import java.util.List;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import fev.management.entity.FevAccount;
import fev.management.entity.FevFeedbackStatus;
import fev.management.entity.FevFeedbackStatus;
import fev.management.repository.EventMemberRepository;
import fev.management.repository.FeedbackStatusRepository;

@Controller
public class FeedbackStatusController implements BaseController<FevFeedbackStatus,FevFeedbackStatus>{

    /** For logging. */
    private final static Logger LOG = LoggerFactory.getLogger(EventController.class);

    private final String path = "/feedbacks/status";

    @Autowired
    FeedbackStatusRepository feedbackStatusRepository;

    // GET
    // Display all feedback status
    @GetMapping(path)
    @ResponseBody
    @Override
    public List<FevFeedbackStatus> getAll() {
        // TODO Auto-generated method stub
        return (List<FevFeedbackStatus>) feedbackStatusRepository.findAll();
    }

    // Get feedback status By ID
    @GetMapping(path + "/{id}")
    @ResponseBody
    @Override
    public Optional<FevFeedbackStatus> getByID(@PathVariable("id") int id) {
        // TODO Auto-generated method stub
        return feedbackStatusRepository.findById(id);
    }

    @GetMapping(path + "/count")
    @ResponseBody
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return (int) feedbackStatusRepository.count();
    }

    // Delete feedback status By ID
    @DeleteMapping(path + "/{id}")
    @ResponseBody
    @Override
    public void deleteByID(@PathVariable("id") int id) {
        // TODO Auto-generated method stub
        feedbackStatusRepository.deleteById(id);
    }

    //Add new feedback status
    @PostMapping(path)
    @ResponseBody
    @Override
    public void create(@RequestBody FevFeedbackStatus object) {
        // TODO Auto-generated method stub
        feedbackStatusRepository.save(object);
    }

    // Update feedback status
    @PutMapping(path = path + "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    @Override
    public void update(@RequestBody FevFeedbackStatus object, @PathVariable("id") int id) {
        // TODO Auto-generated method stub
    	FevFeedbackStatus fbStatus = feedbackStatusRepository.findById(id).get();
		if (fbStatus == null) {
			return;
		} else {
			if (object.getStatus() != null) {
				fbStatus.setStatus(object.getStatus());
			}
			if (object.getNote() != null) {
				fbStatus.setNote(object.getNote());
			}
		}
        feedbackStatusRepository.save(object);
    }
}
