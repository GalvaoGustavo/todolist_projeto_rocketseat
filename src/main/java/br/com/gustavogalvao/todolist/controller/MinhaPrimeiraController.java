package br.com.gustavogalvao.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("PrimeiraRota")
//http://localhost:8080/

public class MinhaPrimeiraController {
    

    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem(){
        return "Funcionou";
    }
}