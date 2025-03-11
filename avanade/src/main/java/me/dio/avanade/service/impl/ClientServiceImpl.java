package me.dio.avanade.service.impl;

import lombok.RequiredArgsConstructor;
import me.dio.avanade.dto.ClientDTO;
import me.dio.avanade.entity.Client;
import me.dio.avanade.exception.ClientNotFoundException;
import me.dio.avanade.repository.ClientRepository;
import me.dio.avanade.service.ClientService;
import me.dio.avanade.util.ClientMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ClientServiceImpl implements ClientService {


    private final ClientRepository clientRepository;

    private final ClientMapper clientMapper;

    public Client saveClient (ClientDTO clientRequest){

        if(clientRepository.existsByCpf(clientRequest.cpf()))
            throw new IllegalArgumentException("cliente ja cadastrado");

        return clientRepository.save(
                clientMapper.toEntity(clientRequest));
    }

    public ClientDTO find(String cpf){
        return clientMapper.toDto(
                clientRepository.findByCpf(cpf)
                        .orElseThrow(()-> new ClientNotFoundException("Cliente não encontrado ")));
    }

}
