package com.eclipselink.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Table 
@Entity
public class Departamento {
	@Id
	private int idDepto;
	private String nomeDepto;
	
	public Departamento() {
	}
	public Departamento(int idDepto, String nomeDepto) {
		this.idDepto = idDepto;
		this.nomeDepto = nomeDepto;
	}
	public int getIdDepto() {
		return idDepto;
	}
	public void setIdDepto(int idDepto) {
		this.idDepto = idDepto;
	}
	public String getNomeDepto() {
		return nomeDepto;
	}
	public void setNomeDepto(String nomeDepto) {
		this.nomeDepto = nomeDepto;
	}
	@Override
	public String toString() {
		return "Departamento [idDepto=" + idDepto + ", nomeDepto=" + nomeDepto + "]";
	}
}
