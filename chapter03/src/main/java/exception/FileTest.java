package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileTest {

	public static void main(String[] args) {
		InputStream is = null;
		try {
			// 생성자 차원에서 컴파일러가 예외 처리를 강제한다. (FileNotFoundException)
			is = new FileInputStream("hello.txt");	// chapter3 maven module 바로 아래에 위치한다.
			// read 메소드도 IOException 처리를 강제한다.
			int data = is.read();
			System.out.println((char)data);
		} catch (FileNotFoundException e) {
			System.out.println("error:"+e);
		} catch (IOException e) {
			System.out.println("error:"+e);
		} finally {
			try {
				if(is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
