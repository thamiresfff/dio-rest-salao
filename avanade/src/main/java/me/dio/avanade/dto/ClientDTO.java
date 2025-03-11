package me.dio.avanade.dto;

import lombok.Builder;

@Builder
public record ClientDTO(String name, String cpf, String phone) {

}
