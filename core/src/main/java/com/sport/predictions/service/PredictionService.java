package com.sport.predictions.service;

import com.sport.predictions.dto.Prediction;
import com.sport.predictions.mapper.PredictionMapper;
import com.sport.predictions.repository.PredictionRepository;
import org.springframework.stereotype.Service;

/**
 * @author sergeylapko
 */
@Service
public class PredictionService {
    private final PredictionMapper mapper;

    private final PredictionRepository repository;

    public PredictionService(PredictionMapper mapper, PredictionRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public Prediction createPrediction(Prediction prediction) {
        return mapper.toDto(repository.save(mapper.toEntity(prediction)));
    }
}
