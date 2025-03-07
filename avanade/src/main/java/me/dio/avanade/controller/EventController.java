package me.dio.avanade.controller;

import me.dio.avanade.service.EventService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/event")
@RestController
public class EventController {

    private EventService eventService;
}
