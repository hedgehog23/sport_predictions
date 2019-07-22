package com.sport.predictions.core.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

/**
 * @author sergeylapko
 */
@Getter
@Setter
public class Prediction {
    private Integer id;

    private Integer userPlayerId;

    private Integer homeScore;

    private Integer awayScore;

    private Integer eventId;

    private OffsetDateTime creationTime;
}
