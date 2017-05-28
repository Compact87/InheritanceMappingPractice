package store;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: CD
 *
 */
@EntityListeners(DataValidationListener.class)
@Entity
@DiscriminatorValue("C")
public class CD extends Item {
    @Column(name="Company")
	private String musicCompany;
	private Integer numberOfCDs;
	private Float totalDuration;
	private String genre;

	
	

	public String getMusicCompany() {
		return musicCompany;
	}

	public void setMusicCompany(String musicCompany) {
		this.musicCompany = musicCompany;
	}

	public Integer getNumberOfCDs() {
		return numberOfCDs;
	}

	public void setNumberOfCDs(Integer numberOfCDs) {
		this.numberOfCDs = numberOfCDs;
	}

	public Float getTotalDuration() {
		return totalDuration;
	}

	public void setTotalDuration(Float totalDuration) {
		this.totalDuration = totalDuration;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
   
}
