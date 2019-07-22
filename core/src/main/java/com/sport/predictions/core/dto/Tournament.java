package com.sport.predictions.core.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

/**
 * @author sergeylapko
 */
@Getter
@Setter
public class Tournament {
    private Integer id;

    private String name;

    private String type;

    private String season;

    private OffsetDateTime startTime;

    private OffsetDateTime endTime;
}
