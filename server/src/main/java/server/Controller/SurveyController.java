package server.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import server.Entity.Survey;
import server.Response.ResponseText;
import server.Service.SurveyService;

import java.util.List;

@Controller
public class SurveyController {

    private final SurveyService surveyService;

    public SurveyController(SurveyService surveyService) {
        this.surveyService = surveyService;
    }

    @RequestMapping("/surveys")
    public List<Survey> listSurveys() {
        return surveyService.listSurveys();
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

    @RequestMapping(value = "/updatesurvey", method = RequestMethod.POST)
    public ResponseEntity<ResponseText> updateSurvey(@RequestBody Survey survey, @PathVariable Long id) {
        return surveyService.updateSurvey(id,survey);
    }


}
