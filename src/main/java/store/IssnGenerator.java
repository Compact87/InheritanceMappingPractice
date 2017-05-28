package store;

import java.util.Random;

public class IssnGenerator implements NumberGenerator {

	@EightDigits
	public String generateNumber() {
		String issn =  "8-" + Math.abs(new Random().nextInt());
	    
	    return issn;
	}

}
