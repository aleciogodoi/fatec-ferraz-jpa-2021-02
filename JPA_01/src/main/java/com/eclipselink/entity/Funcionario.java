package com.eclipselink.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table       
@NamedQueries({
	@NamedQuery(name = "find Funcionario id", query = "Select e from Funcionario e where e.idFuncionario = :id"),
	@NamedQuery(name = "find Funcionario nome", query = "Select e from Funcionario e where e.nome like :nome")
})

public class Funcionario {
	
	@Id                            //Chave prim?ria
	private int idFuncionario;
	
	private String nome;
	private double salario;
	private String cargo;
	
	public Funcionario(int idFuncionario, String nome, double salario, String cargo) {
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}
	
	public Funcionario() {	
	}
	
	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", nome=" + nome + ", salario=" + salario + ", cargo="
				+ cargo + "]";
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
