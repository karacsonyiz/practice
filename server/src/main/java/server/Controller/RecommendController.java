package server.Controller;

import org.springframework.web.bind.annotation.RestController;
import server.Service.RecommendService;

@RestController
public class RecommendController {

    private final RecommendService recommendService;

    public RecommendController(RecommendService recommendService) {
        this.recommendService = recommendService;
    }
}
