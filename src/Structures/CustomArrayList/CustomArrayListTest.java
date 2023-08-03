package Structures.CustomArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomArrayListTest {
    @Test
    void shouldAddElementToArrayAndGetByIndex() {
        CustomArrayList<Integer> test1 = new CustomArrayList<>();
        Integer expectedEl = 123;
        test1.add(123);
        Integer actual = test1.get(0);
        Assertions.assertEquals(expectedEl,actual);
    }


    void shouldThrowOutOfBoundException() {
        try {
            CustomArrayList test2 = new CustomArrayList(5);
            test2.get(2);
            System.out.println("shouldThrowOutOfBoundException test not ok!!!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("shouldThrowOutOfBoundException test ok!!!");
        }
    }

    @Test
    void createArrayAndAddElementByDoubleSizeTest() {
        CustomArrayList<Integer> test3 = new CustomArrayList<Integer>(10);
        for (int i = 0; i <= 10; i++) {
            test3.add(i);
        }
        test3.add(1);
        Assertions.assertEquals(20, test3.length());
    }

    @Test
    void getArraySizeTest() {
        CustomArrayList test4 = new CustomArrayList(10);
        for (int i = 0; i < 10; i++) {
            test4.add(i);
        }
        Assertions.assertEquals(test4.size(), 10);
    }

    @Test
    void removeElementFromArrayTest() {
        CustomArrayList<Integer> test5 = new CustomArrayList<>(10);
        for (int i = 0; i <= 10; i++) {
            test5.add(i);
        }
        test5.remove(5);
        Assertions.assertEquals(7, test5.get(6));
    }
}


