package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;


@Entity
@SequenceGenerator(name = "id_client")
public class Client {
	
	@Id
	@GeneratedValue(generator = "id_client")
	private Long id;
	
	@Column
	private String lastName;
	@Column
	private String firstName;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@ManyToMany
	private List<Book> listBooks = new ArrayList<Book>();
	
	@ManyToOne
	private Book bookFavorite;

	public Client() {}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public List<Book> getListBooks() {
		return listBooks;
	}

	public void setListBooks(List<Book> listBooks) {
		this.listBooks = listBooks;
	}
	
	public Book getBookFavorite() {
		return bookFavorite;
	}

	public void setBookFavorite(Book bookFavorite) {
		this.bookFavorite =  bookFavorite;
	}
}
