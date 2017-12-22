package dao;



import javax.persistence.EntityManager;

import entities.Book;

public class BookDao {

	private static EntityManager em;

	public static Book createBook(Book book) {
		em = DatabaseHelper.createEntityManager();
		DatabaseHelper.beginTx(em);

		em.persist(book);
		DatabaseHelper.commitTxAndClose(em);
		return book;
	}


	// Books buy
	// public static List<Book> {}
}
