package com.meninas_gerentes.horario_aula.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.meninas_gerentes.horario_aula.dto.ProfessorDto;
import com.meninas_gerentes.horario_aula.modelo.Professor;

@RestController
    public class ProfessorController {   
    

    @GetMapping
    public String imprimir(){
        System.out.println("chegou aqui a requisição...");
        return "okok";
    }

    @PostMapping(value = "/api/professor/")
    public void create(@RequestBody ProfessorDto professorDto){
        Professor professor = professorDto.novoProfessor();
        System.out.println(professor.toString());
    }
}