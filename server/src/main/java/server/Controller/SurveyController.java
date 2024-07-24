package server.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import server.Entity.Survey;
import server.Service.SurveyService;

@Controller
public class SurveyController {

    private final SurveyService surveyService;

    public SurveyController(SurveyService surveyService) {
        this.surveyService = surveyService;
    }

    @RequestMapping(value = "/createsurvey", method = RequestMethod.POST)
    public long createSurvey(@RequestBody Survey survey) {
        return surveyService.createSurvey(survey);
    }

    @RequestMapping(value = "/deletesurvey", method = RequestMethod.GET)
    public Long deleteSurvey(@PathVariable Long id) {
        return surveyService.deleteSurvey(id);
    }

    @RequestMapping(value = "/getsurvey", method = RequestMethod.GET)
    public Survey getSurvey(@PathVariable Long id) {
        return surveyService.getSurveyById(id).get();
    }




}
