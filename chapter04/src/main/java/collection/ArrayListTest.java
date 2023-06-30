package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// VectorTest02.java에서 복붙. Vector -> ArrayList로 바꾼거 말고는 아무데도 안 건드림
		// Vector와 ArrayList 사이에서 뭘 쓸지 잘 생각해야 한다.
		// 만약 XML 등으로 상황마다 사용할 클래스 등을 관리할 수 있다면, 이것을 Component식 개발이라고 한다.
		List<String> list = new ArrayList<>();

		list.add("둘리");
		list.add("마이콜");
		list.add("도우너");
		
		// 순회1
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		
		// 삭제
		list.remove(2);
		
		System.out.println("==================");
		
		// 순회2
		// Collection 프레임워크 방식
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		System.out.println("==================");
		
		// 순회3
		// iterator가 구현되어 있으면 foreach 사용 가능
		// 배열은 iterator가 없지만 foreach 사용 가능
		for(String s : list) {
			System.out.println(s);
		}

	}

}
