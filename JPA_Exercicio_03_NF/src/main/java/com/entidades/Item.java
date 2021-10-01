package com.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item {
	
	@Id
	private int id;
	
	@ManyToOne
	private Produto produto;
	
	private float precoUnitario;
	private int quantidade;
	private float totalItem;
	
	public Item() {
	}

	
	public Item(int id, Produto produto, int quantidade) {
		super();
		this.id = id;
		this.produto = produto;
		this.precoUnitario = produto.getPrecoUnitario();
		this.quantidade = quantidade;
		this.setTotalItem();
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(float precoUnitario) {
		this.precoUnitario = precoUnitario;
		this.setTotalItem();
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
		this.setTotalItem();
	}
	public float getTotalItem() {
		return totalItem;
	}
	public void setTotalItem() {
		this.totalItem = this.produto.getPrecoUnitario() * this.quantidade ;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.setTotalItem();
		this.produto = produto;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", produto=" + produto + ", precoUnitario=" + precoUnitario + ", quantidade="
				+ quantidade + ", totalItem=" + totalItem + "]";
	}
}
