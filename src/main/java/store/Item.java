package store;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Item
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Disc" )
@DiscriminatorValue("I")
public class Item  {

	
	

	@Id @GeneratedValue
	protected Long id;
	protected String title;
	protected Float price;
	protected String description;
	public String getTitle() {
		return title;
	}
	
	

	public void setTitle(String title) {
		this.title = title;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Item() {
		super();
	}
   
}
