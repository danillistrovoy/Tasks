package Structures.CustomStack;

public class CustomStackTest {
    public static void main(String[] args) {
        popTest();
        pushTest();
        isEmptyTest();
        topTest();
        pushElementIntoFullStack();
        popElementFromEmptyStack();
    }

    static void popTest() {
        CustomStack stack = new CustomStack(3);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        int expected = 15;
        int actual = stack.pop();
        int expectedsize = 2;
        int actualsize = stack.size();
        if (expected == actual && expectedsize == actualsize) {
            System.out.println("popTest is ok!");
        } else {
            System.out.println("popTest is not ok!");
        }
    }


    static void isEmptyTest() {
        CustomStack stack = new CustomStack(6);
        stack.push(10);
        stack.pop();
        if (stack.isEmpty()) {
            System.out.println("isEmptyTest is ok!");
        } else {
            System.out.println("isEmptyTest is not ok!");
        }
    }

    static void pushTest() {
        CustomStack stack = new CustomStack(10);
        stack.push(10);
        stack.push(15);
        if (stack.top() == 15 && stack.size() == 2) {
            System.out.println("pushTest is ok!");
        } else {
            System.out.println("pushTest is not ok!");
        }
    }

    static void topTest() {
        CustomStack stack = new CustomStack(10);
        stack.push(10);
        stack.push(15);
        int expected = 15;
        int actual = stack.top();
        int expectedsize = 2;
        int actualsize = stack.size();
        if (expected == actual && expectedsize == actualsize) {
            System.out.println("topTest is ok!");
        } else {
            System.out.println("topTest is not ok!");
        }
    }

    static void pushElementIntoFullStack() {
        CustomStack stack = new CustomStack(3);
        try {
            stack.push(10);
            stack.push(10);
            stack.push(10);
            stack.push(10);
            System.out.println("fullStackTest is not ok!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("fullStackTest is ok!");
        }
    }

    static void popElementFromEmptyStack() {
        CustomStack stack = new CustomStack(4);
        try {
            stack.pop();
            System.out.println("popElementFromEmptyStackTest is not ok!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("popElementFromEmptyStackTest is ok!");
        }
    }
}


