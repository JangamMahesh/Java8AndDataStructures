package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// check if node is null if it is return
//traverse left child of it
// print the node
// traverse right child of the current node

public class InOrderTraversal {

	// Definition for a binary tree node.
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	
		public static List<Integer> inorderTraversal(TreeNode root) {
			List<Integer> list = new ArrayList<Integer>();
			Stack<TreeNode> stack = new Stack();
			if (root == null) {
				return list;
			}
			TreeNode currentNode = root;
			while (currentNode != null || !stack.isEmpty()) {
				while (currentNode != null) {
					stack.push(currentNode);
					currentNode = currentNode.left;
				}
				currentNode = stack.pop();
				list.add(currentNode.val);
				currentNode = currentNode.right;	}

			return list;		
	}

	public static void main(String[] args) {
		//InOrderTraversal.inorderTraversal(TreeNode root);
	}

}
