package com.jpassgo.javaalgorithms.queue;

import java.util.Arrays;

public class StringQueue implements Queue<String> {

  private String[] queue;
  private int size;

  public StringQueue() {
    this.queue = new String[100];
    this.size = 0;
  }

  @Override
  public void add(String s) {
    this.queue[size++] = s;
  }

  @Override
  public String remove() {
    String removedItem = this.queue[0];
    shift();
    return removedItem;
  }

  @Override
  public String peek() {
    return this.queue[0];
  }

  @Override
  public boolean isEmpty() {
    return this.size <= 0;
  }

  private void shift() {
    for (int i = 1; i < this.size - 1; i++) {
      this.queue[i - 1] = this.queue[i];
    }
    size--;
  }

  private void resize() {
    this.queue = Arrays.copyOf(this.queue, this.size * 2);
  }
}
