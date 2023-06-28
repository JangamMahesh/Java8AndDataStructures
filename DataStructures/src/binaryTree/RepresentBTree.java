package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RepresentBTree {
	private static TreeNode root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepresentBTree b = new RepresentBTree();
		b.createBinaryTree();
		b.preOrder(root);
		System.out.println();
		b.inOrder(root);
		System.out.println("post order");
		b.postOrder(root);
		System.out.println("Level Order");
		b.levelOrder(root);
	}

	private void levelOrder(TreeNode root2) {
		// TODO Auto-generated method stub
		if (root2 == null) {
			return;
		}
		Queue<TreeNode> q = new LinkedList();
		q.offer(root2);
		while (!q.isEmpty()) {

			TreeNode temp = q.poll();
			System.out.println(temp.data);
			if (temp.left != null) {
				q.offer(temp.left);
			}
			if (temp.right != null) {
				q.offer(temp.right);
			}
		}

	}

	private void postOrder(TreeNode root2) {
		// TODO Auto-generated method stub
		Stack<TreeNode> stack = new Stack();
		TreeNode current = root2;
		while (!stack.isEmpty() || current != null) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				TreeNode temp = stack.peek().right;
				if (temp == null) {
					temp = stack.pop();
					System.out.println(temp.data);
					while (!stack.isEmpty() && temp == stack.peek().right) {
						temp = stack.pop();
						System.out.println(temp.data);
					}

				} else {
					current = temp;
				}

			}
		}

	}

	private void inOrder(TreeNode root2) {
		// TODO Auto-generated method stub
		if (root2 == null) {
			return;
		} else {

			inOrder(root2.left);
			System.out.println(root2.data + " ");
			inOrder(root2.right);
		}
	}

	private void preOrder(TreeNode root2) {
		// TODO Auto-generated method stub
		if (root2 == null) {
			return;
		} else {
			System.out.println(root2.data + " ");
			preOrder(root2.left);
			preOrder(root2.right);
		}

	}

	private void createBinaryTree() {
		// TODO Auto-generated method stub
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode four = new TreeNode(4);

		root = first;
		first.left = second;
		first.right = third;
		second.left = four;

	}

	private static class TreeNode {
		private TreeNode right;
		private TreeNode left;
		private int data;

		public TreeNode(int data) {
			this.data = data;

		}

	}

}
