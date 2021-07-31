package com.jpassgo.javaalgorithms.stacks_and_queues;

public class Stack<E extends Comparable> {

  private Object[] elements;
  private int size;

  public Stack() {
    elements = new Object[10000];
  }

  public Stack(int capacity) {
    elements = new Object[capacity];
  }

  public void push(E element) {
    elements[size++] = element;
  }

  public boolean empty() {
    if (size == 0) {
      return true;
    } else {
      return false;
    }
  }

  public <E extends Comparable> int search(E o) {
    for (int i = 0; i <= size; i++) {
      if (elements[i].equals(o)) {
        return i;
      }
    }
    return 0;
  }

  public Object peak() {
    return elements[size];
  }

  public Object pop() {
    return elements[size--];
  }
}
