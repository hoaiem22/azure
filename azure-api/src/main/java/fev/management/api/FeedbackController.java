package fev.management.api;

import java.lang.annotation.Inherited;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fev.management.entity.FevAccount;
import fev.management.entity.FevEvent;
import fev.management.entity.FevFeedback;
import fev.management.repository.FeedbackRepository;

@Controller
public class FeedbackController implements BaseController<FevFeedback> {

	/** For logging. */
	private final static Logger LOG = LoggerFactory.getLogger(FeedbackRepository.class);

	private final String path = "/feedbacks";

	@Autowired
	FeedbackRepository feedbackRepository;

	@GetMapping(path = path, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	@Override
	public List<FevFeedback> getAll() {
		return (List<FevFeedback>) feedbackRepository.findAll();
	}

	@GetMapping(path = path + "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	@Override
	public Optional<FevFeedback> getByID(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return feedbackRepository.findById(id);
	}

	// Return total of event
	@GetMapping("/feedbacks/count")
	@ResponseBody
	@Override
	public int getCount() {

		return (int) feedbackRepository.count();
	}

	@DeleteMapping(path = path + "/{id}")
	@ResponseBody
	@Override
	public void deleteByID(@PathVariable("id") int id) {

		feedbackRepository.deleteById(id);
	}

	// CREATE
	// Create new Event
	@PostMapping(path = path)
	@ResponseBody
	@Override
	public void create(@RequestBody FevFeedback object) {
		// TODO Auto-generated method stub
		if (feedbackRepository.findById(object.getId()) != null) {
			LOG.info("{} is exist!", object.getId());
			return;
		}
		feedbackRepository.save(object);
	}

	// UPDATE
	// Create new Event
	@PutMapping(path = path)
	@ResponseBody
	@Override
	public void update(@RequestBody FevFeedback object, @PathVariable("id") int id) {
		// TODO Auto-generated method stub
		FevFeedback feedback = feedbackRepository.findById(id).get();
		if (feedback == null) {
			return;
		} else {
			if (object.getContent() != null) {
				feedback.setContent(object.getContent());
			}
			if (object.getSender() != null) {
				feedback.setSender(object.getSender());
			}
			if (object.getStatus() != null) {
				feedback.setStatus(object.getStatus());
			}
			if (object.getNote() != null) {
				feedback.setNote(object.getNote());
			}
		}
		feedbackRepository.save(feedback);
	}

}
