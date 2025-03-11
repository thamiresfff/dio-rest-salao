package me.dio.avanade.repository;

import me.dio.avanade.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;


@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
    boolean existsByDate(LocalDate data);
}
