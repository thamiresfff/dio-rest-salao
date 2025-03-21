package me.dio.avanade.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity(name="tb_client")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "client",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Event> events;

    @Column(name="name", nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String cpf;

    @Column(nullable = false, length = 11)
    private String phone;


}
