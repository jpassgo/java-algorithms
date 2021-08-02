package com.jpassgo.javaalgorithms.stacks_and_queues;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static java.lang.Double.valueOf;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class StackTest {

  @Test
  void pop() {
    Stack stack = new Stack();

    stack.push(valueOf("100"));

    assertThat(stack.peak()).isEqualTo(valueOf(100));
  }
}
