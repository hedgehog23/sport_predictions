package com.sport.predictions.core.mapper;

import com.sport.predictions.core.dto.Prediction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author sergeylapko
 */
@Mapper(componentModel = "spring")
public interface PredictionMapper {
    @Mapping(source = "event.id", target = "eventId")
    @Mapping(source = "userPlayer.id", target = "userPlayerId")
    Prediction toDto(com.sport.predictions.core.model.Prediction entity);

    @Mapping(source = "eventId", target = "event.id")
    @Mapping(source = "userPlayerId", target = "userPlayer.id")
    com.sport.predictions.core.model.Prediction toEntity(Prediction dto);
}
