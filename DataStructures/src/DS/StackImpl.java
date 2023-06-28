package DS;

public class StackImpl {

	Node top;

	/*
	 * StackImpl() { this.top = null; }
	 */

	private class Node {
		int data;
		Node next;
	}

	public void push(int i) {

		Node newNode = new Node();

		newNode.data = i;
		newNode.next = top;
		top = newNode;
		System.out.println(top.data);
	}

	public void pop() {

		if (top == null) {
			System.out.println("\nStack Underflow pop");
			return;
		}
		Node temp = top;
		top = top.next;
		temp.next = null;

	}

	private void display() {
		if (top == null) {
			System.out.printf("\nStack Underflow");
			return;
		} else {

			Node temp = top;
			while (temp != null) {
				System.out.print(temp.data);
				temp = temp.next;
				if (temp != null) {
					System.out.print("->");
				}
			}
		}
		System.out.println();

	}

	public boolean isEmpty() {
		return top == null;
	}

	// Utility function to return top element in a stack
	public int peek() {
		// check for empty stack
		if (!isEmpty()) {
			return top.data;
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public static void main(String[] args) {
		StackImpl stack = new StackImpl();
		stack.push(2);
		stack.push(3);
		stack.push(5);
		// System.out.println(stack.top.data);
		stack.display();
		stack.pop();
		System.out.println(stack.peek());
		stack.display();

	}

}
