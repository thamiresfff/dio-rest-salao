package me.dio.avanade.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.dio.avanade.dto.ClientDTO;
import me.dio.avanade.entity.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper {

    private final ObjectMapper objectMapper;

    public ClientMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public Client toEntity(ClientDTO dto) {
        Client client = new Client();
        client.setName(dto.name());
        client.setCpf(dto.cpf());
        client.setPhone(dto.phone());
        return client;
    }
    public ClientDTO toDto(Client entity){
        return ClientDTO.builder().cpf(entity.getCpf())
                .name(entity.getName())
                .phone(entity.getPhone())
                .build();
    }
}
