package org.example.implementations;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.Arrays;

public class FakeArrayList<V>{

    private V arr[];
    private int size;
    int capacity;

    public FakeArrayList() {
        size = 0;
        capacity = 4;
        arr = (V[]) new Object[capacity];
    }

    public FakeArrayList(int initSize) {
        size = 0;
        capacity = initSize;
        arr = (V[]) new Object[capacity];
    }

    void add(V v) {
        if (size == capacity) {
            capacity = capacity * 2;
            V[] tempArr = (V[]) new Object[capacity];
            for (int i = 0; i < arr.length; i++) {
                tempArr[i] = arr[i];
            }
            arr = tempArr;
        }
        arr[size++] = v;
    }

    V get(int i) {
        return arr[i];
    }

    public int getSize() {
        return size;
    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    }
}
