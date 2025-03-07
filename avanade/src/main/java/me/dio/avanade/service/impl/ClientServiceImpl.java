package me.dio.avanade.service.impl;

import me.dio.avanade.entity.Client;
import me.dio.avanade.repository.ClientRepository;
import me.dio.avanade.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client SaveClient (Client client){
        return clientRepository.save(client);
    }


}
