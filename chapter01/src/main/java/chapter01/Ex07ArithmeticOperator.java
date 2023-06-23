package chapter01;

public class Ex07ArithmeticOperator {

	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		
		// binary operator (이항연산자)
		System.out.println(a + b);	// 10
		System.out.println(a - b);	// -4
		System.out.println(a * b);	// 21
		System.out.println(a / b);	// 0, 정수 / 정수의 결과는 정수이다.
		System.out.println(a % b);	// 3
		
		// unary operator (단항연산자)
		System.out.println(-a);		// -3
		
		++a;	// 전위 연산자
		System.out.println(a);		// 4
		
		a++;	// 후위 연산자
		System.out.println(a);		// 5

		System.out.println(a++);	// 5, 후위 연산이므로 함수 호출 후에 연산을 한다.
		
//		System.out.println(a);
//		a = a + 1;
		
		System.out.println(a);		// 6
		
		System.out.println(++a);	// 7, 전위 연산이므로 함수 호출 전에 연산을 한다.
		
//		a = a + 1;
//		System.out.println(a);
		
		System.out.println(a);		// 7

		System.out.println(--a);	// 6
		System.out.println(a);		// 6
		System.out.println(a--);	// 6
		System.out.println(a);		// 5
	}

}
