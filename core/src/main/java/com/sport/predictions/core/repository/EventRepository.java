package com.sport.predictions.core.repository;

import com.sport.predictions.core.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * @author sergeylapko
 */
@Transactional(Transactional.TxType.MANDATORY)
public interface EventRepository extends JpaRepository<Event, Integer> {
}
