package practice2;

import java.util.Scanner;

public class TestBookManager {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		menu();
	}
	public static void menu(){
		BookManager bookManager = new BookManager();
		
		Outer:
		while (true) {
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println();
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
			
			
			String inputStr = sc.nextLine();
			int input = Integer.parseInt(inputStr);
			
			switch (input) {
			case 1:
				bookManager.addBook(inputBook());
				break;
			case 2:
				Book[] books = bookManager.sortedBookList();
				bookManager.printBookList(books);
				break;
			case 3:
				try {
					System.out.println("삭제할 도서의 index를 입력하세요.");
					String strIndex = inputBookTitle();
					int intIndex = Integer.parseInt(strIndex);
					bookManager.printBook(intIndex);
					System.out.println(" 삭제합니다.");
					bookManager.deleteBook(intIndex);
				} catch (Exception e) {
					System.out.println("해당 index의 도서가 없습니다.");
				}
				break;
			case 4:
				System.out.println("검색할 도서의 도서명을 입력하세요.");
				String bookTitle = inputBookTitle();
				int bookIndex = bookManager.searchBook(bookTitle);
				
				if (bookIndex > 0)
					bookManager.printBook(bookIndex);
				else
					System.out.println("해당 도서가 존재하지 않습니다.");
				
				System.out.println();
				break;
			case 5:
				bookManager.displayAll();
				break;
			case 6:
				System.out.println("프로그램 종료.");
				break Outer;
				
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
	
	static Book inputBook() {
		System.out.println("도서번호, 분류코드(1.인문/2.자연과학/3.의료/4.기타), " 
				+ "책제목, 저자를 입력하세요.");
		System.out.println(",를 기준으로 각각 저장됩니다.");

		String input = sc.nextLine();
		String[] strInput = input.split(",");
		int inputCategory = 0;

		for (int i = 0; i < strInput.length; i++) {
			strInput[i] = strInput[i].trim();

			if (i == 1)
				inputCategory = Integer.parseInt(strInput[i]);
		}

		Book book = new Book(strInput[0], inputCategory,
				strInput[2], strInput[3]);
		
		return book;
	}

	static String inputBookTitle() {
		String strIndex = sc.nextLine();
		return strIndex;
	}
}
