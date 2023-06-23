package chapter01;

public class Ex06Typecast {

	public static void main(String[] args) {
		byte b;
		int i = 414;
		float f = (float) 123.456;	// 소수는 기본 double형이므로 명시적 캐스팅 필요
		
		b=(byte)i;
		System.out.println("int 414를 byte로 변환 : " + b);
		i=(int)f;
		System.out.println("float 123.456을 int로 변환: " + i);
		b=(byte)f;
		System.out.println("float 123.456을 byte로 변환: " + b);
	}

}
