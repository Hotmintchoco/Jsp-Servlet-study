package home.menu;

import java.util.Scanner;

public class CashBurgerKing {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		CashBurgerKing burger = new CashBurgerKing();
		burger.selectMenu();
	}
	
	public void selectMenu(){
		String[] menuList = new String[10];
		int[] menuAmout = new int[10];
		int[] menuPay = new int[10];
		String menu = "";
		int totalPay = 0;
		int pay = 0;
		int i = 0;
		Outer:
		while (true) {
			System.out.println("*** 메뉴를 선택하세요 ***");
			System.out.println();
			System.out.println("*** 햄버거 ***");
			System.out.println("1. 불고기버거	3500원");
			System.out.println("2. 치킨버거	3200원");
			System.out.println("*** 추가  ***");
			System.out.println("3. 감자튀김	1000원");
			System.out.println("4. 치즈스틱	400원");
			System.out.println("5. 샐러드		2000원");
			System.out.println("*** 음료수  ***");
			System.out.println("6. 콜라		700원");
			System.out.println("7. 에이드		1200원");
			System.out.println("8. 커피		1000원");
			System.out.println("********************");

			System.out.print("메뉴 선택 : ");

			int inputBurger = sc.nextInt();
			switch (inputBurger) {
			case 1: menu = "불고기버거"; break;
			case 2: menu = "치킨버거"; break;
			case 3: menu = "감자튀김"; break;
			case 4: menu = "치즈스틱"; break;
			case 5: menu = "샐러드"; break;
			case 6: menu = "콜라"; break;
			case 7: menu = "에이드"; break;
			case 8: menu = "커피"; break;
			default:
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			menuList[i] = menu;
			System.out.println(menu + "를 선택하셨습니다.");

			System.out.print("수량은? ");
			int amount = sc.nextInt();
			if (amount > 0) {
				switch (inputBurger) {
				case 1: pay = 3500 * amount; break;
				case 2: pay = 3200 * amount; break;
				case 3: pay = 1000 * amount; break;
				case 4: pay = 400 * amount; break;
				case 5: pay = 2000 * amount; break;
				case 6: pay = 700 * amount; break;
				case 7: pay = 1200 * amount; break;
				case 8: pay = 1000 * amount; break;
				}
			}
			menuAmout[i] = amount;
			menuPay[i] = pay;
			System.out.println(amount + "개 주문하셨습니다.");
			
			System.out.print("추가 주문하시겠습니까?(y/n) :");
			String input = sc.next();
			
			i++;
			if (input.equalsIgnoreCase("n")) {
				for (int j = 0; j < i; j++) {
					System.out.println(menuList[j] + " : " 
				+ menuAmout[j] + "개 - " + menuPay[j]+"원");
					totalPay += menuPay[j];
				}
				System.out.println("총 가격 : " + totalPay+"원");
				break Outer;
			}
		}

	}
}
