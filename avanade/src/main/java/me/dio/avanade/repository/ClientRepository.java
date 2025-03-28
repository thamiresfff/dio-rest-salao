package me.dio.avanade.repository;

import me.dio.avanade.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    Optional<Client> findByCpf(String cpf);

    boolean existsByCpf(String cpf);
}
