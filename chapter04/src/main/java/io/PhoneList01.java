package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		BufferedReader br = null;

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

			Date d = new Date(file.lastModified()); // 1900년 01월 01일 00:00:00으로부터 지난 초 수
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			System.out.println(sdf.format(d));

			System.out.println("=== 전화번호 ===");
			
			// 1. 기반 스트림
			FileInputStream fis = new FileInputStream(file);

			// 2. 보조 스트림 1 (byte1|byte2|byte3 -> char)
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");

			// 3. 보조 스트림 2 (char1|char2|char3|\n -> String "char1char2char3")
			br = new BufferedReader(isr);

			String line = null;
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, "\t ");

				int index = 0;
				while(st.hasMoreElements()) {
					String token = st.nextToken();
					if(index == 0) {
						System.out.print(token + ":");
					} else if(index == 1) {
						System.out.print(token + "-");
					} else if(index == 2) {
						System.out.print(token + "-");
					} else {
						System.out.print(token);
					}
					index++;
				}
				System.out.print("\n");
			}
			// 위 내용은 scanner가 완전히 wrapping 하고 있음
		} catch (UnsupportedEncodingException e) {
			// 만약 encoding이 uto-8 같은 존재하지 않는 인코딩 방식이라면 여기로 옴
			System.out.println("Error:" + e);
		} catch (IOException e) {
			System.out.println("Error:" + e);
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
