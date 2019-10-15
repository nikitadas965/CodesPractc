

public class ImpConceptsSingleLinkedList {
	
	static Node head;
	
	static class Node
	{
		Node next; int data;
		Node(int data)
		{
			this.data=data ; next=null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImpConceptsSingleLinkedList llist = new ImpConceptsSingleLinkedList();
		for(int i = 5;i>0;i--)
			llist.insert(i);
	System.out.println("list before");
	llist.printList();
//	head=llist.reverse(head);
	
//	head.next.next.next.next.next=head.next;// 1->2->3->4->5->2 (CREATING A LOOP FROM 5 TO 2 FOR TEST)
//	llist.detectAndRemove(head);
	
	llist.rotate(4);
	System.out.println();
	System.out.println("list after:");
	llist.printList();
	
	
		
		

	}
	

	public void detectAndRemove(Node node)
	{
		Node slow=node; Node fast=node;
		while(slow != null && fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast)
				break;
		}
		
	/*if loop exists*/
		if(slow==fast)
			slow=node;
		while(slow.next!=fast.next)
		{
			slow=slow.next;
			fast=fast.next;
		}
		
		fast.next=null;
	
	}
	
	
	public Node reverse(Node node) //Node node= head;
	{
	
		Node current= node;
		Node prev = null;
		Node nextnode = null;
		
		while(current != null)
		{
			nextnode= current.next;
			current.next= prev;
			prev=current;
			current=nextnode;
		}
		node = prev;
		return node;
		
	}
	
	
	public void rotate(int k)
	{
		int count=1;
		if(k==0)
			return;
		Node current=head;
		while(count<k && current!=null)
		{
			current=current.next;
			count++;
		}
		
		Node kthnode=current;
		while(current.next!=null)
		{
			current=current.next;
		}
		
		current.next=head;
		head=kthnode.next;
		kthnode.next=null;
	}

	
	public void insert(int data)
	{
		Node newNode = new Node(data);
		newNode.next=head;
		head=newNode;
	}
	
	public void printList()
	{
		Node node=head;
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
	}
}
