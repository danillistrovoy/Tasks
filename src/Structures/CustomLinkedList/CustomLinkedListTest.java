package Structures.CustomLinkedList;

public class CustomLinkedListTest {
    public static void main(String[] args) {
        CustomLinkedList cll = new CustomLinkedList();
        cll.insertAtHead(70);
        cll.insertAtHead(60);
        cll.insertAtHead(50);
        cll.insertAtHead(40);
        cll.insertAtHead(30);
        cll.insertAtHead(20);
        cll.insertAtHead(10);
        cll.print();
        cll.deleteByIndex(4);
        cll.print();

    }
}
