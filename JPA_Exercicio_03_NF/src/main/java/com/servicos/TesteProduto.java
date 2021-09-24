package com.servicos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entidades.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_NF");
		EntityManager entitymanager = emfactory.createEntityManager();
		
		entitymanager.getTransaction().begin();
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		produtos.add(new Produto(1, "TV Smart 43' LG", 2500.27f));
		produtos.add(new Produto(2, "Fogão 4 Bocas Brastemp' LG", 1230.59f));
		produtos.add(new Produto(3, "Geladeira 220L Consul", 1927.54f));
		produtos.add(new Produto(4, "Celular IPhone 8", 3250.07f));
		produtos.add(new Produto(5, "Maquina de Lavar 12Kg", 2109.45f));
		produtos.add(new Produto(6, "Ferro de Passar", 234.76f));
		produtos.add(new Produto(7, "Sofá 4 Lugares", 1856.62f));
		produtos.add(new Produto(8, "Microondas 30L", 489.44f));
		
		for (Produto produto: produtos)
			entitymanager.persist(produto);
		
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();

	}

}
