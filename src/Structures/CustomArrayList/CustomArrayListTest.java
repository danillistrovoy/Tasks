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


    void createArrayAndAddElementByDoubleSizeTest() {
        CustomArrayList test3 = new CustomArrayList(10);
        for (int i = 0; i < 10; i++) {
            test3.add(i);
        }
        test3.add(1);
        if (test3.size() > 10) {
            System.out.println("createArrayAndAddElementByDoubleSize test ok!");
        } else {
            System.out.println("createArrayAndAddElementByDoubleSize test not ok!");
        }
    }


    void getArraySizeTest() {
        CustomArrayList test4 = new CustomArrayList(10);
        for (int i = 0; i < 10; i++) {
            test4.add(i);
        }
        if (test4.size() == 10) {
            System.out.println("getArraySizeTest ok !");
        } else {
            System.out.println("getArraySizeTest not ok!");
        }
    }


    void removeElementFromArrayTest() {
        CustomArrayList<Integer> test5 = new CustomArrayList<>(10);
        for (int i = 0; i <= 10; i++) {
            test5.add(i);
        }
        test5.remove(5);
        if (test5.get(6) == 7) {
            System.out.println("removeElementFromArray test ok!");
        } else {
            System.out.println("removeElementFromArray test not ok!");
        }
    }
}


