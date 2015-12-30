public class BinarySearchTree {
	Node root = null;
	int counter = 0;
	
	public Boolean isEmpty() {
		return root == null;
	}
	
	public void postOrderTraversal() {
		postOrderTraversal(root);
	}

	private void postOrderTraversal(Node node) {
		if(node != null) {
			postOrderTraversal(node.getLeftChild());
			postOrderTraversal(node.getRightChild());
			System.out.print(node.getData() + "\t");
		}
	}

	public void insert(int data) {
		root = insert(root, data);
	}

	private Node insert(Node node, int data) {
		if (node == null) {
			node = new Node(data);
		} else {
			if(data <= node.getData()) {
				node.setLeftChild(insert(node.getLeftChild(), data));
			} else if (data > node.getData()) {
				node.setRightChild(insert(node.getRightChild(), data));
			}
		}
	
		return node;
	}	

	public void inOrderTraversal() {
		inOrderTraversal(root);
	}

	private void inOrderTraversal(Node node) {
		if(node != null) {
			inOrderTraversal(node.getLeftChild());
			System.out.print(node.getData() + "\t");
			inOrderTraversal(node.getRightChild());
		}
	}
	
	public void preOrderTraversal() {
		preOrderTraversal(root);
	}

	private void preOrderTraversal(Node node) {
		if(node != null) {
			System.out.print(node.getData() + "\t");
			preOrderTraversal(node.getLeftChild());
			preOrderTraversal(node.getRightChild());
		}
	}

	public void delete(int data) {
		if(isEmpty()) {
			System.out.println("Empty tree. Nothing to delete.");
		} else if (search(data) == false) {
			System.out.println("Element not found");
		} else {
			root = delete(root, data);
		}
	}

	private Node delete(Node node, int data) {
		if(data < node.getData()) {
			node.setLeftChild(delete(node.getLeftChild(), data));
		} else if (data > node.getData()) {
			node.setRightChild(delete(node.getRightChild(), data));
		} else if (data == node.getData()) {
			Node leftChild, rightChild;
			leftChild = node.getLeftChild();
			rightChild = node.getRightChild();
			if(leftChild == null && rightChild == null) {
				return null;
			} else if (leftChild == null) {
				return rightChild;
			} else if (rightChild == null) {
				return leftChild;
			} else {
				Node temp;
				temp = rightChild;
				while(temp.getLeftChild() != null) {
					temp = temp.getLeftChild();
				}
				temp.setLeftChild(leftChild);
				return rightChild;
			}
		}
		
		return node;
	}

	public boolean search(int data) {
		return search(root, data);
	}

	private boolean search(Node node, int data) {
		if (node == null) {
			return false;
		} else {
			if(data == node.getData()) {
				return true;
			} else if (data < node.getData()) {
				search(node.getLeftChild(), data);
			} else if (data > node.getData()) {
				search(node.getRightChild(), data);
			}
		}
		
		return false;
	}

	public int countNodes() {
		return countNodes(root);
	}

	private int countNodes(Node node) {
		int numberOfNodes = 0;
		
		if(node == null) {
			return 0;
		} else {
			numberOfNodes = 1;
			numberOfNodes += countNodes(node.getLeftChild());
			numberOfNodes += countNodes(node.getRightChild());
		}

		return numberOfNodes;
	}
	
	public int largest() {
		return largest(root);
	}

	private int largest(Node node) {
		while(node.getRightChild() != null)
			node = node.getRightChild();
		return node.getData();
	}
	
	public int smallest() {
		return smallest();
	}
}