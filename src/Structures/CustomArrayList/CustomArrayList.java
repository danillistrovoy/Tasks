package Structures.CustomArrayList;

//    CustomArrayList - динамический массив, значит он изменяет свою размер, когда не хватает кол-ва элементов
//    Массив на integer

//    0. Конструктор без параметров, который инициализурует массив с некой N
//    0.1 Конструктор принимает размерность N и инициализирует массив

// 1. метод add - добавляет элемент в конец массива, если массив недосточной длины, то он увеличивается в 2
// 1.1 метод add(el, index) - добавляет элемент по индексу в массив
// 2. метод get - получить элемент массива по индекссу
//    3. метод size - получить размер массива
//    4. метод remove - удалить элемент массива по индексу
public class CustomArrayList {
    int[] array;
    int el;
    int index;
    int l;
    int n;

    public void add(int el) {
        array[array.length] = el;
    }

    public void add(int el, int index) {
        array[index] = el;
    }

    public int get(int index) {
        return array[index];
    }

    public int size() {
        return array.length;
    }

    public void remove(int index) {
        for (int i = index; i < array.length; i++) {
            array[i - 1] = array[i];
            array[i] = 0;
        }
    }


    public CustomArrayList() {
        array = new int[10];
    }

    public CustomArrayList(int n) {
        array = new int[n];
    }

}


