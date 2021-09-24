package com.entidades;

public class Produto {
	private int id;
	private String nome;
	private float precoUnitario;
	
	public Produto() {
	}
	
	public Produto(int id, String nome, float precoUnitario) {
		super();
		this.id = id;
		this.nome = nome;
		this.precoUnitario = precoUnitario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(float precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", precoUnitario=" + precoUnitario + "]";
	}
}
