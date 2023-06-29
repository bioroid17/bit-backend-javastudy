package chapter04;

public class WrapperClassTest {

	public static void main(String[] args) {
		// deprecated. 조만간 없어질 예정
		Integer i = new Integer(10);
		
		// Auto Boxing.
		Integer i2 = 10;	// 상수 풀이 작동한다.
		Long l = 10L;
		
		System.out.println(i2.equals(10));	// object가 들어가야 하는데 기본 타입이 들어갈 수 있는 이유는 auto boxing 때문
		
		// Auto Unboxing
		System.out.println(i2 == 10);
		// System.out.println(i2.intValue() == 10);	// 위의 코드와 동일한 결과
		
		int m = i2 + 10;	// Auto Unboxing 덕에 가능
//		int m = i2.intValue() + 10;
	}

}
