package org.example.problem232;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    @Test
    void test1(){
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        assertEquals(1,queue.peek());
        assertEquals(1,queue.pop());
        queue.push(3);
        assertEquals(2,queue.pop());
        assertFalse(queue.empty());
    }

}