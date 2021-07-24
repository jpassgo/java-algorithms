package com.jpassgo.javaalgorithms.stacks_and_queues;

import java.lang.reflect.Array;

public class Stack<E extends Comparable> {

    private E[] elements;
    private int size;

    public Stack(Class<E> clazz) {
        elements = (E[]) Array.newInstance(clazz, 10000);
    }

    public void push(E element) {
        elements[size++] = element;
    }

    public boolean empty() {
        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public <E extends Comparable> int search(E o) throws Exception {
        for (int i = 0; i <= size; i++) {
            if(elements[i].compareTo(o) == 0) {
                return i;
            }
        }
        throw new Exception("Element not found");
    }

    public E peak() {
        return elements[size];
    }

    public E pop() {
        return elements[size--];
    }
}
