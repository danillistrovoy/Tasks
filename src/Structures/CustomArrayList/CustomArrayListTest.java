package Structures.CustomArrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CustomArrayListTest {
    public static void main(String[] args) {
        CustomArrayList array1 = new CustomArrayList(10);
        System.out.println("Положить элемент в массив и получить обратно");
        array1.add(15);
        System.out.println(array1.get(0));
        System.out.println("Создать массив на 10 элементов, заполнить и добавить 11, массив должен увеличиться в 2 раза ");
        for (int i = 0; i < 10; i++) {
            array1.add(i);
        }
        System.out.println(array1.size());
        array1.add(10, 15);
        for (int i = 0; i < array1.size(); i++) {
            System.out.println(array1.array[i] + " ");
        }
    }
    }








//    1. Положить элемент в массив и получить обратно
//    2. Создать массив на 10 элементов, заполнить и доавить 11, массив должен увеличиться в 2 раза
//  3. получение длины
//    4. удаление элементы
//    ... придумать свои

   /* static void shouldAddElementToArrayAndGetByIndex() {
        int expectedEl = 123;

        var actual = .get(0);

        if (actual == expectedEl) {
            System.out.println("shouldAddElementToArrayAndGetByIndex test ok");
        } else {
            throw new RuntimeException("shouldAddElementToArrayAndGetByIndex test not ok!!!");
        }
    }


    static void shouldThrowOutOfBoundException() {
        try {
            CustomArrayList array1 = new CustomArrayList();
            array1.get(2);
            System.out.println("shouldThrowOutOfBoundException test not ok!!!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("shouldThrowOutOfBoundException test ok!!!");
        }
    }


}

    */
