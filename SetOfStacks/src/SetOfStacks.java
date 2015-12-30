import java.util.ArrayList;
import java.util.Stack;

public class SetOfStacks {
	public static void main(String args[] ) {
		
		StackList myList = new StackList();
		myList.push(12);
		myList.push(13);
		myList.push(14);
		myList.push(15);
		myList.push(16);
		myList.push(17);
		myList.push(90);
		
		System.out.println(myList.peek());
		System.out.println(myList.getCount());
	}
}

class StackList {
	ArrayList<Stack<Integer>> listOfStacks = new ArrayList<Stack<Integer>>();
	int capacity = 100;
	int count = 0;
	
	public void push(int data) {
		Stack<Integer> last = getLastStack();
		if(last != null && !isFull(last)) {
			last.push(data);
		} else {
			Stack<Integer> stack = new Stack<Integer>();
			count ++;
			stack.push(data);
			listOfStacks.add(stack);
		}
	}
	
	public int pop() {
		Stack<Integer> last = getLastStack();
		int data = last.pop();
		if (last.size() == 0)
			listOfStacks.remove(listOfStacks.size() - 1);
		return data;
	}
	
	public int peek() {
		Stack<Integer> last = getLastStack();
		int data = last.peek();
		return data;
	} 
	
	public Stack<Integer> getLastStack() {
		if(listOfStacks.size() == 0)
			return null;
		return listOfStacks.get(listOfStacks.size() - 1);
	}
	
	public Boolean isFull(Stack<Integer> stack) {
		return stack.size() == capacity;
	}
	
	public int getCount() {
		return this.count;
	}
}
