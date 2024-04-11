package server.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import server.Database.ReportRepository;
import server.Entity.Report;

import java.util.List;
import java.util.Optional;

@Service
public class ReportService {

    private final ReportRepository reportRepository;
    public static final Logger LOGGER = LoggerFactory.getLogger(ReportService.class);

    public ReportService(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    public List<Report> listReports(){
        return reportRepository.findAll();
    }

    public Optional<Report> getReportById(int id){
        return reportRepository.findById(id);
    }

    public long createReport(Report report){
        reportRepository.save(report);
        LOGGER.info("Report Created with id : " + report.getId());
        return report.getId();
    }

    public int deleteReport(int id){
        reportRepository.deleteById(id);
        LOGGER.info("Report Deleted with id : " + id);
        return id;
    }
}
