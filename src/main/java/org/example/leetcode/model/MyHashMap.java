package org.example.leetcode.model;

import java.util.Arrays;
import java.util.Objects;

public class MyHashMap {

    private static final int SIZE = 10;
    private Entry[] entrySet;
    public MyHashMap() {
        entrySet = new Entry[SIZE];
    }

    public void put(int key, int value) {
        int index = Objects.hash(key) % SIZE;
        if (entrySet[index] == null) {
            entrySet[index] = new Entry(key, value);
        } else {
            Entry prev = null;
            Entry entry = entrySet[index];
            while (entry != null) {
                if (entry.key == key) {
                    entry.value = value;
                    return;
                } else {
                    prev = entry;
                    entry = entry.next;
                }
            }
            prev.next = new Entry(key, value);
        }
    }

    public int get(int key) {
        int index = Objects.hash(key) % SIZE;
        Entry entry = entrySet[index];
        while (entry != null) {
            if (entry.key == key) {
                return entry.value;
            }
            entry = entry.next;
        }

        return -1;
    }

    public void remove(int key) {
        int index = Objects.hash(key) % SIZE;
        if (entrySet[index] != null) {
            Entry prev = null;
            Entry entry = entrySet[index];
            while (entry != null) {
                if (entry.key == key) {
                    if (prev == null) {
                        entrySet[index] = entry.next;
                        return;
                    } else {
                        prev.next = entry.next;
                        return;
                    }
                }
                prev = entry;
                entry = entry.next;
            }
        }
    }

    public class Entry {
        public int key;
        public int value;
        public Entry next;

        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return String.format("[%d,%d] -> %s", key, value, next);
        }
    }


}
