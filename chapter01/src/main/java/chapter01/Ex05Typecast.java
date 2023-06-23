package chapter01;

public class Ex05Typecast {

	public static void main(String[] args) {
		byte b = 25;
		short s = b;	// 암시적 캐스팅
		int i = s;		// 암시적 캐스팅
		long l = i;		// 암시적 캐스팅
		float f = i;	// 암시적 캐스팅
		double d = f;	// 암시적 캐스팅

		byte b1 = (byte) 256;	// 명시적 캐스팅 필요

		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);

		System.out.println("f = " + f);
		System.out.println("d = " + d);
		System.out.println("b1 = " + b1);

	}

}
