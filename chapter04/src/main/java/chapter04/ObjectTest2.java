package chapter04;

public class ObjectTest2 {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		Point p3 = p2;
		
		// == : 두 객체의 동일성
		System.out.println(p1 == p2);	// false
		System.out.println(p2 == p3);	// true
		
		// equals : 두 객체의 동질성(내용 비교)
		// 부모 클래스 Object에서 구현된 equals는 동일성 비교와 같다.
		// Java에서 모든 클래스 객체에 대해 동질성 비교를 해줄순 없기 때문
		System.out.println(p1.equals(p2));	// false
		System.out.println(p2.equals(p3));	// true
	}

}
