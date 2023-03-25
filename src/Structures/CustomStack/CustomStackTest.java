package Structures.CustomStack;

public class CustomStackTest {
    public static void main(String[] args) {
        popTest();
        pushTest();
        isEmptyTest();
        //topTest();
    }

    static void popTest() {
        CustomStack stack = new CustomStack(5);
        try {
            stack.push(10);
            stack.pop();
            System.out.println("popTest is not ok!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("popTest is ok!");
        }
    }

    static void isEmptyTest() {
        CustomStack stack = new CustomStack(6);
        stack.push(10);
        if (stack.isEmpty()) {
            System.out.println("isEmptyTest is not ok!");
        } else {
            System.out.println("isEmptyTest is ok!");
        }
    }

    static void pushTest() {
        CustomStack stack = new CustomStack(10);
        stack.push(10);
        if (stack.top() == 10) {
            System.out.println("pushTest is ok!");
        } else {
            System.out.println("pushTest is not ok!");
        }
    }
}
    /*static void topTest(){
        CustomStack stack = new CustomStack(10);

        }
    }

