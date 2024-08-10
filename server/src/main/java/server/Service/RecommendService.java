package server.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    public static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

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
        LOGGER.info("Recommend Deleted with id : " + id);
        return id;
    }

    public long createRecommend(Recommend recommend){
        recommendRepository.save(recommend);
        LOGGER.info("Recommend Created with id : " + recommend.getId());
        return recommend.getId();
    }


    public ResponseEntity<ResponseText> updateRecommend(Integer id, Recommend recommend){

        if(recommendRepository.findById(id).isPresent()){
            Recommend recommendToSave = recommendRepository.findById(id).get();
            recommendToSave.setId(id);
            recommendRepository.save(recommendToSave);
            return new ResponseEntity<>(new ResponseText("Modification Successful!"), HttpStatus.OK);
        }
        LOGGER.info("Recommend Modified with id : " + id);
        return new ResponseEntity<>(new ResponseText("Invalid Input!"), HttpStatus.BAD_REQUEST);
    }
}
