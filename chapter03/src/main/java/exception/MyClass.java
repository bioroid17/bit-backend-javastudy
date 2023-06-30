package exception;

public class MyClass {
	// 이 메소드는 MyException을 던질 가능성이 있음
	public void danger() throws MyException {
		System.out.println("some code1");
		
		// 조건이 맞으면 MyException을 던짐
		if(1-1 == 0) {
			throw new MyException();
		}
		
		System.out.println("some code2");
	}
}
