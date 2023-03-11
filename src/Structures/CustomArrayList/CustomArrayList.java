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
    int size = 0;

    public void add(int el) {
//        1. если element не вмещается в массив, значит надо увеличивать его if size >= array.length
//        2. Создаём массив размерностью size * 2 newArray
//        3. Перекладываем элементы из одного массива во второй array => newArray
//        4. Присваиваем к this.array = newArray
//        5. Добавление элементы по индексу = size

        array[size] = el;
        size++;
    }

    public void add(int el, int index) {
        checkArrayIndex(index);
        array[index] = el;
    }

    public int get(int index) {
        checkArrayIndex(index);
        return array[index];
    }

    private void checkArrayIndex(int index) {
        int lastIndex = size - 1;
        if (index > lastIndex) {
            throw new IndexOutOfBoundsException(index);
        }
    }

    public int size() {
        return size;
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


