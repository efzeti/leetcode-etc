package org.example.implementations.model;

import java.util.Objects;

public class FakeEntry<K, V> {

    K key;
    V value;

    FakeEntry<K, V> next;

    public FakeEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FakeEntry<?, ?> fakeEntry = (FakeEntry<?, ?>) o;
        return key.equals(fakeEntry.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    @Override
    public String toString() {
        return key + "=" + value;
    }

    public K getKey() {
        return key;
    }

    public FakeEntry<K, V> getNext() {
        return next;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setNext(FakeEntry<K, V> next) {
        this.next = next;
    }

    public void setNext(K key, V value) {
        this.next = new FakeEntry<>(key, value);
    }
}
