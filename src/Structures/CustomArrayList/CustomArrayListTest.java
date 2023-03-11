package Structures.CustomArrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CustomArrayListTest {
    public static void main(String[] args) {
        shouldAddElementToArrayAndGetByIndex();
        CustomArrayList array1 = new CustomArrayList();
        array1.add(5);
    }


//    1. Положить элемент в массив и получить обратно
//    2. Создать массив на 10 элементов, заполнить и доавить 11, массив должен увеличиться в 2 раза
//  3. получение длины
//    4. удаление элементы
//    ... придумать свои

    static void shouldAddElementToArrayAndGetByIndex() {
//        Заменить ArrayList на свою реализацию CustomArrayList
        var list = new ArrayList<Integer>();

        int expectedEl = 123;
        list.add(expectedEl);
        var actual = list.get(0);

        if (actual == expectedEl) {
            System.out.println("shouldAddElementToArrayAndGetByIndex test ok");
        } else {
            throw new RuntimeException("shouldAddElementToArrayAndGetByIndex test not ok!!!");
        }
    }


}
