package ArrayList;

import java.util.Scanner;

public class ReverseLinkedList {
	
	static Node head;
	static class Node
	{
		Node next;
		int data;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("how many nodes?");
		int numberOfNodes=sc.nextInt();
		
		ReverseLinkedList llist= new ReverseLinkedList();

        for(int i=numberOfNodes;i>0;i--)
      	  llist.insert(i);
      System.out.println("Given Linked list"); 
      llist.printList(); 
      head = llist.Reverse();  // changing the value of head so that when it goes to printlist head is 5 
      System.out.println(""); 
      System.out.println("Reversed linked list "); 
      llist.printList(); 

	}
	
	
	public Node Reverse()
	{
		
		Node node=head;
		Node current=node;
		Node prev=null;
		Node nextnode=null;
		
		
		 
	
		while(current!=null)
		{
			nextnode=current.next;
			current.next=prev;
			prev=current;
			current=nextnode;
			
		}
		
		node=prev;
		
		
		
		return node;
		
	}
	
	public void insert(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
		
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
