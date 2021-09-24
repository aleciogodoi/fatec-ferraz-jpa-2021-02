package com.entidades;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Nota {
	private int nr;
	private Date data;
	private float total;
	
	public Nota() {
	}
	
	@OneToMany
	private List<Item> itens = new ArrayList<>();
	
	@ManyToOne
	private Cliente cliente;
	
	public Nota(int nr, Date data, List<Item> itens, Cliente cliente) {
		this.nr = nr;
		this.data = data;
		this.itens = itens;
		this.cliente = cliente;
		this.setTotal();
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal() {
		this.total=0f;
		for(Item item: itens)
			this.total += item.getTotalItem();
	}
	public List<Item> getItens() {
		return itens;
	}
	public void setItens(List<Item> itens) {
		this.itens = itens;
		this.setTotal();
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return "Nota [nr=" + nr + ", data=" + data + ", total=" + total + ", itens=" + itens + ", cliente=" + cliente
				+ "]";
	}
	
}
