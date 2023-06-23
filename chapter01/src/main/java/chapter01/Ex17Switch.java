package chapter01;

public class Ex17Switch {

	public static void main(String[] args) {
		char grade = ' ';
		int score = 100;

		// Ex13 if 문을 switch문으로 변환
		switch (score/10) {
		case 10:
		case 9: {
			grade = 'A';
			break;
		}
		case 8: {
			grade = 'B';
			break;
		}
		case 7: {
			grade = 'C';
			break;
		}
		case 6: {
			grade = 'D';
			break;
		}
		default: {
			grade = 'F';
			break;
		}
		}

		System.out.println("학점은 " + grade + "입니다.");
	}

}
