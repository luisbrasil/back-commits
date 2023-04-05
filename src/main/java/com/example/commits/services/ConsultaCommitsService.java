package com.example.commits.services;

import com.example.commits.repositories.ConsultaCommitsRepository;
import com.example.commits.entities.ConsultaCommits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaCommitsService {
    @Autowired
    private ConsultaCommitsRepository consultaCommitsRepository;

    public List<ConsultaCommits> listarTodos(){
        return consultaCommitsRepository.findAll();
    }

    public ConsultaCommits salvar(ConsultaCommits consultaCommits){
        return consultaCommitsRepository.saveAndFlush(consultaCommits);
    }

    public void excluir(Long id){
        ConsultaCommits consultaCommits = consultaCommitsRepository.findById(id).get();
        consultaCommitsRepository.delete(consultaCommits);
    }
}
