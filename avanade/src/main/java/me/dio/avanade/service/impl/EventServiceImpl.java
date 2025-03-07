package me.dio.avanade.service.impl;

import me.dio.avanade.entity.Event;
import me.dio.avanade.repository.EventRepository;
import me.dio.avanade.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository eventRepository;

    public Event saveEvent (Event event){
        return eventRepository.save(event);
    }

}
