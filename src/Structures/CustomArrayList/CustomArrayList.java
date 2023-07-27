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
    private Object[] array;
    private int size = 0;

    public void add(T el) {
        if (size >= array.length) {
            Object[] newArray = new Object[size * 2];
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
        return (T) array[index];
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
                array[i] = array[i + 1];
            }
        size--;
        }


    public CustomArrayList() {
        array = new Object[10];
    }

    public CustomArrayList(int n) {
        array = new Object[n];
    }

}


