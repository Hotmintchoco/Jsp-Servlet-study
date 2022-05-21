package practice2;

import java.util.ArrayList;
import java.util.Collections;

public class BookManager {
	private ArrayList<Book> bookList;
	
	public BookManager() {
		bookList = new ArrayList<Book>();
	}
	
	BookManager(ArrayList<Book> list) {
		bookList = list;
	}
	
	void addBook(Book book) { bookList.add(book); }
	void deleteBook(int index) { bookList.remove(index); }
	
	int searchBook(String bTitle) {
		for (int i = 0; i < bookList.size(); i++) {
			Book books = bookList.get(i);
			if (bTitle.equals(books.getTitle())) 
				return i;
		}
		return -1; 
	}
	
	void printBook(int index) { System.out.print(bookList.get(index)); }
	void displayAll() {
		int i = 1;
		for (Book book : bookList) {
			System.out.println(i + ". " + book);
			i++;
		}
	}
	Book[] sortedBookList() {
		Collections.sort(bookList, new AscCategory());
		Book[] bookArr = new Book[bookList.size()];
		
		for(int i = 0; i < bookList.size(); i++) {
			bookArr[i] = bookList.get(i);
		}
		return bookArr;
	}
	
	void printBookList(Book[] br) {
		for (Book book : br) {
			System.out.println(book);
		}
	}
}
