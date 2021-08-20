package com.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import com.eclipselink.entity.Funcionario;

public class DeleteFuncionario {

	public static void main(String[] args) {
		
		// Unidade de persistencia / Conexão Banco de dados 
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA_01" );
		
		// Criar objeto para manipular as tabelas
		EntityManager entitymanager = emfactory.createEntityManager( );
		
		// Abrir transação
		entitymanager.getTransaction( ).begin( );
			      
		int id = Integer.parseInt(JOptionPane.showInputDialog("Id"));
		
		// Pesquisar um funcionario pelo ID
		Funcionario funcionario = entitymanager.find( Funcionario.class, id );
		
		// Excluir o funcionario
		entitymanager.remove( funcionario );
		
		// Confirma a exclusão
		entitymanager.getTransaction( ).commit( );
		entitymanager.close( );		// Fecha o objeto que manipula a tabela
		emfactory.close( );			// Fecha a conexão com a base de dados

	}

}
