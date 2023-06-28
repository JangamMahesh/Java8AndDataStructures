package DS;

public class SingleLinkedListFullImpl {

	
	private static LinkedNode head;
	
	private static class LinkedNode
	{
		private  int data;
		private LinkedNode next;
		public LinkedNode(int data) {
			// TODO Auto-generated constructor stub
			this.data=data;
			this.next=null;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleLinkedListFullImpl sll=new SingleLinkedListFullImpl();
		sll.head=new LinkedNode(20);
		LinkedNode first=new LinkedNode(10);
		LinkedNode second=new LinkedNode(5);
		LinkedNode n1=new LinkedNode(30);
		LinkedNode n2=new LinkedNode(15);
		LinkedNode n3=new LinkedNode(0);
		 
		head.next=first;
		first.next=second;
		sll.insertNodeAtFirst(n1);
		sll.insertNodeAtLast(n2);
		sll.displayNodes();
		sll.insertNodeAtGivenIndext(n3,3);
		sll.deleteFirst();
		sll.deleteLast();
		sll.displayNodes();
		sll.deleteAtGivenIndex(2);
		sll.displayNodes();
	}
	private void deleteAtGivenIndex(int i) {
		// TODO Auto-generated method stub
		LinkedNode temp=head;
		LinkedNode previous=null;
		int count=0;
		while(temp!=null)
		{
			if(count==i)
			{
				break;
			}
			else {
			previous=temp;
			temp=temp.next;
			count++;
			}
		}
		previous.next=temp.next;
		temp.next=null;
		
		
	}
	private void deleteLast() {
		// TODO Auto-generated method stub
		LinkedNode temp=head;
		LinkedNode previous=null;
		while(temp.next!=null) { 
			previous=temp;
			temp=temp.next;
			
		}
		previous.next=null;
		
	}
	private void deleteFirst() {
		// TODO Auto-generated method stub
		LinkedNode temp=head;
		if(temp!=null)
		{
			temp=temp.next;
			head=temp;
		}
		
	}
	private void insertNodeAtGivenIndext(LinkedNode newNode, int i) {
		// TODO Auto-generated method stub
		LinkedNode temp=head;
		LinkedNode previous=null;
		int count=0;
		while(temp!=null)
		{
			if(count==i)
			{
				break;	
			}
			previous=temp;
			temp=temp.next;
			count++;
		}
		previous.next=newNode;
		newNode.next=temp;
		
		
	}
	private void insertNodeAtLast(LinkedNode n2) {
		// TODO Auto-generated method stub
		
		LinkedNode temp=head;
		LinkedNode current=null;
		while(temp!=null)
		{
			current=temp;
			temp=temp.next;
		}
		current.next=n2;
		n2.next=null;
		
		
	}
	private void insertNodeAtFirst(LinkedNode n1) {
		// TODO Auto-generated method stub
		LinkedNode temp=head;	
		n1.next=head;
		head=n1;
		
	}
	private void displayNodes() {
		// TODO Auto-generated method stub
		LinkedNode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" --> ");
			temp=temp.next;
		}
		System.out.println(" Null");
		
	}

}
