package chapter04;

public class StringTest02 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;
		
//		System.out.println(s1.toUpperCase());	// String은 불변 객체이므로 s1 원본이 변경되지 않는다. 새로 생긴 리터럴을 반환한 것 뿐.
		s2 = s1.toUpperCase();					// 새로운 리터럴을 계속해서 참조한다. s3는 계속 원래 참조하던 기존의 s2 리터럴(def)를 참조함
		String s4 = s2.concat("??");			// s2 + "???"
		String s5 = "!".concat(s2).concat("@");	// "!" + s2 + "@"
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);

//		String s6 = null;	// NullPointerException
		String s6 = "Hello";
		System.out.println(equalsHello(s6));
	}

	public static boolean equalsHello(String s) {
//		return s.equals("Hello");
		return "Hello".equals(s);
	}
}
