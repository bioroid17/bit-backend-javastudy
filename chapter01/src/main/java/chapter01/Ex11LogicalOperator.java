package chapter01;

public class Ex11LogicalOperator {

	public static void main(String[] args) {
		// !(not)
		// ! true => false
		// ! false => true
		System.out.println(!(3 != 2));	// false
		
		// &&(AND, 논리곱)
		// true && false => false
		// false && true => false
		// false && false => false
		// true && true => true
		System.out.println(3 > 2 && 3 > 4);	// false

		// ||(OR, 논리합)
		// true || false => true
		// false || true => true
		// false || false => false
		// true || true => true
		System.out.println(3 != 2 || -1 > 0);	// true
		
		// ^(XOR, 배타적 논리합)
		// true ^ false => true
		// false ^ true => true
		// false ^ false => false
		// true ^ true => false
		System.out.println(3 != 2 ^ -1 > 0);	// true
	}

}
