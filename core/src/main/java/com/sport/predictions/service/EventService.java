package com.sport.predictions.service;

import com.sport.predictions.dto.Event;
import com.sport.predictions.mapper.EventMapper;
import com.sport.predictions.repository.EventRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author sergeylapko
 */
@Service
@Transactional
public class EventService {
    private final EventMapper eventMapper;

    private final EventRepository eventRepository;

    public EventService(EventMapper eventMapper, EventRepository eventRepository) {
        this.eventMapper = eventMapper;
        this.eventRepository = eventRepository;
    }

    public Event createEvent(Event event) {
        return eventMapper.toDto(eventRepository.save(eventMapper.toEntity(event)));
    }
}
