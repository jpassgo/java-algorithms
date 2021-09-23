package com.jpassgo.javaalgorithms.heap.min_heap;

public class MinHeap {
    private int[] heap;
    private int size;

    public MinHeap() {
        heap = new int[10];
        size = 0;
    }

    public MinHeap(int size) {
        this.heap = new int[size];
        this.size = 0;
    }

    public int insert(int value) {
        if(size == 0) {
            heap[size] = value;
            size+=1;
        } else {
            heap[size] = value;
        }

        int index = size;
        boolean isLessThanParent = true;

        while(isLessThanParent && size > 1) {
            int parentIndex = (index - 1) / 2;
            if(heap[index] < heap[parentIndex]) {
                int temp = heap[index];
                heap[index] = heap[parentIndex];
                heap[parentIndex] = temp;
                index = parentIndex;
            } else {
                isLessThanParent = false;
            }
        }


        return value;
    }
}
