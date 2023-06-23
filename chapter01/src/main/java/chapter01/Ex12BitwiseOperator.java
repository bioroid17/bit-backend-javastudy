package chapter01;

public class Ex12BitwiseOperator {

	public static void main(String[] args) {
		int a = 0x0f;	// 00001111
		int b = 0xf0;	// 11110000
		
		System.out.println(a & b);	// 00000000
		System.out.println(a | b);	// 11111111
		System.out.println(a ^ b);	// 11111111
		System.out.println(~a);		// -16
		System.out.println(a >> 3);	// 00000001
		System.out.println(a << 3);	// 01111000
	}

}
