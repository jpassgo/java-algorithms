package com.jpassgo.javaalgorithms.trees;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTreeTest {

    @Test
    void insert() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(100);
        binarySearchTree.insert(10);
        binarySearchTree.insert(15);
        binarySearchTree.insert(1);
        binarySearchTree.insert(123);
        binarySearchTree.insert(34);
        binarySearchTree.insert(5);
    }

    @Test
    void contains() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(100);
        binarySearchTree.insert(10);
        binarySearchTree.insert(15);
        binarySearchTree.insert(1);
        binarySearchTree.insert(123);
        binarySearchTree.insert(34);
        binarySearchTree.insert(5);

        assertThat(binarySearchTree.contains(15)).isEqualTo(true);
    }

    @Test
    void delete() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(100);
        binarySearchTree.insert(10);
        binarySearchTree.insert(15);
        binarySearchTree.insert(1);
        binarySearchTree.insert(123);
        binarySearchTree.insert(34);
        binarySearchTree.insert(5);

        binarySearchTree.preorder();

        System.out.println("******************************");
        binarySearchTree.delete(15);

        binarySearchTree.preorder();
    }
}