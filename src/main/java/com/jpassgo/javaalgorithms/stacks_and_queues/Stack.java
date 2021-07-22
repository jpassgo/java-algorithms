package com.jpassgo.javaalgorithms.stacks_and_queues;

public interface Stack<E> {

    public void push(E element);

    public <E> E pop();

    public <E> E peak();

    public boolean empty();

    int search(Object o);

}
