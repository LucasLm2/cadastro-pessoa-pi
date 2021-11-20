package com.company;

import java.util.Date;

public class Professor extends PessoaFisica {
	private int matriculaProfessor;
	private Date dataContatacao;
	private String materia;
	private String horario;
	private String statusProfessor;
	
	public int getMatriculaProfessor() {
		return matriculaProfessor;
	}
	
	public void setMatriculaProfessor(int matriculaProfessor) {
		this.matriculaProfessor = matriculaProfessor;
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
	
}
