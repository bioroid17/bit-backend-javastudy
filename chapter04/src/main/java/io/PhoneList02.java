package io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 {

	public static void main(String[] args) {
		Scanner scanner = null;

		try {
			File file = new File("phone.txt");
			// 예전에는 File이 없으면 예외 처리를 썼지만, 요즘은 로직으로 처리한다.
			// 예외 처리는 코스트가 비싸다.
			if (!file.exists()) {
				System.out.println("File Not Found");
				return;
			}

			System.out.println("=== 파일정보 ===");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "bytes");
			System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified()))); // 1900년 01월 01일 00:00:00으로부터 지난 초 수

			System.out.println("=== 전화번호 ===");
			scanner = new Scanner(file);
			
			while(scanner.hasNextLine()) {
				String name = scanner.next();
				String phone1 = scanner.next();
				String phone2 = scanner.next();
				String phone3 = scanner.next();
				
				System.out.println(name+":"+phone1+"-"+phone2+"-"+phone3);
			}
		} catch (Exception e) {
			// 만약 encoding이 uto-8 같은 존재하지 않는 인코딩 방식이라면 여기로 옴
			System.out.println("Error:" + e);
		} finally {
			scanner.close();
		}
	}

}
