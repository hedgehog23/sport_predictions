package com.sport.predictions.core.controller;

import com.sport.predictions.core.dto.Event;
import com.sport.predictions.core.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sergeylapko
 */
@RestController("/event")
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @ResponseBody
    @PostMapping
    public ResponseEntity createEvent(@RequestBody Event event) {
        return ResponseEntity.ok(eventService.createEvent(event));
    }

    @GetMapping
    public ResponseEntity getEvents() {
        return ResponseEntity.ok(eventService.getEvents());
    }
}
