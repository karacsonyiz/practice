package server.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import server.Entity.Recommend;
import server.Response.ResponseText;
import server.Service.RecommendService;

import java.util.List;

@RestController
public class RecommendController {

    private final RecommendService recommendService;

    public RecommendController(RecommendService recommendService) {
        this.recommendService = recommendService;
    }

    @RequestMapping("/recommends")
    public List<Recommend> listRecommendations(){
        return recommendService.listRecommends();
    }

    @RequestMapping("/recommends/{id}")
    public Recommend getRecommendation(@PathVariable int id){
        if(recommendService.getRecommendById(id).isPresent()){
            return recommendService.getRecommendById(id).get();
        }
        return null;
    }

    @RequestMapping(value = "/createrecommend", method = RequestMethod.POST)
    public long createRecommendation(@RequestBody Recommend recommend) {
        return recommendService.createRecommend(recommend);
    }

    @RequestMapping("/recommend/delete/{id}")
    public int deleteRecommendation(@PathVariable int id){
        return recommendService.deleteRecommend(id);
    }

    @RequestMapping("/recommend/update/{id}")
    public ResponseEntity<ResponseText> updateRecommendation(@RequestBody Recommend recommend, @PathVariable Long id){
        return recommendService.updateRecommend(id,recommend);
    }


}
