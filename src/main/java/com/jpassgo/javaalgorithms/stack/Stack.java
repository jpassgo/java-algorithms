package com.jpassgo.javaalgorithms.stack;

public interface Stack<T> {

    public void push(T element);

    public T pop();

    public T peek();

    public boolean isEmpty();
}
