package chapter04;

public class StringTest03 {

	public static void main(String[] args) {
		String s1 = "aBcABCabcAbc";
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf("abc"));
		System.out.println(s1.indexOf("abc", 7));	// 없으면 -1 반환
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 5));
		
		String s2 = "    ab    cd    ";
		String s3 = "efg,hij,klm,nop,qrs";
		
		String s4 = s1.concat(s3);
		System.out.println(s4);
		
		System.out.println("----"+s2.trim()+"----");	// trim: 나뭇가지를 다듬다, 불필요한 부분을 잘라내다
		// trim 사용 예시: 이메일이나 비밀번호 등에서 공백 제거하기, 한글 제거 등
		System.out.println("----"+s2.replaceAll(" ", "")+"----");
		
		String[] tokens = s3.split(",");
		for (String s : tokens) {
			System.out.println(s);
		}
		
		String[] tokens2 = s3.split(" ");
		for (String s : tokens2) {
			System.out.println(s);
		}
	}

}
