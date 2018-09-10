package com.sport.predictions.mapper;

import com.sport.predictions.model.Event;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author sergeylapko
 */
@Mapper(componentModel = "spring")
public interface EventMapper {
    @Mapping(source = "homeTeam.id", target = "homeTeamId")
    @Mapping(source = "awayTeam.id", target = "awayTeamId")
    @Mapping(source = "tournament.id", target = "tournamentId")
    com.sport.predictions.dto.Event toDto(Event entity);

    @Mapping(source = "homeTeamId", target = "homeTeam.id")
    @Mapping(source = "awayTeamId", target = "awayTeam.id")
    @Mapping(source = "tournamentId", target = "tournament.id")
    Event toEntity(com.sport.predictions.dto.Event dto);
}
