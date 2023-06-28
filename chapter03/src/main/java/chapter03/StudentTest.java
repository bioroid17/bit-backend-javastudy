package chapter03;

public class StudentTest {

	public static void main(String[] args) {
		// 부모 생성자가 자식 생성자보다 먼저 호출
		Student s1 = new Student();
		s1.setGrade(1);
		
		Person p1 = s1;	// 업캐스팅(Upcasting). 암시적(implicitly) 캐스팅 가능하다.
		p1.setName("둘리");
		
		Student s2 = (Student) p1;	// 다운개스팅(Dowmcasting). 명시적(explicitly) 캐스팅만 가능하다.
		s2.setMajor("Computer Science");
		
		// 괄호로 p1을 묶지 않으면 setMajor의 리턴 타입인 null을 Student로 캐스팅 하려고 해서 오류 발생
//		((Student) p1).setMajor("Computer Science 2");
	}

}
