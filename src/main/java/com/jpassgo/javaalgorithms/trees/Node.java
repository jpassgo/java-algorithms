package com.jpassgo.javaalgorithms.trees;

public class Node<T extends Comparable<T>> {

    private Object value;
    private Node leftChild;
    private Node rightChild;

    public <T extends Comparable<T>> Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return (T) value;
    }

    public <T extends Comparable<T>> void setValue(T value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
