package me.dio.avanade.controller.advice;

import me.dio.avanade.exception.ClientNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApplicationAdvice {

    @ExceptionHandler(ClientNotFoundException.class)
    public ResponseEntity<String> handlerClientNotFoundException (ClientNotFoundException e){
        return ResponseEntity.status(404).body(e.getMessage());
    }
}
