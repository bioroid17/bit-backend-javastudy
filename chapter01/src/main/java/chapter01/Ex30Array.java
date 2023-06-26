package chapter01;

public class Ex30Array {

	public static void main(String[] args) {
		// 이 코드는 작동하지 않음. 선언 시 크기 지정 불가
		// int[30] a;
		
		// 비추
		int a1[] = new int[10];
		System.out.println(a1.length);
		
		// 강추. 변수 선언과 자료형에 일관성이 있어보임
		int[] a2 = new int[10];
		System.out.println(a2.length);
		
		// 초기화1
		int[] a3 = {0, 1, 2, 3, 4}; // 배열도 객체이므로 원래는 new를 써야 하지만, Java에서 리터럴 대입 가능하게 편의를 봐주는 것
		System.out.println(a3.length);
		
		// 초기화2
		int[] a4 = new int[5];
		a4[0] = 0;
		a4[1] = 1;
		a4[2] = 2;
		a4[3] = 3;
		a4[4] = 4;
		System.out.println(a4.length);
		
		// 초기화3
		int[] a5 = new int[] {0, 1, 2, 3, 4};
		System.out.println(a5.length);
		
		// 사용1: 랜덤 접근
		System.out.println(a5[3]);
		
		// 사용2: 순회(iteration)
		for (int i = 0; i < a5.length; i++) {
			System.out.println(a5[i]);
		}
	}

}
