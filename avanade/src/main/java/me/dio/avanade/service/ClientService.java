package me.dio.avanade.service;

import me.dio.avanade.dto.ClientDTO;
import me.dio.avanade.entity.Client;

public interface ClientService {

    Client saveClient (ClientDTO client);
    ClientDTO find(String cpf);

}
