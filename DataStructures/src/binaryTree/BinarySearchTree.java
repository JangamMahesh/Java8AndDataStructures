package binaryTree;

public class BinarySearchTree {

	private static Tree root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTree bst = new BinarySearchTree();

		bst.insert(5);
		bst.insert(3);
		bst.insert(7);
		bst.insert(1);
		bst.inOrder(root);

	}

	private void inOrder(Tree root2) {
		// TODO Auto-generated method stub
		if (root2 == null) {
			return;
		}
		inOrder(root2.left);
		System.out.print(root2.data + " ");
		inOrder(root2.right);

	}

	public void insert(int data) {
		root = insert(root, data);
	}

	private Tree insert(Tree root2, int i) {
		// TODO Auto-generated method stub
		if (root2 == null) {
			root2 = new Tree(i);
			return root2;
		}
		if (i < root2.data) {
			root2.left = insert(root2.left, i);
		} else {
			root2.right = insert(root2.right, i);
		}
		return root2;

	}

	private class Tree {
		private int data;
		private Tree left;
		private Tree right;

		public Tree(int data) {
			this.data = data;
		}

	}

}
