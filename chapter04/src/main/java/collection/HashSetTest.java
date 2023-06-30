package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		
		String s1 = new String("둘리");	// 리터럴 풀이 아닌 heap에 적재된다.

		s.add("둘리");
		s.add("마이콜");
		s.add("또치");
		
		// 자료 구조는 객체의 동일성보다 동질성이 더 중요하다.
		System.out.println(s.size());
		System.out.println(s.contains(s1));	// contains: 값 기반. s1 객체 자체는 s에 없지만 true 반환. 값만 보기 때문에 가능한 것
		
		// 삭제
		s.remove("마이콜");
		
		// 순회
		for (String str : s) {
			System.out.println(str);
		}
	}

}
