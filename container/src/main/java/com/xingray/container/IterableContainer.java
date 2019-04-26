package com.xingray.container;

import com.xingray.container.helper.ContainerCore;
import com.xingray.container.operators.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class IterableContainer<T> implements Container<Integer, T> {
    private Iterable<T> iterable;

    public IterableContainer(Iterable<T> iterable) {
        this.iterable = iterable;
    }

    @Override
    public T[] asArray() {
        return ContainerCore.toArray(iterable);
    }

    @Override
    public ArrayList<T> asList() {
        return ContainerCore.toList(iterable);
    }

    @Override
    public HashMap<Integer, T> asMap() {
        return ContainerCore.toMap(iterable);
    }

    @Override
    public HashSet<T> asSet() {
        return ContainerCore.toSet(iterable);
    }

    @Override
    public boolean isEmpty() {
        return ContainerCore.isEmpty(iterable);
    }

    @Override
    public boolean hasElement() {
        return ContainerCore.hasElement(iterable);
    }

    @Override
    public int getSize() {
        return ContainerCore.getSize(iterable);
    }

    @Override
    public boolean isValidIndex(int index) {
        return ContainerCore.isValidIndex(iterable, index);
    }

    @Override
    public boolean isOutOfIndex(int index) {
        return ContainerCore.isOutOfIndex(iterable, index);
    }

    @Override
    public boolean hasElementBy(Integer key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasElementAt(int index) {
        return ContainerCore.hasElementAt(iterable, index);
    }

    @Override
    public T safetyGet(int index) {
        return ContainerCore.safetyGet(iterable, index);
    }

    @Override
    public boolean contains(Container<Integer, T> container) {
        return ContainerCore.contains(iterable, container.asList());
    }

    @Override
    public boolean equals(Container<Integer, T> container) {
        return ContainerCore.equals(iterable, container.asList());
    }

    @Override
    public int indexOf(T t) {
        return indexOf(0, t);
    }

    @Override
    public int indexOf(int startIndex, T t) {
        return ContainerCore.indexOf(iterable, t, startIndex);
    }

    @Override
    public T find(Tester<T> tester) {
        return find(0, tester);
    }

    @Override
    public T find(int startIndex, Tester<T> tester) {
        return ContainerCore.find(iterable, startIndex, tester);
    }

    @Override
    public Container<Integer, T> filter(Tester<T> tester) {
        return null;
    }

    @Override
    public Container<Integer, T> move(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public Container<Integer, T> distinct() {
        return null;
    }

    @Override
    public <K> Container<K, T> distinct(Mapper<T, K> mapper) {
        return null;
    }

    @Override
    public Container<Integer, T> merge(Container<Integer, T> container) {
        return null;
    }

    @Override
    public Container<Integer, T> intersection(Container<Integer, T> container) {
        return null;
    }

    @Override
    public Container<Integer, T> diff(Container<Integer, T> container) {
        return null;
    }

    @Override
    public Container<Integer, T> traversal(IndexProcessor<T> processor) {
        ContainerCore.traversal(iterable, processor);
        return this;
    }

    @Override
    public <K> Container<K, K> convert(Mapper<T, K> mapper) {
        return null;
    }

    @Override
    public Container<Integer, T> clone() {
        return null;
    }

    @Override
    public Container<Integer, T> deepClone(CloneFactory<T> factory) {
        return null;
    }

    @Override
    public Container<Integer, T> concat(Container<Integer, T> container) {
        return null;
    }

    @Override
    public Container<Integer, T> swap(int x, int y) {
        return null;
    }
}
