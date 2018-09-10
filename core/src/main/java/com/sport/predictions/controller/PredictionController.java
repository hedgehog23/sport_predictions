package com.sport.predictions.controller;

import com.sport.predictions.dto.Prediction;
import com.sport.predictions.service.PredictionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sergeylapko
 */
@RestController("/prediction")
public class PredictionController {
    private final PredictionService predictionService;

    public PredictionController(PredictionService predictionService) {
        this.predictionService = predictionService;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity createPrediction(@RequestBody Prediction prediction) {
        return ResponseEntity.ok(predictionService.createPrediction(prediction));
    }
}
