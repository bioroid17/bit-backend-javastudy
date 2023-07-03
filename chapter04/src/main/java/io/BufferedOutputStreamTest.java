package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		try {
			// 기반 스트림 (=주 스트림)
			FileOutputStream fos = new FileOutputStream("test.txt");
			
			// 보조 스트림
			bos = new BufferedOutputStream(fos);
			
//			for(char c = 'a'; c <= 'z'; c++)
			for(int i = 97; i <= 122; i++) {
				bos.write(i);
//				bos.flush();	// 버퍼가 다 차지 않아도 명시적으로 비움
			}
		} catch (FileNotFoundException e) {
			System.out.println("Cannot open:"+e);
		} catch (IOException e) {
			System.out.println("Cannot open:"+e);
		} finally {
			try {
				// 가장 마지막 보조 스트림만 닫으면 연결된 스트림 모두 연쇄적으로 닫힌다.
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
