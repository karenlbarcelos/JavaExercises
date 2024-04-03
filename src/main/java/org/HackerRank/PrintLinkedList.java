package org.HackerRank;

//This is an to practice traversing a linked list. Given a pointer to the head node of a linked list, print each
// node's element, one per line. If the head pointer is null (indicating the list is empty), there is nothing to
// print.

public class PrintLinkedList {

    static class SinglyLinkedListNode {

        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {

        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {

            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }
    static void printLinkedList(SinglyLinkedListNode head) {

        SinglyLinkedListNode currentNode=head;

        if(head==null){
            return;
        }

        if(currentNode!=null){
            System.out.println(currentNode.data);
            printLinkedList(currentNode.next);
        }
    }
}
