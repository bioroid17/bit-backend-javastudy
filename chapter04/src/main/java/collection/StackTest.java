package collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		stack.push("Hello");
		stack.push("World");
		stack.push("!!!");
		stack.push("java");
		stack.push(".");
		
		while(!stack.isEmpty()) {
			String s = stack.pop();
			System.out.println(s);
		}
		
		System.out.println("=============");
		
		stack.push("Hello");
		System.out.println(stack.pop());
		
		// 스택이 비어있는 경우, pop() 호출 시 예회가 발생한다.
//		stack.pop();
		
		stack.push("둘리");
		stack.push("마이콜");
		stack.push("도우너");

		System.out.println(stack.pop());
		System.out.println(stack.peek());	// 맨 위에 있는 element를 pop 하지 않고 본다.
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.out.println(stack.size());
	}

}
