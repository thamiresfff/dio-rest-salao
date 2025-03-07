package me.dio.avanade.service.impl;

import lombok.RequiredArgsConstructor;
import me.dio.avanade.entity.Client;
import me.dio.avanade.repository.ClientRepository;
import me.dio.avanade.service.ClientService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ClientServiceImpl implements ClientService {


    private final ClientRepository clientRepository;

    public Client SaveClient (Client client){
        return clientRepository.save(client);
    }


}
