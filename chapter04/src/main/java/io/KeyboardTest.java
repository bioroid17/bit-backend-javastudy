package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			// 1. 기반 스트림(표준 입력, stdin, System.in)

			// 2. 보조 스트림 1 (byte1|byte2|byte3 -> char)
			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");

			// 3. 보조 스트림 2 (char1|char2|char3|\n -> String "char1char2char3")
			br = new BufferedReader(isr);

			String line = null;
			while ((line = br.readLine()) != null) {
				if ("quit".equals(line)) {
					break;
				}
				System.out.println(line);
			}
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
