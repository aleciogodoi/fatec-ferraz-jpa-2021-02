package com.entidades;

import java.sql.Date;

public class Nota {
	private int nr;
	private Date data;
	private float total;
	
	public Nota() {
	}
	public Nota(int nr, Date data, float total) {
		super();
		this.nr = nr;
		this.data = data;
		this.total = total;
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
	public void setTotal(float total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Nota [nr=" + nr + ", data=" + data + ", total=" + total + "]";
	}
	
}
