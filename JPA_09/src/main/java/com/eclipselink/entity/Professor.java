package com.eclipselink.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Professor {
	@Id
	private int idProfessor;
	private String nomeProfessor;

    @ManyToMany(targetEntity = Disciplina.class)
    private Set disciplinaSet;

    public Professor() {
    }
	public Professor(int idProfessor, String nomeProfessor, Set disciplinaSet) {
		this.idProfessor = idProfessor;
		this.nomeProfessor = nomeProfessor;
		this.disciplinaSet = disciplinaSet;
	}
	public int getIdProfessor() {
		return idProfessor;
	}
	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}
	public String getNomeProfessor() {
		return nomeProfessor;
	}
	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	public Set getDisciplinaSet() {
		return disciplinaSet;
	}
	public void setDisciplinaSet(Set disciplinaSet) {
		this.disciplinaSet = disciplinaSet;
	}
	@Override
	public String toString() {
		return "Professor [idProfessor=" + idProfessor + ", nomeProfessor=" + nomeProfessor + ", disciplinaSet="
				+ disciplinaSet + "]";
	}
}
