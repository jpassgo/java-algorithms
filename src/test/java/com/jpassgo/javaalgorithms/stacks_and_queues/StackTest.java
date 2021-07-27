package com.jpassgo.javaalgorithms.stacks_and_queues;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;



@ExtendWith(MockitoExtension.class)
class StackTest {

    @Test
    void pop() {
        Stack stack = new Stack();

        stack.push(valueOf("100"));

        assertThat(stack.peak()).isEqualTo(Double.valueOf(100));
    }
}