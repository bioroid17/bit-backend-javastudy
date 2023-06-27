package chapter03;

public class SwapTest02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a:"+a+", b:"+b);
		
		swap(a, b);

		System.out.println("a:"+a+", b:"+b);	// call by value -> 값이 swap되지 않음
	}

	public static void swap(int p, int q) {
		int temp = p;
		p = q;
		q = temp;
	}
}
