
public class BST {
	public static void main(String args[]) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(2);
		bst.insert(7);
		bst.insert(1);
		bst.insert(8);
		bst.insert(12);
		bst.insert(81);
		bst.insert(34);
		bst.insert(65);
		
		bst.inOrderTraversal();
		System.out.println();
		bst.preOrderTraversal();
		System.out.println();
		bst.postOrderTraversal();
		System.out.println();
		bst.delete(20);
		bst.inOrderTraversal();
		System.out.println();
		System.out.println(bst.search(20));
		System.out.println(bst.countNodes());
		System.out.println(bst.largest());
	}
}
