package me.dio.avanade.dto;

import me.dio.avanade.enums.EventType;
import me.dio.avanade.enums.PaymentStatus;


public record EventDTO(String clientCpf, String date, EventType eventType, PaymentStatus paymentStatus){

}
