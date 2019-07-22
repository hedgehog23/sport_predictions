package com.sport.predictions.core.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

/**
 * @author sergeylapko
 */
@Getter
@Setter
public class Event {
    private Integer id;

    private String name;

    private Integer homeTeamId;

    private Integer awayTeamId;

    private OffsetDateTime startTime;

    private Integer tournamentId;

    private Integer round;

    private String status;
}
