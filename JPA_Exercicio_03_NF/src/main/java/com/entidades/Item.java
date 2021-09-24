package com.entidades;

public class Item {
	private int id;
	private float precoUnitario;
	private int quantidade;
	private float totalItem;
	
	public Item() {
	}
	public Item(int id, float precoUnitario, int quantidade, float totalItem) {
		super();
		this.id = id;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
		this.totalItem = totalItem;
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
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getTotalItem() {
		return totalItem;
	}
	public void setTotalItem(float totalItem) {
		this.totalItem = totalItem;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", precoUnitario=" + precoUnitario + ", quantidade=" + quantidade + ", totalItem="
				+ totalItem + "]";
	}
	
}
