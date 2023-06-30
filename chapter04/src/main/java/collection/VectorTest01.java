package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		// Generic은 객체가 들어가야 한다. 기본 타입은 불가
		// Vector v 보다는 List l 처럼 List 타입을 쓰자
		Vector<String> v = new Vector<String>();
		
		// 옛날 방식 구현
		v.addElement("둘리");
		v.addElement("마이콜");
		v.addElement("도우너");
		
		// 순회1
		for (int i = 0; i < v.size(); i++) {
			String s = v.elementAt(i);
			System.out.println(s);
		}
		
		// 삭제
		v.removeElementAt(2);
		
		System.out.println("======");
		
		// 순회 2
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		}
	}

}
