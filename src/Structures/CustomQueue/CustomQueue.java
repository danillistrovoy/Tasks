package Structures.CustomQueue;

import Structures.CustomArrayList.CustomArrayList;

public class CustomQueue<T> {
    private final CustomArrayList<T> array;
    private int front;
    private int back;

    public CustomQueue() {
        array = new CustomArrayList<T>();
        back = -1;
        front = -1;
    }

    public boolean isEmpty() {
        return back - front == 0;
    }

    public void enqueue(T data) {
        if (back != array.length() - 1) {
            back++;
            array.add(data,back);
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Array is empty");
        } else {
            int index = ++front;
            var el = array.get(index);
            array.remove(index);
            return el;
        }
    }

    public T top() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Array is empty");
        } else {
            return array.get(front+1);
        }
    }

    public int getSize() {
        return back - front;
    }
}
