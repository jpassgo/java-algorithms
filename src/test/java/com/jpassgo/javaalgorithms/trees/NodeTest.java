package com.jpassgo.javaalgorithms.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;

@ExtendWith(MockitoExtension.class)
class NodeTest {

    @Test
    void node() {
        Node<String> node = new Node("test");
        assertThat(node.getValue()).isEqualTo("test");
    }

    @Test
    void node_fails() {
        Node<BigDecimal> node = new Node(BigDecimal.valueOf(1));
        assertFalse(node.getValue().equals(BigDecimal.valueOf(2)));
    }
}