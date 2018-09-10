package com.sport.predictions.mapper;

import com.sport.predictions.model.Prediction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author sergeylapko
 */
@Mapper(componentModel = "spring")
public interface PredictionMapper {
    @Mapping(source = "event.id", target = "eventId")
    @Mapping(source = "userPlayer.id", target = "userPlayerId")
    com.sport.predictions.dto.Prediction toDto(Prediction entity);

    @Mapping(source = "eventId", target = "event.id")
    @Mapping(source = "userPlayerId", target = "userPlayer.id")
    Prediction toEntity(com.sport.predictions.dto.Prediction dto);
}
