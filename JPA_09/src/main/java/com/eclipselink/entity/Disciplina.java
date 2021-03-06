package com.eclipselink.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Disciplina {
	@Id
	private int idDisciplina;
	private String nomeDisciplina;
	
	public Disciplina() {
	}
	public Disciplina(int idDisciplina, String nomeDisciplina) {
		this.idDisciplina = idDisciplina;
		this.nomeDisciplina = nomeDisciplina;
	}
	public int getIdDisciplina() {
		return idDisciplina;
	}
	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	@Override
	public String toString() {
		return "Disciplina [idDisciplina=" + idDisciplina + ", nomeDisciplina=" + nomeDisciplina + "]";
	}
}
