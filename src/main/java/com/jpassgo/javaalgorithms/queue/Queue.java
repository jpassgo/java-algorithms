package com.jpassgo.javaalgorithms.queue;

public interface Queue<T> {

  public void add(T t);

  public T remove();

  public T peek();

  public boolean isEmpty();
}
