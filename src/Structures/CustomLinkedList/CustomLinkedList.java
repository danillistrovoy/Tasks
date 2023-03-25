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
        } else {
            Link newLink = new Link(null, data, head);
            head.prev = newLink;
            head = newLink;
        }
        size++;
    }

    public void insertAtEnd(int data) {
        if (head == null) {
            head = new Link(null, data, null);
        } else {
            Link current = head;
            while (current.next != null) {
                current = current.next;
            }
            Link newLink = new Link(current, data, null);
            current.next = newLink;
        }
        size++;
    }

    public void deleteFromHead() {
        if (head == null) {
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    public void deleteFromEnd() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Link current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
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
        if (current.prev == null) {
            Link newLink = new Link(null, data, current);
            current.prev = newLink;
            head = newLink;

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
        Link current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        if (current.next == null) {
            current.prev.next = null;
        } else if (current.prev == null) {
            current = current.next;
            current.prev = null;
            head = current;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
    }

    public int search(int index) {
        if (head == null) {
            return 0;
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
        Link current = head;
        while (current != null) {
            System.out.println(current.Data());
            current = current.next;
        }
    }
}
