package me.dio.avanade.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.dio.avanade.enums.EventType;
import me.dio.avanade.enums.PaymentStatus;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    private Client client;
    private LocalDateTime Date;
    private EventType eventType;
    private PaymentStatus paymentStatus;

}
