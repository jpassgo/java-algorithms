package com.jpassgo.javaalgorithms.avl_tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Node<T extends Comparable> {

    private T value;
    private int balanceFactor;
    private int heightOfSubTree;
    private Node leftChild;
    private Node rightChild;

}
