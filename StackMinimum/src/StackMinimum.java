
public class StackMinimum {
	public static void main(String args[] ) {
		Stack myStack = new Stack();
		
		myStack.push(688);
		myStack.push(2667);
		myStack.push(632);
		myStack.push(643);
		myStack.push(64);
		myStack.push(697);
		myStack.push(65);
		myStack.push(464);
		myStack.push(466);
		myStack.push(2);
		myStack.pop();
		
		System.out.println(myStack.min());
	}

}

class Stack {
	Node top;
	
	Stack1 minStack = new Stack1();
	
	public void push(int data) {
		if(isEmpty()) {
			minStack.push(data);
		} else {
			int min = minStack.peek();
			if (min > data) {
				minStack.push(data);
			}
		}
		
		Node n = new Node(data);
		n.setNext(top);
		top = n;
	}
	
	public int pop() {
		int data = top.getData();
		int min = minStack.peek();
		if(min == data) {
			minStack.pop();
		}
		
		top = top.getNext();
		return data;
	}
	
	public int min() {
		return minStack.peek();
	}
	
	public Boolean isEmpty() {
		return top == null;
	}
}

class Stack1 {
	private Node top;
	
	public void push(int data) {
		Node n = new Node(data);
		n.setNext(top);
		top = n;
	}
	
	public int pop() {
		int data = top.getData();
		top = top.getNext();
		return data;
	}
	
	public int peek() {
		return top.getData();
	}
}

class Node {
	private int data;
	private Node next;
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
