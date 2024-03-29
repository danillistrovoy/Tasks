package Structures.CustomLinkedList;

import java.util.LinkedList;

public class CustomLinkedList<T> {
    private Link<T> head;
    private int size;

    public CustomLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtHead(T data) {
        if (head == null) {
            Link<T> newLink = new Link<>(null, data, null);
            head = newLink;
            head.prev = head;
            head.next = head;
        } else {
            Link<T> newLink = new Link<>(head.prev, data, head);
            head.prev = newLink;
            head = newLink;
            head.prev.next = head;
        }
        size++;
    }

    public void insertAtEnd(T data) {
        if (head == null) {
            head = new Link<T>(null, data, null);
            head.prev = head;
            head.next = head;
        } else {
            Link<T> newLink = new Link<>(head.prev, data, head);
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

    public void insertByIndex(T data, int index) {
        if (head == null) {
            return;
        }
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Введен некорректный индекс");
        }
        if (size == 1 && index == 1) {
            Link<T> newLink = new Link<>(head, data, head);
            head.next = newLink;
            head.prev = newLink;
            head.prev.next = head;
            size++;
            return;
        }
        Link<T> current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        if (current == head) {
            Link<T> newLink = new Link<>(head.prev, data, current);
            current.prev = newLink;
            head = newLink;
            head.prev.next = head;
        } else {
            Link<T> newLink = new Link<>(current.prev, data, current);
            current.prev.next = newLink;
            current.prev = newLink;
        }
        size++;
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Введен некорректный индекс");
        }
        if (index == 0 && size == 1) {
            head = null;
            size--;
            return;
        }
        Link<T> current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        if (current.next == head) {
            current.prev.next = head;
            head.prev = current.prev;
        } else if (current == head) {
            head = head.next;
            head.prev = head.prev.prev;
            head.prev.next = head;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
    }

    public T search(int index) {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        if (index == 0) {
            return head.Data();
        }
        if (index > size){
            return null;
        }
        int i = 0;
        Link<T> current = head;
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
        Link<T> current = head.prev;
        while (current != head) {
            System.out.println(current.Data());
            current = current.next;
        }
    }

}
