package Structures.CustomStack;

public class CustomStack {
    private int size;
    private int[] array;
    private int top;

    public CustomStack(int s) {
        size = s;
        array = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int data) {
        int i = ++top;
        array[i] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return array[--top];
        }
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return array[top];
        }
    }

}
