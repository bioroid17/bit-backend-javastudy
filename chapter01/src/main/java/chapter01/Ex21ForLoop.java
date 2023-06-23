package chapter01;

public class Ex21ForLoop {

	public static void main(String[] args) {
		final int LOOP_COUNT = 10;
		
		// Ex18의 while loop를 for loop로 변경
		for (int i = 0; i < LOOP_COUNT; i++) {
			System.out.println(i + ". hello");
		}
	}

}
