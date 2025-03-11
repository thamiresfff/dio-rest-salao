package me.dio.avanade.controller.advice;

import me.dio.avanade.exception.ClientNotFoundException;
import me.dio.avanade.exception.EventNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApplicationAdvice {

    @ExceptionHandler(ClientNotFoundException.class)
    public ResponseEntity<String> handlerClientNotFoundException (ClientNotFoundException e){
        return ResponseEntity.status(404).body(e.getMessage());
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handlerIllegalArgumentException (IllegalArgumentException e){
        return ResponseEntity.status(400).body(e.getMessage());
    }

    @ExceptionHandler(EventNotFoundException.class)
    public ResponseEntity<String> handlerEventNotFoundException (EventNotFoundException e){
        return ResponseEntity.status(404).body(e.getMessage());
    }
}

