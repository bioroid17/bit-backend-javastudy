package chapter01;

public class Ex29Array {

	public static void main(String[] args) {
		int score01 = 90;
		int score02 = 60;
		int score03 = 100;
		int score04 = 80;
		int score05 = 94;
		int score06 = 68;
		int score07 = 72;
		int score08 = 84;
		int score09 = 88;
		int score10 = 60;
		
		int sum = score01 + score02 + score03 + score04 + score05 + score06 + score07 + score08 + score09 + score10;
		double average = sum / 10;
		
		System.out.println("평균:"+average);

		// 배열: 정적, 리스트: 동적
		
		// new: 반드시 사이즈를 줘야 한다
		// 직접 사이즈를 주는 방법
		// int[] scores = new int[10];
		// 데이터의 수로 사이즈를 정의하는 방법
		int[] scores = new int[] {90, 60, 100, 80, 94, 68, 72, 84, 88, 60};	// 배열은 무조건 고정 크기
		int sum2 = 0;
		for (int i = 0; i < scores.length; i++) {	// length: 배열의 attribute. 모은 데이터의 수를 반환
			System.out.println(scores[i]);
			sum2 += scores[i];
		}
		double average2 = sum2 / scores.length;
		System.out.println("평균:"+average2);
	}

}
