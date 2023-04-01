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
            Link newLink = new Link(null, data, null);
            head = newLink;
            head.prev = head;
            head.next = head;
        } else {
            Link newLink = new Link(head.prev, data, head);
            head.prev = newLink;
            head = newLink;
            head.prev.next = head;
        }
        size++;
    }

    public void insertAtEnd(int data) {
        if (head == null) {
            head = new Link(null, data, null);
            head.prev = head;
            head.next = head;
        } else {
            Link newLink = new Link(head.prev, data, head);
            head.prev = newLink;
            head.prev.prev.next = newLink;
            head.prev.next = head;
        }
        size++;
    }

    public void deleteFromHead() {
        if (head == null) {
            return;
        }
        if (head.next == head) {
            head = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = head.prev.prev;
        head.prev.next = head;
        size--;
    }


    public void deleteFromEnd() {
        if (head == null) {
            return;
        }
        if (head.next == head) {
            head = null;
            size--;
            return;
        }
        head.prev = head.prev.prev;
        head.prev.next = head;
        size--;
    }

    public void insertByIndex(int data, int index) {
        if (head == null) {
            return;
        }
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Введен некорректный индекс");
        }
        Link current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        if (current.prev == head.prev) {
            Link newLink = new Link(head.prev, data, current);
            current.prev = newLink;
            head = newLink;
            head.prev.next = head;

        } else {
            Link newLink = new Link(current.prev, data, current);
            current.prev.next = newLink;
            current.prev = newLink;
        }
        size++;
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Введен некорректный индекс");
        }
        if (head.prev == head && head.next == head) {
            head = null;
            size--;
            return;
        }
        Link current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        if (current.next == head) {
            current.prev.next = head;
            head.prev = current.prev;
        } else if (current.prev == head.prev) {
            head = head.next;
            head.prev = head.prev.prev;
            head.prev.next = head;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
    }

    public int search(int index) {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        if (head != null && index == 0) {
            return head.Data();
        }
        int i = 0;
        Link current = head;
        while (i < index) {
            current = current.next;
            i++;
        }
        return current.Data();
    }

    public int size() {
        return size;
    }

    public void print() {
        Link current = head.prev;
        while (current != head) {
            System.out.println(current.Data());
            current = current.next;
        }
    }
}
