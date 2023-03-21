package Structures.CustomLinkedList;

public class CustomLinkedListTest {
    public static void main(String[] args) {
        insertElementAtHeadTest();
        insertElementAtEndTest();
        deleteElementByIndexTest();
        deleteFromHeadTest();
        searchElementTest();
        isEmptyTest();
    }

    static void insertElementAtHeadTest() {
        CustomLinkedList test = new CustomLinkedList();
        test.insertAtHead(15);
        if (test.search(0) == 15) {
            System.out.println("insertElementAtHeadTest is ok!");
        } else {
            System.out.println("insertElementAtHeadTest is not ok !");
        }
    }

    static void insertElementAtEndTest() {
        CustomLinkedList test2 = new CustomLinkedList();
        test2.insertAtHead(5);
        test2.insertAtHead(10);
        test2.insertAtEnd(20);
        if (test2.search(2) == 20) {
            System.out.println("insertElementAtEndTest is ok!");
        } else {
            System.out.println("insertElementAtEndTest is not ok !");
        }
    }

    static void deleteElementByIndexTest() {
        CustomLinkedList test3 = new CustomLinkedList();
        test3.insertAtHead(5);
        test3.insertAtHead(10);
        test3.insertAtEnd(20);
        test3.deleteByIndex(1);
        if (test3.size() == 2 && test3.search(1) == 20) {
            System.out.println("deleteElementByIndexTest is ok!");
        } else {
            System.out.println("deleteElementByIndexTest is not ok!");
        }
    }

    static void deleteFromHeadTest() {
        CustomLinkedList test4 = new CustomLinkedList();
        test4.insertAtHead(5);
        test4.insertAtHead(10);
        test4.insertAtEnd(20);
        test4.deleteFromHead();
        if (test4.size() == 2 && test4.search(0) == 5) {
            System.out.println("deleteFromHeadTest is ok!");
        } else {
            System.out.println("deleteFromHeadTest is not ok!");
        }
    }

    static void searchElementTest() {
        CustomLinkedList test5 = new CustomLinkedList();
        test5.insertAtHead(5);
        test5.insertAtHead(10);
        test5.insertAtEnd(20);
        int expected = 20;
        int actual = test5.search(2);
        if (expected == actual) {
            System.out.println("searchElementTest is ok");
        } else {
            System.out.println("searchElementTest is not ok");
        }
    }

    static void isEmptyTest() {
        CustomLinkedList test6 = new CustomLinkedList();
        if (test6.isEmpty()) {
            System.out.println("isEmptyTest is ok!");
        } else {
            System.out.println("isEmptyTest is not ok!");
        }
    }
}

