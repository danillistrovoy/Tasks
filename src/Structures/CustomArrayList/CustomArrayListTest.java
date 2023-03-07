package Structures.CustomArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CustomArrayListTest {

    public static void main(String[] args) {
        var ArrayWOP = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            ArrayWOP.add(i);
        }
        System.out.println(ArrayWOP.size());
        ArrayWOP.add(10);
        if (ArrayWOP.size() > 10) {
            for (int i = ArrayWOP.size(); i < ArrayWOP.size() * 2; i++) {
                ArrayWOP.add(0);
                if (ArrayWOP.size() == 20) {
                    break;
                }
            }
        }
        System.out.println(ArrayWOP.size());

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

    private static class ArrayAdd {
        public static void main(String[] args) {
            int[] Array = new int[10];

        }
    }


}
