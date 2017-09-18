import java.util.Stack;

public class Minstack {
	public static void main(String[] args) {
		Minstack minStack = new Minstack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		minStack.getMin(); 
		minStack.pop();
		minStack.top();      
		minStack.getMin(); 
	}
	private Stack<Integer> s = new Stack<Integer>();
	
	private Stack<Integer> minStack = new Stack<Integer>();
	
	public void push(int x) {
		s.push(x);
		if (minStack.isEmpty() || x <= minStack.peek()) {
			minStack.push(x);
		}
	}
	
	public void pop() {
		if (s.pop().equals(minStack.peek())) {
			minStack.pop();
		}
	}
	
	public int top() {
		return s.peek();
	}
	
	public int getMin() {
		return minStack.peek();
	}
}
