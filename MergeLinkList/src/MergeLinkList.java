
public class MergeLinkList {
	public static void main(String args[]) {
		LinkList ll = new LinkList();
		for(int i = 4; i< 20; i = i+2) 
			ll.insert(i);
		
		LinkList ll2 = new LinkList();
		for(int i = 4; i< 30; i = i+4) 
			ll2.insert(i);
		
		ll.print();
		ll2.print();

		LinkList ll3 = new LinkList();
		ll3.head = ll.merge(ll2);
		
		ll3.print();	
	}
}


class LinkList {
	Node head = null;
	
	public Boolean isEmpty() {
		return head == null;
	}
	
	public Node merge(LinkList ll2) {
		Node realHead = new Node();
		Node head1 = head;
		Node head2 = ll2.head;
		Node fakeHead = realHead;

		while(head1!= null && head2!= null) {
			if(head1.data < head2.data) {
				fakeHead.next = head1;
				head1 = head1.next;
			} else if(head1.data > head2.data) {
				fakeHead.next = head2;
				head2 = head2.next;
			} else if(head1.data == head2.data) {
				fakeHead.next = head1;
				head1 = head1.next;
				head2 = head2.next;
			}
			fakeHead = fakeHead.next;
		}
		
		if (head1 == null) {
			while(head2!= null) {
				fakeHead.next = head2;
				head2 = head2.next;
				fakeHead = fakeHead.next;
			}
		} else if (head2 == null) {
			while(head1!= null) {
				fakeHead.next = head1;
				head1 = head1.next;
				fakeHead = fakeHead.next;
			}	
		}
		
		return realHead.next;
	}

	public void insert(int data) {
		head = insert(head, data);
	}
	
	private Node insert(Node node, int data) {
		Node tempHead = head;
		node = new Node(data);
		
		if(isEmpty()) {
			head = node;
		} else {
			while (tempHead.next != null) {
				tempHead = tempHead.next;
			}
			tempHead.next = node;
		}
		
		return head;
	}
	
	public void print() {
		Node printNode;
		printNode = head;
		
		while (printNode != null) {
			System.out.print(printNode.data + "\t");
			printNode = printNode.next;
		}
		System.out.println();
	}
}

class Node {
	int data;
	Node next;
	
	public Node() {
		data = 0;
		next= null;
	}
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class Another {
	public static Node merge(LinkList ll1, LinkList ll2) {
		Node realHead = new Node();
		Node head1 = ll1.head;
		Node head2 = ll2.head;
		Node fakeHead = realHead;

		while(head1!= null && head2!= null) {
			if(head1.data < head2.data) {
				fakeHead.next = head1;
				head1 = head1.next;
			} else if(head1.data > head2.data) {
				fakeHead.next = head2;
				head2 = head2.next;
			} else if(head1.data == head2.data) {
				fakeHead.next = head1;
				head1 = head1.next;
				head2 = head2.next;
			}
			fakeHead = fakeHead.next;
		}
		
		if (head1 == null) {
			while(head2!= null) {
				fakeHead.next = head2;
				head2 = head2.next;
				fakeHead = fakeHead.next;
			}
		} else if (head2 == null) {
			while(head1!= null) {
				fakeHead.next = head1;
				head1 = head1.next;
				fakeHead = fakeHead.next;
			}	
		}
		
		return realHead.next;
	}
}