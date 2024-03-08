package server.Controller;

import org.springframework.web.bind.annotation.RestController;
import server.Service.FeedbackService;

@RestController
public class FeedbackController {

    private FeedbackService feedbackService;

    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }


}
