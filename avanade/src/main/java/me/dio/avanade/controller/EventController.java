package me.dio.avanade.controller;

import lombok.RequiredArgsConstructor;
import me.dio.avanade.dto.EventDTO;
import me.dio.avanade.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/event")
@RestController
public class EventController {

    private final EventService eventService;

    @PostMapping
    public ResponseEntity<String> createEvent(@RequestBody EventDTO eventRequest){
        eventService.saveEvent(eventRequest);
        return ResponseEntity.status(201).body("evento cadastrado com sucesso");
    }

}
