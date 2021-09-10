import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pessoa {
	
	@Id
	private int idPessoa;
	
	private String nome;
	private String cpf;
	private String rg;
	private Date dtNascimento;
	private float altura;
	private float peso;

	public Pessoa() {
	}

	public Pessoa(int idPessoa, String nome, String cpf, String rg, 
					Date dtNascimento, float altura, float peso) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dtNascimento = dtNascimento;
		this.altura = altura;
		this.peso = peso;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", dtNascimento="
				+ dtNascimento + ", altura=" + altura + ", peso=" + peso + "]";
	}
	
	
}
