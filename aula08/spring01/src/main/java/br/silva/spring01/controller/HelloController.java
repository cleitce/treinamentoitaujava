package br.silva.spring01.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController             //indica que é um controller do tipo REST
@CrossOrigin("*")           //aceita requisições de qualquer fonte
@RequestMapping("/hello")   //mapping do recurso / URL
public class HelloController {
    
    @GetMapping("/ola")   //este metodo á acionado via GET
    public String respondeOla(){
        return "Olá mundo!";

    }
}
