package com.jpassgo.javaalgorithms.stacks_and_queues;

import java.lang.reflect.Array;

public class Stack<E> {

    private E[] elements;

    public Stack(Class<E> clazz) {
        elements = (E[]) Array.newInstance(clazz, 10000);
    }

    public void push(E element) {
    }

    public boolean empty() {
        return false;
    }

    public <E> int search(E o) {
        return 0;
    }

    public E peak() {
        return null;
    }

    public E pop() {
        return null;
    }
}
