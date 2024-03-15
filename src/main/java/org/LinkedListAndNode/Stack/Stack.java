package org.LinkedListAndNode.Stack;

import org.LinkedListAndNode.LinkedList;

public class Stack {

    public LinkedList stack;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;

    public Stack() {
        this(DEFAULT_MAX_SIZE);
    }

    public Stack(int maxSize) {
        this.stack = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    public void push(String data){
        this.stack.addToHead(data);
        this.size++;
        System.out.println("Added " + data + "! Stack size is now " + this.size);
    }

    public static void main(String[]args) {


        Stack stackOne = new Stack(6);
        System.out.println("stackOne can have " + stackOne.maxSize + " nodes!");
        Stack stackTwo = new Stack();
        System.out.println("stackTwo can have " + stackTwo.maxSize + " nodes!");

    }
}
