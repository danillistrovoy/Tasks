package Structures.CustomQueue;

public class CustomQueueTest {
    public static void main(String[] args) {
        isEmptyTest();
        enqueueTest();
        dequeueTest();
        topTest();
        enqueueElementIntoFullQueue();
        dequeueElementFromEmptyQueue();
        getSizeTest();
    }

    static void isEmptyTest() {
        CustomQueue queue = new CustomQueue(5);
        queue.enqueue(10);
        queue.dequeue();
        if (queue.isEmpty()) {
            System.out.println("isEmptyTest is ok!");
        } else {
            System.out.println("isEmptyTest is not ok!");
        }
    }

    static void enqueueTest() {
        CustomQueue queue = new CustomQueue(3);
        queue.enqueue(5);
        queue.enqueue(10);
        if (queue.getSize() == 2 && queue.top() == 5) {
            System.out.println("enqueueTest is ok!");
        } else {
            System.out.println("enqueueTest is not ok!");
        }
    }

    static void dequeueTest() {
        CustomQueue queue = new CustomQueue(4);
        queue.enqueue(10);
        int expected = 10;
        int actual = queue.dequeue();
        if (queue.isEmpty() && expected == actual) {
            System.out.println("dequeueTest is ok!");
        } else {
            System.out.println("dequeueTest is not ok!");
        }
    }

    static void topTest() {
        CustomQueue queue = new CustomQueue(4);
        queue.enqueue(15);
        queue.enqueue(20);
        int expectedSize = 2;
        int actualSize = queue.getSize();
        int expected = 15;
        int actual = queue.top();
        if (actual == expected && expectedSize == actualSize) {
            System.out.println("topTest is ok!");
        } else {
            System.out.println("topTest is not ok!");
        }
    }

    static void enqueueElementIntoFullQueue() {
        CustomQueue queue = new CustomQueue(3);
        try {
            queue.enqueue(10);
            queue.enqueue(10);
            queue.enqueue(10);
            queue.enqueue(10);
            System.out.println("enqueueElementIntoFullQueueTest is not ok!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("enqueueElementIntoFullQueueTest is ok!");
        }
    }

    static void dequeueElementFromEmptyQueue() {
        CustomQueue queue = new CustomQueue(3);
        try {
            queue.dequeue();
            System.out.println("dequeueElementInEmptyQueueTest is not ok!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("dequeueElementInEmptyQueueTest is ok!");
        }
    }

    static void getSizeTest() {
        CustomQueue queue = new CustomQueue(5);
        queue.enqueue(5);
        queue.enqueue(5);
        queue.dequeue();
        if (queue.getSize() == 1) {
            System.out.println("getSizeTest is ok!");
        } else {
            System.out.println("getSizeTest is not ok!");
        }
    }
}
