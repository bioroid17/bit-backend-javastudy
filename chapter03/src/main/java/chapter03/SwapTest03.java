package chapter03;

public class SwapTest03 {

	public static void main(String[] args) {
		IntValue a = new IntValue(10);
		IntValue b = new IntValue(20);
		
		System.out.println("a:"+a.value+", b:"+b.value);
		
		swap(a, b);

		System.out.println("a:"+a.value+", b:"+b.value);	// call by value -> 값이 swap되지 않음
	}

	public static void swap(IntValue p, IntValue q) {
		int temp = p.value;
		p.value = q.value;
		q.value = temp;
	}
}
