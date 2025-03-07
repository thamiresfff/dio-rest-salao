package me.dio.avanade.controller;

import lombok.RequiredArgsConstructor;
import me.dio.avanade.dto.ClientDTO;
import me.dio.avanade.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/client")
public class ClientController {


    private final ClientService clientService;

    @PostMapping
    public ResponseEntity<String> created (@RequestBody ClientDTO clientRequest){
        return ResponseEntity.status(201)
                .body("CLiente cadastrado com sucesso");
    }
}

