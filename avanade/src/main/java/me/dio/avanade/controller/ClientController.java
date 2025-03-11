package me.dio.avanade.controller;

import lombok.RequiredArgsConstructor;
import me.dio.avanade.dto.ClientDTO;
import me.dio.avanade.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/client")
public class ClientController {


    private final ClientService clientService;

    @PostMapping
    public ResponseEntity<String> create(@RequestBody ClientDTO clientRequest) {
        clientService.saveClient(clientRequest);
        return ResponseEntity.status(201)
                .body("CLiente cadastrado com sucesso");
    }

    @GetMapping
    public ResponseEntity<Object> find(@RequestParam String cpf) {
        return ResponseEntity.status(200).body(clientService.find(cpf));
    }
}