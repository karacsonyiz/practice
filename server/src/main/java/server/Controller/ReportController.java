package server.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.Entity.Report;
import server.Entity.User;
import server.Service.ReportService;

import java.util.List;

@RestController
public class ReportController {

    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @RequestMapping("/reports")
    public List<Report> listReports() {
        return reportService.listReports();
    }





}
