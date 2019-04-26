package com.xingray.container;

import com.xingray.container.helper.ContainerCore;
import com.xingray.container.operators.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapContainer<K, T> implements Container<K, T> {
    private Map<K, T> map;

    public MapContainer(Map<K, T> map) {
        this.map = map;
    }

    @Override
    public T[] asArray() {
        return ContainerCore.toArray(map);
    }

    @Override
    public ArrayList<T> asList() {
        return ContainerCore.toList(map);
    }

    @Override
    public HashMap<K, T> asMap() {
        return ContainerCore.toMap(map);
    }

    @Override
    public HashSet<T> asSet() {
        return ContainerCore.toSet(map);
    }

    @Override
    public boolean isEmpty() {
        return ContainerCore.isEmpty(map);
    }

    @Override
    public boolean hasElement() {
        return ContainerCore.hasElement(map);
    }

    @Override
    public int getSize() {
        return ContainerCore.getSize(map);
    }

    @Override
    public boolean isValidIndex(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isOutOfIndex(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasElementBy(K key) {
        return ContainerCore.hasElementByKey(map, key);
    }

    @Override
    public boolean hasElementAt(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T safetyGet(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Container<K, T> container) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Container<K, T> container) {
        return ContainerCore.equals(map, container.asMap());
    }

    @Override
    public int indexOf(T t) {
        return indexOf(0, t);
    }

    @Override
    public int indexOf(int startIndex, T t) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T find(Tester<T> tester) {
        return find(0, tester);
    }

    @Override
    public T find(int startIndex, Tester<T> tester) {
        return ContainerCore.find(map, startIndex, tester);
    }

    @Override
    public Container<K, T> filter(Tester<T> tester) {
        return null;
    }

    @Override
    public Container<K, T> move(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public Container<K, T> distinct() {
        return null;
    }

    @Override
    public <K1> Container<K1, T> distinct(Mapper<T, K1> mapper) {
        return null;
    }

    @Override
    public Container<K, T> merge(Container<K, T> container) {
        return null;
    }

    @Override
    public Container<K, T> intersection(Container<K, T> container) {
        return null;
    }

    @Override
    public Container<K, T> diff(Container<K, T> container) {
        return null;
    }

    @Override
    public Container<K, T> traversal(IndexProcessor<T> processor) {
        ContainerCore.traversal(map, processor);
        return this;
    }

    @Override
    public <K1> Container<K1, K1> convert(Mapper<T, K1> mapper) {
        return null;
    }

    @Override
    public Container<K, T> clone() {
        return null;
    }

    @Override
    public Container<K, T> deepClone(CloneFactory<T> factory) {
        return null;
    }

    @Override
    public Container<K, T> concat(Container<K, T> container) {
        return null;
    }

    @Override
    public Container<K, T> swap(int x, int y) {
        return null;
    }
}
