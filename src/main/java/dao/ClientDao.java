package dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entities.Book;
import entities.Client;


public class ClientDao {
	
	private static EntityManager em;
	
	public static void createClient(Client client) {
		em = DatabaseHelper.createEntityManager(); 
		DatabaseHelper.beginTx(em);
	
		em.persist(client);
		DatabaseHelper.commitTxAndClose(em);
	}
	
//	// Books buy some client
//		public static List<Book> booksBuyClient(Long id) {
//			List<Client> clients = new ArrayList<Client>();
//
//			em = DatabaseHelper.createEntityManager();
//			DatabaseHelper.beginTx(em);
//
//			TypedQuery<Client> query = em.createQuery(
//					"select distinct c from Client c left "
//					+ "join fetch c.listBooks"
//					+ "where c.id =:id ", Book.class);
//			query.setParameter("id", id);
//			clients = query.getResultList();
//
//			em.persist(books);
//			DatabaseHelper.commitTxAndClose(em);
//
//			return client;
//		}
//	
	//Clients buy some book
	
	
}
