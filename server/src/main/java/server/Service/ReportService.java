package server.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import server.Database.ReportRepository;
import server.Entity.Report;

import java.util.List;

@Service
public class ReportService {

    private final ReportRepository reportRepository;
    public static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    public ReportService(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    public List<Report> listReports(){
        return reportRepository.findAll();
    }
}
