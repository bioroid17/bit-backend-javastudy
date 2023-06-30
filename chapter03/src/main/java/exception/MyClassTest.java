package exception;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		try {
			myClass.danger();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
