package prob5;

public class MyStack {
	
	private String[] myStack;
	private int top;
	
	public MyStack(int n) {
		myStack = new String[10];
		top = 0;
	}
	
	public void push(String item) {
		myStack[top++] = item;
	}
	
	public String pop() throws MyStackException{
		top--;
		if (top == -1) {
			top++;
			throw new MyStackException("stack is empty");
		}
		String item = myStack[top];
		myStack[top] = null;
		return item;
	}
	
	public boolean isEmpty() {
		return top==0;
	}
}