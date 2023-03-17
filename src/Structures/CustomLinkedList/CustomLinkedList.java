package Structures.CustomLinkedList;

import java.util.LinkedList;

public class CustomLinkedList {
    private Link head;
    private int size;

    public CustomLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtHead(int data) {
        if (head == null) {
            head = new Link(null, data ,null);
        }
        else {
            Link newLink = new Link(null,data,head);
            head.prev = newLink;
            head = newLink;
        }
        size++;
    }
    public int size(){
        return size;
    }
    public void print(){
        Link current = head;
        while (current != null){
            System.out.println(current.Data());
            current = current.next;
        }
    }
}
