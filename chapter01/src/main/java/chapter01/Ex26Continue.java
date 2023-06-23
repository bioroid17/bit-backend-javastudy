package chapter01;

public class Ex26Continue {

	public static void main(String[] args) {
		// while 문에서 continue 구문을 사용할 때는 조건 변경을 신경써야 한다.
		// testWhile();

		// 조건 변경식의 배치가 무한 루프를 발생시키지 않음
		testFor();

	}

	// main이 static이므로 testFor 또한 static이어야 한다.
	public static void testFor() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

	public static void testWhile() {
		int i = 0;
		while (i < 10) {
			if (i % 2 != 0) {
				// 여기 때문에 무한루프
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
}
