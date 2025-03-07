package me.dio.avanade.service.impl;

import lombok.RequiredArgsConstructor;
import me.dio.avanade.entity.Event;
import me.dio.avanade.repository.EventRepository;
import me.dio.avanade.service.EventService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    public Event saveEvent (Event event){
        return eventRepository.save(event);
    }

}
