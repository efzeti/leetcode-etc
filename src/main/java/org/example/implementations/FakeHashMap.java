package org.example.implementations;

import org.example.implementations.model.FakeEntry;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FakeHashMap<K, V> {

    private final int SIZE = 5;
    private FakeEntry<K, V> table[];

    public FakeHashMap() {
        this.table = new FakeEntry[SIZE];
    }

    public void put(K key, V value) {
        int hash = key.hashCode() % SIZE;
        FakeEntry<K, V> e = table[hash];
        if (e == null) {
            table[hash] = new FakeEntry<>(key, value);
        } else {
            while (e.getNext() != null) {
                if (e.getKey().equals(key)) {
                    e.setValue(value);
                    return;
                }
                e = e.getNext();
            }

            if (e.getKey().equals(key)) {
                e.setValue(value);
            } else {
                e.setNext(new FakeEntry<>(key, value));
            }

        }
    }

    public V get(K key) {
        int hash = key.hashCode() % SIZE;
        FakeEntry<K, V> e = table[hash];
        while (e != null) {
            if (e.getKey().equals(key)) {
                return e.getValue();
            }
            e = e.getNext();
        }
        return null;
    }

    public void remove(K key) {
        int hash = key.hashCode() % SIZE;
        FakeEntry<K, V> e = table[hash];
        
        if (e.getKey().equals(key)) {
            table[hash] = e.getNext();
            e.setNext(null);
            return;
        }

        FakeEntry<K, V> prev = e;
        e = e.getNext();

        while (e != null) {
            if (e.getKey().equals(key)) {
                prev.setNext(e.getNext());
                e.setNext(null);
                return;
            }

            prev = e;
            e = e.getNext();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (FakeEntry<K, V> e : table) {
            while (e != null) {
                sb.append(e.toString()).append(", ");
                e = e.getNext();
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
