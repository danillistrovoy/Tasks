package Structures.CustomQueue;

public class CustomQueue {
    private int[] array;
    private int front;
    private int back;
    private int size;

    public CustomQueue(int sizeOfArray) {
        array = new int[sizeOfArray];
        back = -1;
        front = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int data) {
        if (back != array.length - 1) {
            back++;
            array[back] = data;
            size++;
        }
    }

    public void dequeue(){
        if (isEmpty()){
            throw new IndexOutOfBoundsException("Array is empty");
        }
        else {
            front++;
            size--;
        }
    }
    public int top(){
        if (isEmpty()){
            throw new IndexOutOfBoundsException("Array is empty");
        }
        else {
            return array[front+1];
        }
    }
    public int getSize(){
        return size;
    }
}
