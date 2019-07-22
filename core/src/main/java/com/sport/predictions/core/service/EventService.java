package com.sport.predictions.core.service;

import com.sport.predictions.core.dto.Event;
import com.sport.predictions.core.mapper.EventMapper;
import com.sport.predictions.core.repository.EventRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Event> getEvents() {
        return eventRepository.findAll().stream().map(eventMapper::toDto).collect(Collectors.toList());
    }
}
