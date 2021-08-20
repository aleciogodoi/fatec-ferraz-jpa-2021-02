package com.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import com.eclipselink.entity.Funcionario;

public class DeleteFuncionario {

	public static void main(String[] args) {
		
		// Unidade de persistencia / Conex�o Banco de dados 
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA_01" );
		
		// Criar objeto para manipular as tabelas
		EntityManager entitymanager = emfactory.createEntityManager( );
		
		// Abrir transa��o
		entitymanager.getTransaction( ).begin( );
			      
		int id = Integer.parseInt(JOptionPane.showInputDialog("Id"));
		
		// Pesquisar um funcionario pelo ID
		Funcionario funcionario = entitymanager.find( Funcionario.class, id );
		
		// Excluir o funcionario
		entitymanager.remove( funcionario );
		
		// Confirma a exclus�o
		entitymanager.getTransaction( ).commit( );
		entitymanager.close( );		// Fecha o objeto que manipula a tabela
		emfactory.close( );			// Fecha a conex�o com a base de dados

	}

}
