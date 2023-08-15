package Structures.CustomLinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomLinkedListTest {
    @Test
    void insertElementAtHeadTest() {
        CustomLinkedList<Integer> test = new CustomLinkedList<>();
        test.insertAtHead(15);
        test.insertAtHead(20);
        Assertions.assertEquals(20, test.search(0));
    }

    @Test
    void insertElementAtEndTest() {
        CustomLinkedList<Integer> test2 = new CustomLinkedList<>();
        test2.insertAtHead(5);
        test2.insertAtHead(10);
        test2.insertAtEnd(20);
        Assertions.assertEquals(20, test2.search(2));
    }

    @Test
    void deleteElementByIndexTest() {
        CustomLinkedList<Integer> test3 = new CustomLinkedList<>();
        test3.insertAtHead(10);
        test3.insertAtHead(15);
        test3.insertAtHead(20);
        test3.deleteByIndex(1);
        Assertions.assertEquals(2, test3.size());
        Assertions.assertEquals(10, test3.search(1));
    }

    @Test
    void deleteFromHeadTest() {
        CustomLinkedList<Integer> test4 = new CustomLinkedList<>();
        test4.insertAtHead(5);
        test4.insertAtHead(10);
        test4.insertAtEnd(20);
        test4.deleteFromHead();
        Assertions.assertEquals(2,test4.size());
        Assertions.assertEquals(5,test4.search(0));
    }


    @Test
    void searchElementTest() {
        CustomLinkedList<Integer> test5 = new CustomLinkedList<>();
        test5.insertAtHead(5);
        test5.insertAtHead(10);
        test5.insertAtEnd(20);
        int expected = 20;
        int actual = test5.search(2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isEmptyTest() {
        CustomLinkedList<Integer> test6 = new CustomLinkedList<>();
        Assertions.assertTrue(test6.isEmpty());
    }

    @Test
    void deleteFromEndTest() {
        CustomLinkedList<Integer> test7 = new CustomLinkedList<>();
        test7.insertAtHead(10);
        test7.insertAtEnd(15);
        test7.deleteFromEnd();
        Assertions.assertEquals(1, test7.size());
        Assertions.assertEquals(10, test7.search(0));
    }

    @Test
    void insertByIndexTest() {
        CustomLinkedList<Integer> test8 = new CustomLinkedList<>();
        test8.insertAtHead(10);
        test8.insertByIndex(5, 1);
        Assertions.assertEquals(2, test8.size());
        Assertions.assertEquals(5, test8.search(1));
        Assertions.assertEquals(10, test8.search(0));
    }

}

