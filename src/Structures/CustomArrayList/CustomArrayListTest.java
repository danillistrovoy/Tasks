package Structures.CustomArrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CustomArrayListTest {
    public static void main(String[] args) {
        shouldAddElementToArrayAndGetByIndex();
        shouldThrowOutOfBoundException();
        createArrayAndAddElementByDoubleSizeTest();
        getArraySizeTest();
        removeElementFromArrayTest();
    }

//    ... придумать свои

    static void shouldAddElementToArrayAndGetByIndex() {
        CustomArrayList test1 = new CustomArrayList();
        int expectedEl = 123;
        test1.add(123);
        var actual = test1.get(0);
        if (actual == expectedEl) {
            System.out.println("shouldAddElementToArrayAndGetByIndex test ok");
        } else {
            throw new RuntimeException("shouldAddElementToArrayAndGetByIndex test not ok!!!");
        }
    }

    static void shouldThrowOutOfBoundException() {
        try {
            CustomArrayList test2 = new CustomArrayList(5);
            test2.get(2);
            System.out.println("shouldThrowOutOfBoundException test not ok!!!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("shouldThrowOutOfBoundException test ok!!!");
        }
    }

    static void createArrayAndAddElementByDoubleSizeTest() {
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

    static void getArraySizeTest() {
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

    static void removeElementFromArrayTest() {
        CustomArrayList test5 = new CustomArrayList(10);
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
    //static void
}


