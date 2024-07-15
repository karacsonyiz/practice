package server.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import server.Database.SurveyRepository;

@Service
public class SurveyService {

    private final SurveyRepository surveyRepository;
    public static final Logger LOGGER = LoggerFactory.getLogger(ReportService.class);

    public SurveyService(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }
}
