package Structures.CustomStack;

public class CustomStack {
    private int[] array;
    private int top;

    public CustomStack(int size) {
        array = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void push(int data) {
        int i = ++top;
        array[i] = data;
    }

    public int pop() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
        } else if (top == 0) {
            int data = array[top];
            top--;
            return data;
        } else {
            return array[--top];
        }
    }

    public int top() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
        } else {
            return array[top];
        }
    }

    public int size() {
        return top + 1;
    }
}


