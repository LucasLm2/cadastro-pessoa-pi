package com.company;

import java.util.Date;
import java.util.Random;

public class Aluno extends PessoaFisica {
    private int matriculaAluno;
    private Date dataMatricula;
    private String curso;
    private String statusAluno;

    public Aluno() {
        Random rand = new Random();
        this.matriculaAluno = rand.nextInt(9999);
        this.dataMatricula = new Date(System.currentTimeMillis());
    }

    public int getMatriculaAluno() {
        return matriculaAluno;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getStatusAluno() {
        return statusAluno;
    }

    public void setStatusAluno(String statusAluno) {
        this.statusAluno = statusAluno;
    }

}
