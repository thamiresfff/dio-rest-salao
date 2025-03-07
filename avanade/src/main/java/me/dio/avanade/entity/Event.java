package me.dio.avanade.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.dio.avanade.enums.EventType;
import me.dio.avanade.enums.PaymentStatus;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDateTime;

@Entity(name="tb_event")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="client_id", nullable = false)
    @ManyToOne
    private Client client;

    @Column(name="date_time", unique = true)
    private LocalDateTime Date;

    @Column(name="type_event",nullable = false)
    private EventType eventType;

    @Column(name="status_pay",nullable = false)
    private PaymentStatus paymentStatus;

}
