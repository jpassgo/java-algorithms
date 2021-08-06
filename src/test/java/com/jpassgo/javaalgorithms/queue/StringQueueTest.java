package com.jpassgo.javaalgorithms.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class StringQueueTest {

  private Queue queue = new StringQueue();

  @BeforeEach
  void setup() {
    queue.add("first");
    queue.add("second");
    queue.add("third");
    queue.add("fourth");
  }

  @Test
  void add() {
    assertFalse(queue.isEmpty());
  }

  @Test
  void remove() {
    queue.remove();

    Object size = ReflectionTestUtils.getField(queue, "size");
    assertTrue((int) size == 3);
  }
}
