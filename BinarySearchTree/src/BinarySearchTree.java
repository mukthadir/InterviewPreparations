
public class BinarySearchTree {
	
}

class BSTNode {
	BSTNode left, right;
	int data;
	
	public BSTNode() {
		left = null;
		right = null;
		data = 0;
	}
	
	public BSTNode(int n) {
		left = null;
		right = null;
		data = n;
	}
	
	public void setLeft(BSTNode left) {
		this.left = left;
	}
	
	public void setRight(BSTNode right) {
		this.right = right;
	}
	
	public BSTNode getLeft() {
		return this.left;
	}
	
	public BSTNode getRight() {
		return this.right;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
}

class BST {
	private BSTNode root;
	
	public BST() {
		this.root = null;
	}
	
	public Boolean isEmpty() {
		return root == null;
	}
	
	public void insert(int data) {
		root = insert(root, data);
	}

	private BSTNode insert(BSTNode node, int data) {
		if (node == null) {
			node = new BSTNode(data);
		} else {
			if(data <= node.getData()) {
				node.left = insert(node.left, data);
			} else {
				node.right = insert(node.right, data);
			}
		}
		return node;
	}
}
