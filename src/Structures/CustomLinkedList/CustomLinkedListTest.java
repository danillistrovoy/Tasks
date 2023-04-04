package Structures.CustomLinkedList;

import java.util.concurrent.Callable;

public class CustomLinkedListTest {
    public static void main(String[] args) {
        insertElementAtHeadTest();
        insertElementAtEndTest();
        deleteElementByIndexTest();
        deleteFromHeadTest();
        searchElementTest();
        isEmptyTest();
        deleteFromEndTest();
        insertByIndexTest();
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
        CustomLinkedList test3 = new CustomLinkedList();
        test3.insertAtHead(10);
        test3.insertAtHead(15);
        test3.insertAtHead(20);
        test3.deleteByIndex(1);
        if (test3.size() == 2 && test3.search(1) == 10) {
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
        test6.insertAtHead(2);
        if (test6.isEmpty()) {
            System.out.println("isEmptyTest is not ok!");
        } else {
            System.out.println("isEmptyTest is ok!");
        }
    }

    static void deleteFromEndTest() {
        CustomLinkedList test7 = new CustomLinkedList();
        test7.insertAtHead(10);
        test7.insertAtEnd(15);
        test7.deleteFromEnd();
        if (test7.size() == 1 && test7.search(0) == 10) {
            System.out.println("deleteFromEndTest is ok!");
        } else {
            System.out.println("deleteFromEndTest is not ok!");
        }
    }

    static void insertByIndexTest() {
        CustomLinkedList test8 = new CustomLinkedList();
        test8.insertAtHead(10);
        test8.insertByIndex(5, 1);
        if (test8.size() == 2 && test8.search(1) == 5 && test8.search(0) == 10) {
            System.out.println("insertByIndexTest is ok!");
        } else {
            System.out.println("insertByIndexTest is not ok!");
        }
    }
}

