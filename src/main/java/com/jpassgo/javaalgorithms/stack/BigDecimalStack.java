package com.jpassgo.javaalgorithms.stack;

import java.math.BigDecimal;
import java.util.Arrays;

public class BigDecimalStack implements Stack<BigDecimal> {

  private BigDecimal[] stack;
  private int size;

  public BigDecimalStack() {
    this.stack = new BigDecimal[100];
    this.size = 0;
  }

  @Override
  public void push(BigDecimal element) {
    if (stack.length == size) {
      resize();
    }
    stack[size++] = element;
  }

  @Override
  public BigDecimal pop() {
    return stack[(size--) - 1];
  }

  @Override
  public BigDecimal peek() {
    return stack[size - 1];
  }

  @Override
  public boolean isEmpty() {
    return size <= 0;
  }

  private void resize() {
    this.stack = Arrays.copyOf(stack, size * 2);
  }
}
