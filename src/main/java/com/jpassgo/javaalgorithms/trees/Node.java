package com.jpassgo.javaalgorithms.trees;

import java.util.List;

public class Node<T extends Comparable<T>> {

    private Object value;
    private List<Node<T>> children;

    public <T extends Comparable<T>> Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return (T) value;
    }

    public <T extends Comparable<T>> void setValue(T value) {
        this.value = value;
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    public void setChildren(List<Node<T>> children) {
        this.children = children;
    }
}
