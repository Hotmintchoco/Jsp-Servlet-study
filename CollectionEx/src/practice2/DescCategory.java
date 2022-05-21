package practice2;

import java.util.Comparator;

public class DescCategory implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o2.getCategory() - o1.getCategory();
	}
}
	
