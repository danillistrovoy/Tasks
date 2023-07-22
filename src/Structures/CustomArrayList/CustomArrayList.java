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
public class CustomArrayList<T> {
    private T[] array;
    private int size = 0;

    public void add(T el) {
        if (size >= array.length) {
            T[] newArray = new T[size * 2];
            System.arraycopy(array, 0, newArray, 0, size);
            this.array = newArray;
        }
        array[size] = el;
        size++;
    }

    public void add(T el, int index) {
        array[index] = el;
    }

    public T get(int index) {
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
        for (int i = index; i <= size; i++) {
            if (array[i + 1] > size) {
                break;
            } else {
                array[i] = array[i + 1];
            }
        }
    }


    public CustomArrayList() {
        array = new T[10];
    }

    public CustomArrayList(int n) {
        array = new T[n];
    }

}


