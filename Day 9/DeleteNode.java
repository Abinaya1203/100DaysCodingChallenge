package com.dsa;
class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class DeleteNode{
    Node head;
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }
    public void deleteNthFromEnd(int n) {
        Node temp = new Node(0);
        temp.next = head;

        Node fast = temp;
        Node slow = temp;
        for (int i = 0; i <= n; i++) {
            if (fast != null) {
                fast = fast.next;
            } else {
                System.out.println("n is larger than list size");
                return;
            }
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        if (slow.next != null) {
            slow.next = slow.next.next;
        }

        head = temp.next; 
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DeleteNode d = new DeleteNode();
        d.add(10);
        d.add(20);
        d.add(30);
        d.add(40);
        d.add(50);
        d.display();
        d.deleteNthFromEnd(2);
        d.display();
    }
}

