package server.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import server.Entity.Feedback;
import server.Entity.User;
import server.Response.ResponseText;
import server.Service.FeedbackService;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class FeedbackController {

    private final FeedbackService feedbackService;

    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @RequestMapping("/feedbacks")
    public List<Feedback> listFeedbacks(){
        return feedbackService.listFeedbacks();
    }

    @RequestMapping("/feedback/{id}")
    public Feedback getFeedback(@PathVariable Long id){
        if(feedbackService.getFeedbackById(id).isPresent()){
            return feedbackService.getFeedbackById(id).get();
        }
        return null;
    }

    @RequestMapping(value = "/createfeedback", method = RequestMethod.POST)
    public long createFeedback(@RequestBody Feedback feedback) {
        return feedbackService.createFeedback(feedback);
    }

    @RequestMapping("/feedback/delete/{id}")
    public Long deleteFeedback(@PathVariable Long id){
        return feedbackService.deleteFeedback(id);
    }

    @RequestMapping("/feedback/update/{id}")
    public ResponseEntity<ResponseText> updateFeedback(@RequestBody Feedback feedback, @PathVariable Long id){
        return feedbackService.updateFeedback(id,feedback);
    }
    @RequestMapping("/feedback/test")
    public ResponseEntity<ResponseText> testFeedback(){
            return feedbackService.testFeedback();
        }
}
