package com.jpassgo.javaalgorithms.heap.min_heap;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MinHeapTest {

  @Test
  void insert() {
    MinHeap minHeap = new MinHeap(100);
    minHeap.insert(78);
    minHeap.insert(10);
    minHeap.insert(8);
    minHeap.insert(90);
    minHeap.insert(2);
    minHeap.insert(9);

    assertThat(minHeap.getSize()).isEqualTo(6);
  }
}
