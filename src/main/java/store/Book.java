package store;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Book
 *
 */
@Entity
@DiscriminatorValue("B")
public class Book extends Item {
	
	
	private String isbn;
	private String publisher;
	

	
		
	

	

	public String getIsbn() {
		return isbn;
	}

	

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	



	public void setIsbn(String isbn2) {
		this.isbn =isbn;
	}

}
