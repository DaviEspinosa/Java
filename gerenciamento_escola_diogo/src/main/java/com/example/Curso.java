package com.example;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nomeCurso;
    private List<Aluno> listAluno;
    private Professor professor;

    public Curso(String nomeCurso){
        this.nomeCurso = nomeCurso;
        listAluno = new ArrayList<>();
    }

    public void addProfessor(Professor professor){
        this.professor = professor;
    }

    public void addAluno(Aluno aluno){
        listAluno.add(aluno);
    }

    public void lancarNota(String nomeAluno, double nota){
        for (Aluno aluno : listAluno) {
            if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                aluno.setNome(nomeAluno);
                System.out.println("Nota Inserida com Sucesso");
                return;
            }else{
                System.out.println("Aluno não encontrada");
            }
        }
    }

    public void resultadoFinal(){
        for (Aluno aluno : listAluno) {
            System.out.println(aluno.exibirInfo());
            aluno.avaliarDesempenho();
        }
    }
}
