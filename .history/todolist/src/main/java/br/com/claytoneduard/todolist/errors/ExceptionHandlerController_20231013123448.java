package br.com.claytoneduard.todolist.errors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice // classes globais
public class ExceptionHandlerController {
    public ResponseEntity<String> handleHttpMessageNotReadableExcpetion();
    
}
