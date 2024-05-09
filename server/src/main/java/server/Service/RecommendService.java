package server.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import server.Database.RecommendRepository;
import server.Entity.Recommend;
import server.Response.ResponseText;

import java.util.List;
import java.util.Optional;

@Service
public class RecommendService {

    @Autowired
    private final RecommendRepository recommendRepository;

    public RecommendService(RecommendRepository recommendRepository) {
        this.recommendRepository = recommendRepository;
    }

    public List<Recommend> listRecommends(){
        return recommendRepository.findAll();
    }

    public Optional<Recommend> getRecommendById(int id){
        return recommendRepository.findById(id);
    }

    public int deleteRecommend(int id){
        recommendRepository.deleteById(id);
        return id;
    }

    public long createRecommend(Recommend recommend){
        recommendRepository.save(recommend);
        return recommend.getId();
    }


    public ResponseEntity<ResponseText> updateRecommend(Long id, Recommend recommend){

        return new ResponseEntity<>(new ResponseText("Invalid Input!"), HttpStatus.BAD_REQUEST);
    }
}
