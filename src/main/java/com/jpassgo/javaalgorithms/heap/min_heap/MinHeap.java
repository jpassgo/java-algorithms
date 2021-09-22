package com.jpassgo.javaalgorithms.heap.min_heap;

public class MinHeap<T extends Comparable> {
    private T[] heap;
    private int size;

    public MinHeap() {
        size = 0;
    }

    public MinHeap(int size) {
        this.heap = heap;
        this.size = size;
    }

    public <T> int insert(T value) {

        heap[++size] = value;


        return 0;
    }
}
