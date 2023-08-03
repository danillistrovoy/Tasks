package Structures.CustomQueue;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomQueueTest {
    @Test
     void isEmptyTest() {
        CustomQueue<Integer> queue = new CustomQueue<>();
        queue.enqueue(10);
        queue.dequeue();
        Assertions.assertEquals(10,10);
    }
    @Test
     void enqueueTest() {
        CustomQueue<Integer> queue = new CustomQueue<>();
        queue.enqueue(5);
        queue.enqueue(10);
        Assertions.assertEquals(5,queue.top());
        Assertions.assertEquals(2,queue.getSize());
    }

    @Test
    void dequeueTest() {
        CustomQueue<Integer> queue = new CustomQueue<>();
        queue.enqueue(10);
        int expected = 10;
        var actual = queue.dequeue();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void topTest() {
        CustomQueue<Integer> queue = new CustomQueue<>();
        queue.enqueue(15);
        queue.enqueue(20);
        int expectedSize = 2;
        int actualSize = queue.getSize();
        var expected = 15;
        var actual = queue.top();
        Assertions.assertEquals(actual,expected);
        Assertions.assertEquals(expectedSize,actualSize);
    }

    @Test
    void enqueueElementIntoFullQueue() {
        CustomQueue<Integer> queue = new CustomQueue<>();
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

    @Test
    void dequeueElementFromEmptyQueue() {
        CustomQueue<Integer> queue = new CustomQueue<>();
        try {
            queue.dequeue();
            System.out.println("dequeueElementInEmptyQueueTest is not ok!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("dequeueElementInEmptyQueueTest is ok!");
        }
    }

    @Test
    void getSizeTest() {
        CustomQueue<Integer> queue = new CustomQueue<>();
        queue.enqueue(5);
        queue.enqueue(5);
        queue.dequeue();
        Assertions.assertEquals(1,queue.getSize());
    }
}


