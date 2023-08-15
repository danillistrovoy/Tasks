package Structures.CustomLinkedList;

public class Link<T> {
    private final T data;
    public Link<T> prev;
    public Link<T> next;

    public Link(T data) {
        this.data = data;
    }

    public Link(Link<T> prev, T data, Link<T> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    public T Data() {
        return data;
    }

}
