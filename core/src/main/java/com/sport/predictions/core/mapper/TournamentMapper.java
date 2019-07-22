package com.sport.predictions.core.mapper;

import com.sport.predictions.core.model.Tournament;
import org.mapstruct.Mapper;

/**
 * @author sergeylapko
 */
@Mapper
public interface TournamentMapper {
    com.sport.predictions.core.dto.Tournament toDto(Tournament entity);

    Tournament toEntity(com.sport.predictions.core.dto.Tournament dto);
}
