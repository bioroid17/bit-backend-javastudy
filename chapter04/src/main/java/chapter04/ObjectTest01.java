package chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		
//		Class klass = p.getClass();
//		System.out.println(klass);

		// 아래의 메소드는 Object 클래스에서 상속받은 함수
		System.out.println(p.getClass());	// reflection: 필드, 메소드, 어노테이션 정보를 알아낼 수 있다.
		System.out.println(p.hashCode());	// address가 아니다. JVM은 절대 주소를 개발자에게 드러내지 않는다.
											// reference 값도 아니다. 마찬가지로 드러내지 않음
											// hashCode()는 address를 기반으로 한 해싱 값이다. 단, 암호화와는 다르다.
											// 어디까지나 정수값으로 만들어서 비교하기 위한 값
		System.out.println(p.toString());	// getClass().getName() + "@" + hashCode()(16진수)
		System.out.println(p);	// toString과 같은 결과
	}

}
