package com.entidade;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Aluno {
	// Atributos
	@Id					// Define 'ra' como chave prim�ria
	private String ra;
	
	private String nome;
	private String email;
	private String celular;
	private double nota1;
	private double nota2;
	
	// Construtores
	public Aluno() {
	}
	public Aluno(String ra, String nome, String email,
					String celular, double nota1, double nota2) {
		this.ra = ra;
		this.nome = nome;
		this.email = email;
		this.celular = celular;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	// Getters e Setters
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	@Override
	public String toString() {
		return "Aluno [ra=" + ra + ", nome=" + nome + ", email=" + email + ", celular=" + celular + ", nota1=" + nota1
				+ ", nota2=" + nota2 + "]";
	}
	

}
