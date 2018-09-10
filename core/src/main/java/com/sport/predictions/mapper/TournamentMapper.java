package com.sport.predictions.mapper;

import com.sport.predictions.model.Tournament;
import org.mapstruct.Mapper;

/**
 * @author sergeylapko
 */
@Mapper
public interface TournamentMapper {
    com.sport.predictions.dto.Tournament toDto(Tournament entity);

    Tournament toEntity(com.sport.predictions.dto.Tournament dto);
}
