
public class StackImplementation {
	public static void main(String args[]) {
		Stack stack = new Stack();
		stack.push(12);
		stack.push(30);
		stack.push(123);
		stack.push(3034);
		stack.push(12312);
		stack.push(33230);
		stack.push(4312);
		stack.push(3760);
		stack.push(1287);
		stack.push(30938);
		stack.push(1278);
		stack.push(3098);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
		
		
		System.out.println("Hello World!");
	}
}


class Stack {
	Node top;
	
	public int pop() {
		if(top == null)
			return -1;
		
		int data = top.getData();
		top = top.getNext();
		
		return data;
	}
	
	public void push(int data) {
		Node n = new Node(data);
		n.setNext(top);
		top = n;
	}
	
	public int peek() {
		return top.getData();
	}
}

class Node {
	int data;
	Node next;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	public Node() {
		this.next = null;
	}
}
