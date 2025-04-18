package me.dio.avanade.repository;

import me.dio.avanade.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;


@Repository
public interface EventRepository extends JpaRepository<Event,Long> {

    boolean existsByDate(LocalDate data);

    Optional<Event> findBydate(LocalDate date);
}

