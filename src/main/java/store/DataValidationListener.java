package store;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class DataValidationListener {
 @PrePersist
 @PreUpdate
 private void validate(CD cd){
	 if(cd.getTitle()==null|| "".equals(cd.getTitle()))
		 throw new IllegalArgumentException("Invalid Title");
 }
 
}
