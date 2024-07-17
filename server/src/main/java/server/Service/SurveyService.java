package server.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import server.Database.SurveyRepository;
import server.Entity.Survey;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyService {

    private final SurveyRepository surveyRepository;
    public static final Logger LOGGER = LoggerFactory.getLogger(ReportService.class);

    public SurveyService(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    public List<Survey> listSurveys(){
        return surveyRepository.findAll();
    }

    public Optional<Survey> getSurveyById(Long id){
        return surveyRepository.findById(id);
    }

    
}
