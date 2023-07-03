package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {
		// 바이트 기반 스트림
		InputStream is = null;
		OutputStream os = null;
		try {
			// 파일 입출력
			is = new FileInputStream("mmzero_wallpaper.jpg");
			os = new FileOutputStream("mmzero_wallpaper.copy.jpg");
			
			int data = -1;
			while((data = is.read()) != -1) {
				os.write(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found:"+e);
		} catch (IOException e) {
			System.out.println("Error:"+e);
		} finally {
			// 자원 정리
			try {
				// null일 가능성은 거의 없지만 그래도 혹시 모르니...
				if(is != null) {
					is.close();
				}
				if(os != null) {
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
