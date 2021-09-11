package com.jpassgo.javaalgorithms.avl_tree;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AVLTreeTest {

  @Test
  void insert() {
    AVLTree tree = new AVLTree();

    tree.insert(10);
    tree.insert(9);
    tree.insert(8);
    tree.insert(7);
    tree.insert(6);
    tree.insert(5);
    tree.insert(4);
    tree.insert(3);
    tree.insert(2);
    tree.insert(1);

    assertThat(tree.getBalanceFactor()).isBetween(-1, 1);
  }
}
