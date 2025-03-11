package me.dio.avanade.service;

import me.dio.avanade.dto.EventDTO;
import me.dio.avanade.entity.Event;

public interface EventService{
    Event saveEvent (EventDTO event);
    EventDTO findEvent (String date);
}
