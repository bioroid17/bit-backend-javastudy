package chapter04;

public class StringTest01 {

	public static void main(String[] args) {
		// window:	c:\temp
		// unix:	home/trace/dowork
		// Java 코딩 시 경로 문자열은 Unix 방식으로 짜자. 대다수의 플랫폼이 /(슬래시)를 사용하기 때문
		// 윈도우만 역슬래시 사용
		// Java에서 역슬래시를 일반 슬래시로 바꿔줄 것이다.
		
		// \t는 tab이다. \를 출력하려면 \\로 쓴다.
		System.out.println("c:\\temp");
		
		/// "hello"
		System.out.println("\"hello\"");
		// \t: tab
		// \r: carriage return
		// \n: new line
		// \b: beep
		
		// '
		char c = '\'';
		System.out.println(c);

	}

}
