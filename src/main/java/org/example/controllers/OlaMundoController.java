package org.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OlaMundoController {

    @GetMapping(path = "/")
    public String saudar(){
        return "<h1>Ola mundo</h1>";
    }

    @GetMapping("/integrates")
    public List<String> apresentacaoDaSala(){
        // TODO: faça um metodo para retornar o nome dos alunos e nome dos professores da classe estrelas
    }
}
