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
        test.insertAtHead(20);
        if (test.search(0) == 20) {
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
        try {
            CustomLinkedList test3 = new CustomLinkedList();
            test3.deleteByIndex(3);
            System.out.println("deleteElementByIndexTest is not ok!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("deleteElementByIndexTest is ok!");
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
        test6.insertAtHead(2);
        if (test6.isEmpty()) {
            System.out.println("isEmptyTest is not ok!");
        } else {
            System.out.println("isEmptyTest is ok!");
        }
    }
}

