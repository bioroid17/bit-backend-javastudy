package chapter01;

public class Ex03Typecast {

	public static void main(String[] args) {
		int i1 = 10;
		long l1 = 1000;
		
		float f1 = 3.14f;
		double d1 = 3.14;
		
		// 명시적(explicit) 캐스팅
		// 사이즈가 큰 값을 작은 쪽에 넣을 때는 타입을 명시해야 한다.
		int i2 = (int) l1;
		float f2 = (float) d1;
		int i3 = (int) f1;
		
		// 암시적(implicit) 캐스팅
		// 사이즈가 작은 값을 큰 쪽에 넣을 때는 타입을 명시할 필요 없다.
		int l2 = i1;
		double d2 = f1;
		double d3 = i1;
		
		// 데이터의 의미가 다르면 캐스팅 자체가 되지 않는다.
		// boolean b = (boolean) i1;
	}

}
