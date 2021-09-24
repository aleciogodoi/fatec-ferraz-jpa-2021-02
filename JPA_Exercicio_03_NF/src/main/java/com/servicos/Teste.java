package com.servicos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entidades.Cliente;

public class Teste {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_NF");
		EntityManager entitymanager = emfactory.createEntityManager();
		
		entitymanager.getTransaction().begin();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(new Cliente(1, "Pedro", "pedro@gmail.com"));
		clientes.add(new Cliente(1, "Mateus", "mateus@gmail.com"));
		clientes.add(new Cliente(1, "Ana", "ana@gmail.com"));
		clientes.add(new Cliente(1, "Maria", "maria@gmail.com"));
		clientes.add(new Cliente(1, "Alan", "alan@gmail.com"));
		
		for (Cliente cliente: clientes)
			entitymanager.persist(cliente);
		
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}

}
