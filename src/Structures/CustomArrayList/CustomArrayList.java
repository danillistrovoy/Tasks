package Structures.CustomArrayList;
//    CustomArrayList - динамический массив, значит он изменяет свою размер, когда не хватает кол-ва элементов

//    0. Конструтор без параметров, который инициализурует массив с некой N
//    0.1 Конструктор принимает размерность N и инициализирует массив

import java.util.ArrayList;
import java.util.Scanner;

// 1. add - добавляет элемент в конец массива, если массив недосточной длины, то он увеличивается в 2
// 1.1 add(el, index) - добавляет элемент по индексу в массив
// 2. get - получить элемент массива по индекссу
//    3. size - получить размер массива
//    4. remove - удалить элемент массива по индексу
public class CustomArrayList {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int P = scanner.nextInt();
        var ConstructorWP = new ArrayList<>();
        for (int i = 0; i < P; i++) {
            ConstructorWP.add(i);
        }
        ConstructorWP.add(5,15);
        System.out.println(ConstructorWP.get(5));
        System.out.println(ConstructorWP.size());
        ConstructorWP.remove(3);
        System.out.println(ConstructorWP);
    }
}
