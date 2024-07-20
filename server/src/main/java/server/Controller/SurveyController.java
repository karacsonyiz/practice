package server.Controller;

import org.springframework.stereotype.Controller;
import server.Service.SurveyService;

@Controller
public class SurveyController {

    private final SurveyService surveyService;

    public SurveyController(SurveyService surveyService) {
        this.surveyService = surveyService;
    }


}
