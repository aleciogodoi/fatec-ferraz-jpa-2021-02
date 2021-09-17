import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Dao {
	
	public static void insert(Pessoa pessoa) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_EX02");
		EntityManager entitymanager = emfactory.createEntityManager();
		
		entitymanager.getTransaction().begin();
		entitymanager.persist(pessoa);
		entitymanager.getTransaction().commit();
		
		emfactory.close();
		entitymanager.close();
	}
	
	public static void update(Pessoa pessoa) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_EX02");
		EntityManager entitymanager = emfactory.createEntityManager();
		
		entitymanager.getTransaction().begin();
		entitymanager.merge(pessoa);
		entitymanager.getTransaction().commit();
		
		emfactory.close();
		entitymanager.close();		
	}
	
	public static void delete(int id) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_EX02");
		EntityManager entitymanager = emfactory.createEntityManager();
		
		entitymanager.getTransaction().begin();
		Query query = entitymanager.createNamedQuery("delete Pessoa");
		query.setParameter("id", id);
		query.executeUpdate();
		entitymanager.getTransaction().commit();
		
		emfactory.close();
		entitymanager.close();		
	}

	public static Pessoa findId(int id) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_EX02");
		EntityManager entitymanager = emfactory.createEntityManager();
		Pessoa pessoa = new Pessoa();
		try {
			Query query = entitymanager.createNamedQuery("find Pessoa id");
			query.setParameter("id", id);
			pessoa = (Pessoa) query.getSingleResult();
		} catch (Exception e) {
			pessoa = null;
		} finally {
			emfactory.close();
			entitymanager.close();
			return pessoa;
		}
	}

	public static Pessoa findCPF(String cpf) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_EX02");
		EntityManager entitymanager = emfactory.createEntityManager();
		Pessoa pessoa = new Pessoa();
		try {
			Query query = entitymanager.createNamedQuery("find Pessoa CPF");
			query.setParameter("cpf", cpf);
			pessoa = (Pessoa) query.getSingleResult();
		} catch (Exception e) {
			pessoa = null;
		} finally {
			emfactory.close();
			entitymanager.close();
			return pessoa;
		}
	}

	public static Pessoa findRG(String rg) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_EX02");
		EntityManager entitymanager = emfactory.createEntityManager();
		Pessoa pessoa = new Pessoa();
		try {
			Query query = entitymanager.createNamedQuery("find Pessoa RG");
			query.setParameter("rg", rg);
			pessoa = (Pessoa) query.getSingleResult();
		} catch (Exception e) {
			pessoa = null;
		} finally {
			emfactory.close();
			entitymanager.close();
			return pessoa;
		}
	}

	public static List<Pessoa> findNome(String nome) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_EX02");
		EntityManager entitymanager = emfactory.createEntityManager();
		List<Pessoa> pessoas = null;
		try {
			Query query = entitymanager.createNamedQuery("find Pessoa Nome");
			query.setParameter("nome", nome);
			pessoas = (List<Pessoa>) query.getResultList();
		} catch (Exception e) {
			pessoas = null;
		} finally {
			emfactory.close();
			entitymanager.close();
			return pessoas;
		}
	}

	public static List<Pessoa> all() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_EX02");
		EntityManager entitymanager = emfactory.createEntityManager();
		List<Pessoa> pessoas = null;
		try {
			Query query = entitymanager.createNamedQuery("list Pessoa");
			pessoas = (List<Pessoa>) query.getResultList();
		} catch (Exception e) {
			pessoas = null;
		} finally {
			emfactory.close();
			entitymanager.close();
			return pessoas;
		}
	}

}
