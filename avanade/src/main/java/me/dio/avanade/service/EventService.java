package me.dio.avanade.service;

import me.dio.avanade.entity.Event;
import me.dio.avanade.service.impl.EventServiceImpl;

public interface EventService{
    Event saveEvent (Event event);
}
