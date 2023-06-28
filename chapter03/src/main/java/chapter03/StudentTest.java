package chapter03;

public class StudentTest {

	public static void main(String[] args) {
		// 부모 생성자가 자식 생성자보다 먼저 호출
		Student s1 = new Student();
		s1.setGrade(1);
		
		// Upcasting: 자식 클래스가 부모 클래스 타입으로 변환되는 것. 암시적(implicitly) 캐스팅 가능하다.
		Person p1 = s1;
		p1.setName("둘리");
		
		// Downcasting: 업캐스팅 된 것을 원래대로 되돌린다. 명시적(explicitly) 캐스팅만 가능하다.
		Student s2 = (Student) p1;
		s2.setMajor("Computer Science");
		
		// 괄호로 p1을 묶지 않으면 setMajor의 리턴 타입인 null을 Student로 캐스팅 하려고 해서 오류 발생
//		((Student) p1).setMajor("Computer Science 2");
	}

}
