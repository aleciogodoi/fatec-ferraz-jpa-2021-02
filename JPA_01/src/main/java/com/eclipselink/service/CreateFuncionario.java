package com.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import com.eclipselink.entity.Funcionario;

public class CreateFuncionario {
	static Funcionario funcionario = new Funcionario();

	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_01");

		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		entradaDados();

		entitymanager.persist(funcionario);
		entitymanager.getTransaction().commit();

		entitymanager.close();
		emfactory.close();

	}

	public static void entradaDados() {
		funcionario.setIdFuncionario(Integer.parseInt(JOptionPane.showInputDialog("Id")));
		funcionario.setNome(JOptionPane.showInputDialog("Nome: "));
		funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Sal?rio")));
		funcionario.setCargo(JOptionPane.showInputDialog("Cargo: "));
	}

}
