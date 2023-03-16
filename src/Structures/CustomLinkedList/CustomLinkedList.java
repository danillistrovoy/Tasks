package Structures.CustomLinkedList;

import java.util.LinkedList;

public class CustomLinkedList {
    private Node head;
    public class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
        public void add(int data){
            Node newNode = new Node(data);
            if (head == null){
                head = newNode;
            }
        }

    }
}
