package store;

import java.util.Random;

@ThirteenDigits
public class IsbnGenerator implements NumberGenerator {

	
	public String generateNumber() {
		 String isbn = "13-84356-" + Math.abs(new Random().nextInt());
		return isbn;
	}

}
