package com.servicos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entidade.Aluno;

public class AlunoCRUD {
	
	public void insert(Aluno aluno) {
		// Unidade de Persistencia
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_01");
		// Criar objeto para fazer o gerenciamento das classes com as tabelas
		EntityManager entitymanager = emfactory.createEntityManager();
		
		entitymanager.getTransaction().begin();   // abre a transação
		entitymanager.persist(aluno);             // inserir aluno
		entitymanager.getTransaction().commit();  // fecha a transação
		entitymanager.close();                    // fecha o gerenciador de entidades
		emfactory.close();                        // fecha a unidade de persistencia
	}
	
	public void update(Aluno aluno) {
		// Unidade de Persistencia
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_01");
		// Criar objeto para fazer o gerenciamento das classes com as tabelas
		EntityManager entitymanager = emfactory.createEntityManager();
		
		entitymanager.getTransaction().begin();   // abre a transação
		entitymanager.merge(aluno);               // update aluno
		entitymanager.getTransaction().commit();  // fecha a transação
		entitymanager.close();                    // fecha o gerenciador de entidades
		emfactory.close();                        // fecha a unidade de persistencia
	}

	public void delete(String ra) {
		
	}

	public Aluno find(String ra) {
		return null;
	}
	
}
