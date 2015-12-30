
public class RemoveDuplicatesLL {
	public static void main(String args[]) {
		
	}
}

class LinkedList {
	Node head;
	
	public void addData(int data) {
		addData(data, head);
	}

	private void addData(int data, Node head) {
		Node n = head;
		Node last = new Node(data);
		
		while (n.getNext() != null) {
			n = n.getNext();
		}
		n.setNext(last);		
	}
}

class Node {
	private int data;
	private Node next;
	
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
		this.data = -1;
		this.next = null;
	}
}