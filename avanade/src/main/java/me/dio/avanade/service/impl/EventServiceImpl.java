package me.dio.avanade.service.impl;

import lombok.RequiredArgsConstructor;
import me.dio.avanade.dto.ClientDTO;
import me.dio.avanade.dto.EventDTO;
import me.dio.avanade.entity.Client;
import me.dio.avanade.entity.Event;
import me.dio.avanade.exception.EventNotFoundException;
import me.dio.avanade.repository.EventRepository;
import me.dio.avanade.service.ClientService;
import me.dio.avanade.service.EventService;
import me.dio.avanade.util.ClientMapper;
import me.dio.avanade.util.DateTimeFormatterUtil;
import me.dio.avanade.util.EventMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;
    private final ClientService clientService;
    private final EventMapper eventMapper;
    private final ClientMapper clientMapper;

    public Event saveEvent (EventDTO event){

        Client clientExistent = clientService.findOrCreateClient(event.client());

        if(eventRepository.existsByDate(DateTimeFormatterUtil.parse(event.date())))
            throw new IllegalArgumentException(" Data já ocupada" );

        return eventRepository.save(eventMapper.toEntity(event,clientExistent));
    }

    @Override
    public EventDTO findEvent(String date) {
        Event eventExistent = eventRepository.findBydate(DateTimeFormatterUtil.parse(date))
                .orElseThrow(()-> new EventNotFoundException("Data disponivel"));
        ClientDTO clientDTO = clientMapper.toDto(eventExistent.getClient());

        return eventMapper.toDTO(eventExistent, clientDTO);
    }

}
