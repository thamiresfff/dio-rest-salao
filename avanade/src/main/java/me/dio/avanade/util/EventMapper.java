package me.dio.avanade.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.dio.avanade.dto.ClientDTO;
import me.dio.avanade.dto.EventDTO;
import me.dio.avanade.entity.Client;
import me.dio.avanade.entity.Event;
import org.springframework.stereotype.Component;

@Component
public class EventMapper {

    private final ObjectMapper objectMapper;

    public EventMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public Event toEntity(EventDTO eventdto, Client client){
        return Event.builder().client(client)
                .date(DateTimeFormatterUtil.parse(eventdto.date()))
                .eventType(eventdto.eventType())
                .paymentStatus(eventdto.paymentStatus())
                .build();
    }

    public EventDTO toDTO (Event event, ClientDTO clientDTO){
        return EventDTO.builder()
                .client(clientDTO)
                .date(DateTimeFormatterUtil.format(event.getDate()))
                .eventType(event.getEventType())
                .paymentStatus(event.getPaymentStatus())
                .build();
    }
}

