package chapter01;

public class Ex15IfStatement {

	public static void main(String[] args) {
		// 최대값을 판별하는 조건을 완성해 보세요.
		int a1 = 120;
		int a2 = 100;
		int a3 = 25;

		if (a1 >= a2) {
			if (a1 < a3) {
				System.out.println("최댓값은 "+a3+"입니다.");
			} else {
				System.out.println("최댓값은 "+a1+"입니다.");
			}
		} else {
			if (a2 < a3) {
				System.out.println("최댓값은 "+a3+"입니다.");
			} else {
				System.out.println("최댓값은 "+a2+"입니다.");
			}
		}
	}

}
