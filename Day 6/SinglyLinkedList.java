package com.dsa;
class Node{
	int val;
	Node next;
	public Node(int val) {
		this.val=val;
		this.next=null;	
	}
}
 class SinglyL {
	private Node root;
	 public SinglyL() {
		this.root=null;
	}
	 public void addNewNode(int val) {
			Node n = new Node(val);
			if(this.root==null) {
				this.root=n;
				return;
			}
			Node temp=this.root;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=n;
		}
	 public void insertAtPos(int val,int pos) {
			Node n = new Node(val);
			int len=1;
			Node temp=root;
			while(temp!=null&&len<pos-1) {
				temp=temp.next;
				len++;
			}
			if(temp==null) {
				return;
			}
			n.next=temp.next;
			temp.next=n;
		}
public void deleteAtPos(int pos) {
	if(root==null) {
		return;
	}
	if(pos==0) {
		root=root.next;
		return;
	}
	
	Node temp=root;
	for(int i=0;i<pos-1;i++){
		if(temp.next==null)
			return;
		temp=temp.next;
		}
		
		temp.next=temp.next.next;
	
		}
public void display() {
	Node temp=root;
	while(temp!=null) {
		System.out.print(temp.val +"->");
		temp=temp.next;
	}
}
	}
 public class SinglyLinkedList {
		
		public static void main(String[] args) {
			SinglyL s= new SinglyL();
			s.addNewNode(10);
			s.addNewNode(40);
			s.addNewNode(50);
			s.addNewNode(68);
			s.insertAtPos(20, 2);
			s.display();
			System.out.println();
			s.deleteAtPos(3);
			s.display();

		}

	}
