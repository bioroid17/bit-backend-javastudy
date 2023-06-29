package chapter04;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// <> 안에 들어가는 것을 Generic이라고 한다.
		// Set은 순서가 없다.
		Set<Rect> s = new HashSet<Rect>();

		Rect r1 = new Rect(10, 20);
		Rect r2 = new Rect(40, 5);

		s.add(r1);
		s.add(r2);
		

		for (Rect r : s) {
			System.out.println(r);
		}
	}

}
