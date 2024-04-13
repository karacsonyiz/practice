package server.Controller;

import org.springframework.web.bind.annotation.*;
import server.Entity.Report;
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

    @RequestMapping("/report/{id}")
    public Report getReport(@PathVariable int id){
        if(reportService.getReportById(id).isPresent()){
            return reportService.getReportById(id).get();
        }
        return null;
    }

    @RequestMapping(value = "/createreport", method = RequestMethod.POST)
    public long createReport(@RequestBody Report report) {
        return reportService.createReport(report);
    }

    @RequestMapping("/report/delete/{id}")
    public int deleteReport(@PathVariable int id){
        return reportService.deleteReport(id);
    }





}
