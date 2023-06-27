package chapter03;

import mypackage.Goods2;

public class Goods2App {

	public static void main(String[] args) {
		Goods2 g = new Goods2();
		
		// public은 접근 제한이 없다.
		g.name = "camera";
		
		// protected는
		// 1. 같은 패키지에서만 접근할 수 있다.
		// 2. 더 중요한 것은 자식에서 접근 가능하게 함
//		g.price = 1000;
		
		// 디폴트는 같은 패키지에서만 접근 가능하다.
//		g.countStock = 20;
		
		// private는 내부에서만 사용할 수 있다.
		// g.countSold = 10;
	}

}
