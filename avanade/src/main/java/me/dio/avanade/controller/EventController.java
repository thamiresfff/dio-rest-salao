package me.dio.avanade.controller;

import lombok.RequiredArgsConstructor;
import me.dio.avanade.dto.EventDTO;
import me.dio.avanade.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping
     public ResponseEntity<EventDTO> findEvent(@RequestParam String date){
        return  ResponseEntity.status(200).body(eventService.findEvent(date));
    }
}
