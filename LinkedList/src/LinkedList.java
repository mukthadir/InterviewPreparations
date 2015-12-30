import java.util.HashSet;

public class LinkedList {
	public static void main(String args[]) throws InterruptedException {
		LL myLinkedList = new LL();
		
		myLinkedList.insert(7);
		myLinkedList.insert(5);
		myLinkedList.insert(6);
		myLinkedList.insertMiddle(5, 33);
		myLinkedList.insert(7);
		myLinkedList.insertLast(20);
		myLinkedList.insertMiddle(20, 100);
		myLinkedList.insert(8);
//		myLinkedList.insertMiddle(34, 37);
		myLinkedList.insert(9);
		myLinkedList.insert(7);
		myLinkedList.insertLast(20);
		myLinkedList.insertMiddle(20, 100);
		myLinkedList.insertLast(20);
		
//		System.out.println(myLinkedList.size());
				
		myLinkedList.print();
//		myLinkedList.reverse();
//		myLinkedList.printReverse();
		
		
//		myLinkedList.removeDuplicates();
		myLinkedList.removeDuplicates2();
		myLinkedList.print();
		
	}
}

class Node {
	Node next;
	int data;
	
	public Node() {
		this.next = null;
		this.data = 0;
	}
	
	public Node(int data) {
		this.next = null;
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}

class LL {
	private Node head;
	Node previous = null;

	public LL() {
		this.head = null;
	}

	public void removeDuplicates2() {
		head = removeDuplicates2(head);
	}

	private Node removeDuplicates2(Node head) {
		Node temp1 = head;
		Node temp2;
		
		while(temp1 != null) {
			temp2 = temp1;
			while(temp2.getNext() != null) {
				if(temp2.getNext().getData() == temp1.getData()) {
					temp2.setNext(temp2.getNext().getNext());
					continue;
				}
				temp2 = temp2.getNext();
			}
			temp1 = temp1.getNext();

		}
		
		return head;
	}

	public void removeDuplicates() {
		head = removeDuplicates(head);
	}

	private Node removeDuplicates(Node head) {
		Node tempHead = head;
		Boolean flag;
		HashSet<Integer> tempHashSet = new HashSet<Integer>();
		
		if(!isEmpty()) {
			tempHashSet.add(tempHead.getData());
		}
		
		while(tempHead.getNext() != null) {
			flag = tempHashSet.contains(tempHead.getNext().getData());
			if(flag) {
				tempHead.setNext(tempHead.getNext().getNext());
				continue;
			} else {
				tempHashSet.add(tempHead.getNext().getData());
			}
			tempHead = tempHead.getNext();
		}
		
		return head;
	}

	public void printReverse() {
		while(previous != null) {
			System.out.println(previous.data);
			previous = previous.getNext();
		}		
	}

	public void print() throws InterruptedException {
		Node tempHead = head;
		System.out.println("-------------------------------------------------------------");
		while(tempHead != null) {
			System.out.print(tempHead.data + "\t");
			tempHead = tempHead.getNext();
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------");
	}

	public Boolean isEmpty() {
		return head == null;
	}
	
	public void insert(int data) throws InterruptedException {
		head = insert(head, data);
	}

	private Node insert(Node head, int data) throws InterruptedException {
		Node node;
		
		node = new Node(data);
		if (!isEmpty()) {
			node.setNext(head);
		}
		head = node;
		
		return head;
	}
	
	public void insertLast(int data) {
		head = insertLast(head, data);
	}

	private Node insertLast(Node head, int data) {

		Node node;
		Node temphead = head;
		
		node = new Node(data);
		while (temphead.getNext() != null) {
			temphead = temphead.getNext();
		}
		temphead.setNext(node);
		
		return head;
	}
	
	public void insertMiddle(int prevData,int data) throws InterruptedException {
		head = insertMiddle(head, prevData,data);
	}

	private Node insertMiddle(Node head, int prevData, int data) throws InterruptedException {
		Node node;
		Node tempHead = head;
		
		node = new Node(data);
		
		while(tempHead!= null) {
			if (tempHead.getData() == prevData) {
				node.setNext(tempHead.getNext());
				tempHead.setNext(node);
				return head;
			}
			tempHead = tempHead.getNext();	
		}
		System.out.println(prevData + " not found and hence " + data + " not inserted.");
		return head;
	}

	public void reverse() {
		reverse(head);		
	}

	private void reverse(Node currentNode) {
		Node nextNode;
		
		while (currentNode != null) {
			nextNode = currentNode.getNext();
			currentNode.setNext(previous);
			previous = currentNode;
			currentNode = nextNode;
//			currentNode = currentNode.getNext();
			
		}
	}

	public int size() {
		Node temp = head;
		int count = 1;
		
		while(temp.next != null) {
			temp = temp.getNext();
			count += 1;
		}		
		return count;
	}
}
