package com.dsa;

import java.util.Stack;

class NodeL {
    int val;
    NodeL next;

    NodeL(int val) {
        this.val = val;
        this.next = null;
    }
}
class LinkedList {
    private NodeL root; 

    public void addNewNode(int val) {
        NodeL newNode = new NodeL(val);
        if (root == null) {
            root = newNode;
        } else {
            NodeL temp = root;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Normal display
    public void display() {
        NodeL temp = root;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Display reverse using stack (iterative)
    public void displayReverseUsingStack() {
        Stack<Integer> stack = new Stack<>();
        NodeL temp = root;

        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + "->");
        }
        System.out.println("null");
    }

    // Display reverse using recursion
    public void displayReverseUsingRecursion() {
        displayReverseRec(root);
        System.out.println("null");
    }
    private void displayReverseRec(NodeL node) {
        if (node == null) return;
        displayReverseRec(node.next);
        System.out.print(node.val + "->");
    }
}

public class LinkedListReverse {
    public static void main(String[] args) {
        LinkedList s = new LinkedList();
        s.addNewNode(10);
        s.addNewNode(20);
        s.addNewNode(40);

        System.out.println("Normal order:");
        s.display();

        System.out.println("Reverse order (using stack):");
        s.displayReverseUsingStack();

        System.out.println("Reverse order (using recursion):");
        s.displayReverseUsingRecursion();
    }
}

