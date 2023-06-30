package exception;

public class MyException extends Exception {
	// 사용자 정의 예외 클래스
	
	private static final long serialVersionUID = 1L;

	public MyException() {
		super("MyException Occurs");
	}
	
	public MyException(String msg) {
		super(msg);
	}
}
