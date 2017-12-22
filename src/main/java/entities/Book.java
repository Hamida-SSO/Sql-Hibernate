package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;

@Entity
@SequenceGenerator(name = "id_book")
public class Book {

	@Id
	@GeneratedValue(generator = "id_book")
	private Long id;

	@Column
	private String title;

	@Column
	@NotBlank
	private String author;

	@ManyToMany(mappedBy = "listBooks")
	private List<Client> client = new ArrayList<Client>();

	public Book() {
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Client> getClient() {
		return client;
	}

	public void setClient(List<Client> client) {
		this.client = client;
	}

}
