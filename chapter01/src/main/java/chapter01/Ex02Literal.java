package chapter01;

/*
 * 리터럴(literal)이란, 프로그램 코드에 직접적으로 표현되는 값
 */
public class Ex02Literal {

	public static void main(String[] args) {
		// 소수 리터럴은 기본적으로 double 취급이므로 float 형은 f를 붙인다.
		float f = 3.14f;
		double d = 3.14;
		
		short s = 3;
		int i = 1;
		// 정수 리터럴은 기본적으로 int 취급이므로 long 형은 L을 붙인다.
		long l = 12345678901L;
		
		char c = 'A';
		byte b = 65;
		
		boolean bool = true;

		System.out.println(f);
		System.out.println(d);

		System.out.println(s);
		System.out.println(i);
		System.out.println(l);

		System.out.println(c);	// char는 문자 출력
		System.out.println(b);	// byte는 숫자 출력

		System.out.println(bool);
		
	}

}
