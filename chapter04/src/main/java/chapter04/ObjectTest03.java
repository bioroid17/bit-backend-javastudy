package chapter04;

public class ObjectTest03 {

	public static void main(String[] args) {
		// new로 선언. 둘이 다른 객체
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		System.out.println(s1 == s2);		// false
		System.out.println(s1.equals(s2));	// true
		System.out.println(s1.hashCode() + ":" + s2.hashCode());
		System.out.println(System.identityHashCode(s1) + ":" + System.identityHashCode(s2));
		
		System.out.println("======================================");
		
		// 리터럴로 선언
		String s3 = "hello";
		String s4 = "hello";
		System.out.println(s3 == s4);		// true
		System.out.println(s3.equals(s4));	// true
		System.out.println(s3.hashCode() + ":" + s4.hashCode());
		System.out.println(System.identityHashCode(s3) + ":" + System.identityHashCode(s4));
	}

}
