package server.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import server.Database.FeedbackRepository;
import server.Database.UserRepository;
import server.Entity.Feedback;
import server.Entity.User;
import server.Response.ResponseText;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class FeedbackService {

    @Autowired
    private final FeedbackRepository feedbackRepository;
    private final UserRepository userRepository;
    public static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    public FeedbackService(FeedbackRepository feedbackRepository, UserRepository userRepository) {
        this.feedbackRepository = feedbackRepository;
        this.userRepository = userRepository;
    }

    public List<Feedback> listFeedbacks(){
        return feedbackRepository.findAll();
    }

    public Optional<Feedback> getFeedbackById(Long id){
        return feedbackRepository.findById(id);
    }

    public Long deleteFeedback(Long id){
        feedbackRepository.deleteById(id);
        LOGGER.info("Feedback Deleted with id : " + id);
        return id;
    }

    public long createFeedback(Feedback feedback){
        feedbackRepository.save(feedback);
        LOGGER.info("Feedback Created with id : " + feedback.getId());
        return feedback.getId();
    }

    public ResponseEntity<ResponseText> updateFeedback(Long id, Feedback feedback){

        if(feedbackRepository.findById(id).isPresent()){
            Feedback feedbackToSave = feedbackRepository.findById(id).get();
            feedbackToSave.setRatingDate(feedback.getRatingDate());
            feedbackToSave.setRatingScore(feedback.getRatingScore());
            feedbackToSave.setUser(feedback.getUser());
            feedbackToSave.setRatingText(feedback.getRatingText());
            feedbackToSave.setCanEditOrDelete(feedback.isCanEditOrDelete());
            feedbackRepository.save(feedbackToSave);
            LOGGER.info("Feedback Updated with id : " + feedback.getId());
            return new ResponseEntity<>(new ResponseText("Modification Successful!"), HttpStatus.OK);
        }
        return new ResponseEntity<>(new ResponseText("Invalid Input!"), HttpStatus.BAD_REQUEST);
    }
}
