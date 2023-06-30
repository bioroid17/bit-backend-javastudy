package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 10 - a;
		
		System.out.println("some code1");
		try {
			System.out.println("some code2");
			int result = (1 + 2 + 3) / b;
			System.out.println("some code3");
			System.out.println("some code4");
		} catch(ArithmeticException ae) {
			/* 예외 처리 */
			// 비워놓지 말자. 정 쓸 거 없으면 이거라도 써라.
			// 근데 이건 예외 내용을 화면에 출력하는 거라서 썩 좋진 않음
			ae.printStackTrace();
			
			// 예외 처리 시 작성할 코드의 종류는 많지 않다. 사실상 정해져 있음
			// 1. 사과
			System.out.println("미안합니다.");
			
			// 2. 로깅
			System.out.println("error: "+ae);
			
			// 3. 정상적인 종료
			return;
		} finally {
			// 주로 자원 정리하는 코드를 넣는다.
			System.out.println("자원 정리");
			
			// line 39까지 정상 실행되건, line 12에서 예외가 발생해서 line 29에서 return이 실행되건 이 영역은 무조건 실행된다.
		}
		
		// 예외가 발생한 이후에 실행할 가능성이 있는 코드이기 때문에 비추
		// 예외 발생 시 프로그램은 종료되는 게 밎음
		// System.out.println("some code5");
	}

}
