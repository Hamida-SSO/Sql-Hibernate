package fr.dta.formation_sql_hibernate;

import javax.persistence.EntityManager;

import dao.BookDao;
import dao.ClientDao;
import dao.DatabaseHelper;
import entities.Book;
import entities.Client;
import entities.Gender;


/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void main(String args[]) {
		EntityManager em = DatabaseHelper.createEntityManager(); 
		DatabaseHelper.beginTx(em);
		
		Book book = new Book();
		book.setTitle("Roswell");
		book.setAuthor("Quentin Delanghe");
		
		Book book1 = new Book();
		book1.setTitle("SmallVille");
		book1.setAuthor("Alfred & Miles");
		
		Book book2 = new Book();
		book2.setTitle("The Great Doctor");
		book2.setAuthor("Kim Jong Hak");
		
		Client client =  new Client();
		client.setLastName("Lee");
		client.setFirstName("MIN HO");
		client.setGender(Gender.M);
		// Book favorite
		client.setBookFavorite(book);
	
		
		Client client1 =  new Client();
		client1.setLastName("Maïssane");
		client1.setFirstName("SIDI");
		client1.setGender(Gender.F);
		// Book favorite
		client1.setBookFavorite(book1);
		
		Client client2 =  new Client();
		client2.setLastName("Joshua");
		client2.setFirstName("CONAN");
		client2.setGender(Gender.M);
		
		
		BookDao.createBook(book);
		BookDao.createBook(book1);
		BookDao.createBook(book2);
		ClientDao.createClient(client);
		ClientDao.createClient(client1);
		ClientDao.createClient(client2);
		
		//BookDao.booksBuyClient(client1);
	}
	
}
