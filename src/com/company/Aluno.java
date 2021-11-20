package com.company;

import java.util.Date;

public class Aluno extends PessoaFisica {
	private int matriculaAluno;
	private Date dataMatricula;
	private String curso;
	private String statusAluno;
	
	public int getMatriculaAluno() {
		return matriculaAluno;
	}
	
	public void setMatriculaAluno(int matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}
	
	public Date getDataMatricula() {
		return dataMatricula;
	}
	
	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
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
