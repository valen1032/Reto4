package com.grupog35.reto3.service;


import com.grupog35.reto3.model.ScoreModel;
import com.grupog35.reto3.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {
    @Autowired
    ScoreRepository scoreRepository;

    public List<ScoreModel> obtener(){
        return scoreRepository.findAll();
    }
    public void crear(ScoreModel score){
        if(!scoreRepository.existsById(score.getIdScore())) {
            scoreRepository.save(score);
        }

    }
}
