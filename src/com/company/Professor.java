package com.company;

import java.util.Date;
import java.util.Random;

public class Professor extends PessoaFisica {
    private int matriculaProfessor;
    private Date dataContatacao;
    private String materia;
    private String horario;
    private String statusProfessor;

    public Professor() {
        Random rand = new Random();
        this.matriculaProfessor = rand.nextInt(9999);
        this.dataContatacao = new Date(System.currentTimeMillis());
    }

    public int getMatriculaProfessor() {
        return matriculaProfessor;
    }

    public Date getDataContatacao() {
        return dataContatacao;
    }

    public void setDataContatacao(Date dataContatacao) {
        this.dataContatacao = dataContatacao;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getStatusProfessor() {
        return statusProfessor;
    }

    public void setStatusProfessor(String statusProfessor) {
        this.statusProfessor = statusProfessor;
    }
    
    public String toString() {
    	String aluno = this.getNome()  + ", " + this.getEndereco()  + ", ";
    	aluno += this.getTelefone()  + ", " + this.getCpf()  + ", ";
    	aluno += this.getSexo()  + ", " + this.getDataNascimento()  + ", ";
    	aluno += this.getEmail()  + ", " + this.matriculaProfessor  + ", ";
    	aluno += this.dataContatacao + ", " + this.materia + ", "; 
    	aluno += this.horario + ", " + this.statusProfessor + ";";
    	return aluno;
    }

}
