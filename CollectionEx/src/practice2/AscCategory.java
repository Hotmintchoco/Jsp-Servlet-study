package practice2;

import java.util.Comparator;

public class AscCategory implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getCategory() - o2.getCategory();
	}
	
}
