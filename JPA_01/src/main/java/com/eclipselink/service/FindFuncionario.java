package com.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import com.eclipselink.entity.Funcionario;

public class FindFuncionario {

	public static void main(String[] args) {

		// Unidade de persistencia / Conex�o Banco de dados 
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_01");
		
		// Criar objeto para manipular as tabelas
		EntityManager entitymanager = emfactory.createEntityManager();

		// Solicita ID para pesquisa de Funcionario
		int id = Integer.parseInt(JOptionPane.showInputDialog("Id"));
		
		// Pesquisa um funcionario pelo ID
		Funcionario funcionario = entitymanager.find(Funcionario.class, id);

		JOptionPane.showMessageDialog(null,
				"idFuncionario = " + funcionario.getIdFuncionario() + "\nNome = " + funcionario.getNome() + "\nSal�rio = "
						+ funcionario.getSalario() + "\nCargo = " + funcionario.getCargo());

		entitymanager.close();  // fecha objeto que manipula a tabela
		emfactory.close();      // fecha a conex�o
	}

}
