package chapter01;

public class Ex24DoWhile {

	public static void main(String[] args) {
		final int LOOP_COUNT = 10;

		int i = 0;

		do {
			// 조건 따지지 않고 무조건 한 번은 실행
			System.out.println(i + ". hello");
			i = i + 1;
		} while (i < LOOP_COUNT);

	}

}
