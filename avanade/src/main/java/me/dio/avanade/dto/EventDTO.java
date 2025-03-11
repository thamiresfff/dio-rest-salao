package me.dio.avanade.dto;

import lombok.Builder;
import me.dio.avanade.enums.EventType;
import me.dio.avanade.enums.PaymentStatus;

@Builder
public record EventDTO(ClientDTO client, String date, EventType eventType, PaymentStatus paymentStatus){

}
