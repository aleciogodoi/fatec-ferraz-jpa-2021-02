package com.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import com.eclipselink.entity.Funcionario;

public class UpdateFuncionario {
	public static void main(String[] main) {
		// Unidade de persistencia / Conexão Banco de dados
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_01");

		// Criar objeto para manipular as tabelas
		EntityManager entitymanager = emfactory.createEntityManager();

		// Abrir uma transação com o banco de dados
		entitymanager.getTransaction().begin();

		int id = Integer.parseInt(JOptionPane.showInputDialog("Id"));

		// Pesquisa um funcionario pelo ID
		Funcionario funcionario = entitymanager.find(Funcionario.class, id);

		// antes update
		JOptionPane.showMessageDialog(null, funcionario);
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Novo Salário"));
		funcionario.setSalario(salario);
		
		// Confirma a alteração
		entitymanager.getTransaction().commit();

		// depois do update
		JOptionPane.showMessageDialog(null, funcionario);
		entitymanager.close();  // fecha objeto que manipula a tabela
		emfactory.close();      // fecha a conexão
	}
}