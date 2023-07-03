package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;

public class FileReaderTest {

	public static void main(String[] args) {
		// 1234.txt: 가나다라마바사
		Reader in = null;
		InputStream is = null;
		try {
			in = new FileReader("1234.txt");	// 뒤에 인코딩 안 주면 기본적으로 utf-8
			int data = -1;
			int count = 0;
			while((data = in.read()) != -1) {
				System.out.print((char)data);
				count++;
			}
			System.out.print("\n");
			System.out.println("count:"+count);	// 7
			System.out.println("============================");
			
			is = new FileInputStream("1234.txt");
			data = -1;
			count = 0;
			while((data = is.read()) != -1) {
				System.out.print((char)data);	// 글자는 깨진다.
				count++;
			}
			System.out.print("\n");
			System.out.println("count:"+count);	// 7 * 3 = 21 (한글은 글자 당 3바이트)
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found:"+e);
		} catch (IOException e) {
			System.out.println("Error:"+e);
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
