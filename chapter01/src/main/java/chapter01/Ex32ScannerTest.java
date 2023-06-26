package chapter01;

import java.util.Scanner;

public class Ex32ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("상품 정보를 입력하세요");
		
		System.out.print("이름:");
		String name = scanner.next();	// 사용자가 입력할 때까지 block됨
		
		System.out.print("가격:");
		int price = scanner.nextInt();	// 사용자가 입력할 때까지 block됨
		
		System.out.print("재고량:");
		int countStock = scanner.nextInt();	// 사용자가 입력할 때까지 block됨
		
		System.out.println(name+":"+price+":"+countStock);
		
		scanner.close();
	}

}
