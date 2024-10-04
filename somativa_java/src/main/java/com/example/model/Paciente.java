package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Paciente {
    // id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    // atributos
    private String cpf;
    private String nome;
    private String historicoMedico;
    private String dataNascimento;
    private String telefone;
    private String endereco;
    
}
