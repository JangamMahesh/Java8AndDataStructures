package DS;

public class QueueImpl {

	Node head;

	private class Node {
		int data;
		Node next;
	}

	private void insert(int i) {

		Node newNode=new Node();
		newNode.data=i;
		if(head==null)
		{
			head=newNode;
		}
		else {
			
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
			
		}
	}

	private void pop() {
		
		Node temp=head;
		Node previous=temp;
		while(temp.next!=null)
		{
			previous=temp;
			temp=temp.next;
		}
		previous.next=temp.next;
		

	}

	private int peek() {
		
		
		if(head==null)
		{
			System.out.println("No elements found");
			return -1;
		}
		return head.data;
	}

	private void display() {
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data);
			temp=temp.next;
			if(temp!=null)
			{
				System.out.print("->");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {

		QueueImpl queue = new QueueImpl();
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		queue.display();
		queue.pop();
		System.out.println(queue.peek());
		queue.insert(4);
		System.out.println(queue.peek());
		queue.display();

	}

}
