package practice2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
	private String bNO;
	private int category;
	private String title;
	private String author;
	
	Book() {}
	
	Book(String bNO, int category, String title, String author) {
		this.bNO = bNO;
		this.category = category;
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return bNO + ", " + category + ", " + title + ", " + author;
	}
}
