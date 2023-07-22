package Structures.CustomQueue;

public class CustomQueue<T> {
    private final T[] array;
    private int front;
    private int back;

    public CustomQueue() {
        array = new T[1000];
        back = -1;
        front = -1;
    }

    public boolean isEmpty() {
        return back - front == 0;
    }

    public void enqueue(T data) {
        if (back != array.length - 1) {
            back++;
            array[back] = data;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Array is empty");
        } else {
            return array[++front];
        }
    }

    public T top() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Array is empty");
        } else {
            return array[front + 1];
        }
    }

    public int getSize() {
        return back - front;
    }
}
