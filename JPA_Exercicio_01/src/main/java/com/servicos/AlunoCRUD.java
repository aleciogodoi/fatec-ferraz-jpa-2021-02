package com.servicos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
		// Unidade de Persistencia
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_01");
		// Criar objeto para fazer o gerenciamento das classes com as tabelas
		EntityManager entitymanager = emfactory.createEntityManager();
		
		Aluno aluno = entitymanager.find(Aluno.class, ra);
		if (aluno != null) {
			entitymanager.getTransaction().begin();   // abre a transação
			entitymanager.remove(aluno);                  // update aluno
			entitymanager.getTransaction().commit();  // fecha a transação
		}
		entitymanager.close();                    // fecha o gerenciador de entidades
		emfactory.close();                        // fecha a unidade de persistencia
		
	}

	public Aluno find(String ra) {
		// Unidade de Persistencia
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_01");
		// Criar objeto para fazer o gerenciamento das classes com as tabelas
		EntityManager entitymanager = emfactory.createEntityManager();
		
		Aluno aluno = entitymanager.find(Aluno.class, ra);

		entitymanager.close();                    // fecha o gerenciador de entidades
		emfactory.close();                        // fecha a unidade de persistencia
		
		return aluno;
	}
	
	public List<Aluno> getAll() {
		// Unidade de Persistencia
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_01");
		// Criar objeto para fazer o gerenciamento das classes com as tabelas
		EntityManager entitymanager = emfactory.createEntityManager();
		
		Query query = entitymanager.createNamedQuery("all Alunos");
		List<Aluno> alunos = (List<Aluno>) query.getResultList();
		return alunos;
	}
}
