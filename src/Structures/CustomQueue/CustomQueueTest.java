package Structures.CustomQueue;


public class CustomQueueTest {

     void isEmptyTest() {
        CustomQueue<Integer> queue = new CustomQueue<>();
        queue.enqueue(10);
        queue.dequeue();
        //Assertions.assertEquals();
    }

     void enqueueTest() {
        CustomQueue<Integer> queue = new CustomQueue<>();
        queue.enqueue(5);
        queue.enqueue(10);
        if (queue.getSize() == 2 && queue.top() == 5) {
            System.out.println("enqueueTest is ok!");
        } else {
            System.out.println("enqueueTest is not ok!");
        }
    }


    void dequeueTest() {
        CustomQueue queue = new CustomQueue();
        queue.enqueue(10);
        int expected = 10;
        var actual = queue.dequeue();
        if (queue.isEmpty() && expected == actual) {
            System.out.println("dequeueTest is ok!");
        } else {
            System.out.println("dequeueTest is not ok!");
        }
    }


    void topTest() {
        CustomQueue queue = new CustomQueue();
        queue.enqueue(15);
        queue.enqueue(20);
        int expectedSize = 2;
        int actualSize = queue.getSize();
        var expected = 15;
        var actual = queue.top();
        if (actual == expected && expectedSize == actualSize) {
            System.out.println("topTest is ok!");
        } else {
            System.out.println("topTest is not ok!");
        }
    }


    void enqueueElementIntoFullQueue() {
        CustomQueue queue = new CustomQueue();
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


    void dequeueElementFromEmptyQueue() {
        CustomQueue queue = new CustomQueue();
        try {
            queue.dequeue();
            System.out.println("dequeueElementInEmptyQueueTest is not ok!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("dequeueElementInEmptyQueueTest is ok!");
        }
    }


    void getSizeTest() {
        CustomQueue queue = new CustomQueue();
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
