package org.LinkedListAndNode;

public class LinkedList {

    public Node head;

    public LinkedList() {
        this.head = null;
    }

    //buscador em Linked List recursivo
    public Node findNodeRecursively(String data, Node currentNode) {
        // Base case: Se chegar ao fim da LinkedList (node null)
        if (currentNode == null) {
            return null;
        }

        // Check se o dado atual do Node eh igual
        if (currentNode.data.equals(data)) {
            return currentNode;  //se sim retorna o valor
        }

        // Pesquisa recursiva para o próximo dado do nó (node)
        return findNodeRecursively(data, currentNode.getNextNode());
    }

    //buscador em Linked List iterativo
    public Node findNodeIteratively(String data) {
        Node currentNode = this.head;

        while (currentNode != null) {
            if (currentNode.data == data) {
                return currentNode;
            }
            currentNode = currentNode.getNextNode();
        }

        return null;
    }

    public void addToHead(String data) {
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }

    public void addToTail(String data) {
        Node tail = this.head;
        if (tail == null) {
            this.head = new Node(data);
        } else {
            while (tail.getNextNode() != null) {
                tail = tail.getNextNode();
            }
            tail.setNextNode(new Node(data));
        }
    }

    public String removeHead() {
        Node removedHead = this.head;
        if (removedHead == null) {
            return null;
        }
        this.head = removedHead.getNextNode();
        return removedHead.data;
    }

    public String toString() {
        Node currentNode = this.head;
        String output = "<head> ";
        while (currentNode != null) {
            output += currentNode.data + " ";
            currentNode = currentNode.getNextNode();
        }
        output += "<tail>";
        return output;
    }

}
