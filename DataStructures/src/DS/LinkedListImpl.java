package DS;

public class LinkedListImpl {
	static Node head;

	static class Node {

		int data;
		Node next;

		public Node(int data) {

			this.data = data;
			this.next = null;
		}

		public Node(int i, Node head) {
			this.data=i;
			
		}

	}

	public static void main(String[] args) {
		LinkedListImpl list = new LinkedListImpl();
		list.insert(4);
		list.insert(2);
		list.insert(2);
		list.insert(5);
		list.printlist();
		list.deleteDuplicates(head);
		System.out.println();
		list.printlist();

	}
	 public Node deleteDuplicates(Node head) {
	        Node dummy=head;
	        Node previous=dummy;
	        while(head!=null)
	        {
	            if(head.next!=null && head.data==head.next.data)
	            {
	                while(head.next!=null && head.data==head.next.data )
	                {
	                    head=head.next;
	                }
	                previous.next=head.next;
	            }
	            else{
	                previous=previous.next;
	            }
	            head=head.next;
	            
	        }
	        return dummy;
	    }
	private void printlist() {

		Node currentNode = head;
		while (currentNode != null) {
			System.out.println(currentNode.data + " ");
			currentNode = currentNode.next;
		}
	}

	private void insert(int i) {

		Node newNode = new Node(i);

		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next!= null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}

	}

}
