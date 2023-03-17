package Structures.CustomLinkedList;

public class Link {
    private int data;
    public Link prev;
    public Link next;

    public Link(int data){
        this.data = data;
    }
    public Link(Link prev, int data, Link next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
    public int Data(){
        return data;
    }

}
