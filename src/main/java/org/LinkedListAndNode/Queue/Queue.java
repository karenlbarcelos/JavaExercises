package org.LinkedListAndNode.Queue;

import org.LinkedListAndNode.LinkedList;

public class Queue {

    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;

    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }

    public Queue(int maxSize) {
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    public boolean hasSpace() {
        return this.size < this.maxSize;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueue(String data) {
        if(this.hasSpace()){
            this.queue.addToTail(data);
            this.size++;
            System.out.println("Added " + data + "! Queue size is now " + this.size);
        } else {
            throw new Error ("Queue is full!");
        }
    }

    public String dequeue() {
        if(!this.isEmpty()){
            String data = this.queue.removeHead();
            this.size--;
            System.out.println("Removed " + data + "! Queue size is now " + this.size);
            return data;
        } else {
            throw new Error("Queue is empty!");
        }
    }

    public String peek() {
        return this.queue.head.data;
    }

    public static void main(String[] args) {

        Queue coffeeOrder = new Queue();
        System.out.println("coffeeOrder queue has " + coffeeOrder.size + " orders.");
        coffeeOrder.enqueue("latte");
        coffeeOrder.enqueue("espresso");
        coffeeOrder.enqueue("cappuccino");

        Queue queueOne = new Queue(25);
        Queue queueTwo = new Queue(0);
        System.out.println("queueOne has space for more nodes: " + queueOne.hasSpace());
        System.out.println("queueTwo has space for more nodes: " + queueTwo.hasSpace());
        System.out.println("queueOne is empty: " + queueOne.isEmpty());
        System.out.println("queueTwo is empty: " + queueTwo.isEmpty());

        Queue boundedQueue = new Queue(3);
        boundedQueue.enqueue("latte");
    }
}
