package com.sport.predictions.repository;

import com.sport.predictions.model.Prediction;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * @author sergeylapko
 */
@Transactional(Transactional.TxType.MANDATORY)
public interface PredictionRepository extends JpaRepository<Prediction, Integer> {
}
