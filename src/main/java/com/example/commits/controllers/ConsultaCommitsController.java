package com.example.commits.controllers;

import com.example.commits.entities.ConsultaCommits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.commits.services.ConsultaCommitsService;

import java.util.List;

@RestController
@RequestMapping("/consulta-commits")
@CrossOrigin
public class ConsultaCommitsController {
    @Autowired
    private ConsultaCommitsService consultaCommitsService;
    @GetMapping
    public List<ConsultaCommits> listarTodos(){
        return consultaCommitsService.listarTodos();
    }

    @PostMapping
    public ConsultaCommits salvar(@RequestBody ConsultaCommits consultaCommits){
        return consultaCommitsService.salvar(consultaCommits);
    }

    //localhost:8080/alunos/1 - com o verbo delete
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable("id") Long id){
        consultaCommitsService.excluir(id);
    }
}
