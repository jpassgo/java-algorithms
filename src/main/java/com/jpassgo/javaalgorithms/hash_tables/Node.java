package com.jpassgo.javaalgorithms.hash_tables;

public class Node<T> {

    public Node(String key, T value) {
        setKey(key);
        setValue(value);
    }

    private String key;
    private T value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
