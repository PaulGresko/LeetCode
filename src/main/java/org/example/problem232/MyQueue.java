package org.example.problem232;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> reader;
    private Stack<Integer> writer;
    public MyQueue() {
        reader = new Stack<>();
        writer = new Stack<>();
    }

    public void push(int x) {
        if(!reader.isEmpty()){
            writer.clear();
            while (!reader.isEmpty()){
                writer.push(reader.pop());
            }
        }
        writer.push(x);
    }

    public int pop() {
        if(!writer.isEmpty()){
            reader.clear();
            while (!writer.isEmpty()){
               reader.push(writer.pop());
            }
        }
        return reader.pop();
    }

    public int peek() {
        if(!writer.isEmpty()){
            reader.clear();
            while (!writer.isEmpty()){
                reader.push(writer.pop());
            }
        }
        return reader.peek();
    }

    public boolean empty() {
        return reader.isEmpty() && writer.isEmpty();
    }
}
