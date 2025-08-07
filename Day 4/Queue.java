package com.sq;

public class Queue {
    int[] queue;
    int front;
    int rear;
    int capacity;

    // Constructor
    public Queue(int capacity) {
        queue = new int[capacity];
        this.capacity=capacity;
        front = 0;
        rear = 0;
    }

    // Enqueue operation
    public void enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear++] = val;
    }

    // Dequeue operation
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Removed: " + queue[front++]);
    }

    // Peek front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == rear;
    }

    // Check if the queue is full
    public boolean isFull() {
        return rear == capacity-1;
    }

    // Display queue contents
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    // Main to test the Queue
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
        System.out.println("Front: " + q.peek());
    }
}