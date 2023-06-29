package chapter04;

public class StringTest04 {

	public static void main(String[] args) {
//		String s1 = "Hello" + " World " + "Java " + 17;
		
		String s1 = new StringBuffer("Hello ")
				.append(" World ")
				.append("Java ")
				.append(17)
				.toString();	// 메소드 chain. 자기자신을 반환하는 메소드에 자기자신을 계속 호출한다.
		
		System.out.println(s1);
		
		String s2 = "";
		for (int i = 0; i < 100000; i++) {
			s2 = s2 + i;
//			s2 = new StringBuffer(s2).append(i).toString();	// 메모리가 CPU                                
		}

	}

}
