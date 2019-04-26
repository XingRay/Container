package com.xingray.container;

import com.xingray.container.helper.ContainerCore;
import com.xingray.container.operators.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayContainer<T> implements Container<Integer, T> {
    private T[] array;

    public ArrayContainer(T[] array) {
        this.array = array;
    }

    @Override
    public T[] asArray() {
        return ContainerCore.clone(array);
    }

    @Override
    public ArrayList<T> asList() {
        return ContainerCore.toList(array);
    }

    @Override
    public HashMap<Integer, T> asMap() {
        return ContainerCore.toMap(array);
    }

    @Override
    public HashSet<T> asSet() {
        return ContainerCore.toSet(array);
    }

    @Override
    public boolean isEmpty() {
        return ContainerCore.isEmpty(array);
    }

    @Override
    public boolean hasElement() {
        return ContainerCore.hasElement(array);
    }

    @Override
    public int getSize() {
        return ContainerCore.getSize(array);
    }

    @Override
    public boolean isValidIndex(int index) {
        return ContainerCore.isValidIndex(array, index);
    }

    @Override
    public boolean isOutOfIndex(int index) {
        return ContainerCore.isOutOfIndex(array, index);
    }

    @Override
    public boolean hasElementBy(Integer key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasElementAt(int index) {
        return ContainerCore.hasElementAt(array, index);
    }

    @Override
    public T safetyGet(int index) {
        return ContainerCore.safetyGet(array, index);
    }

    @Override
    public boolean contains(Container<Integer, T> container) {
        return ContainerCore.contains(array, container.asArray());
    }

    @Override
    public boolean equals(Container<Integer, T> container) {
        return ContainerCore.equals(array, container.asArray());
    }

    @Override
    public int indexOf(T t) {
        return indexOf(0, t);
    }

    @Override
    public int indexOf(int startIndex, T t) {
        return ContainerCore.indexOf(array, t, startIndex);
    }

    @Override
    public T find(Tester<T> tester) {
        return find(0, tester);
    }

    @Override
    public T find(int startIndex, Tester<T> tester) {
        return ContainerCore.find(array, startIndex, tester);
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
        ContainerCore.traversal(array, processor);
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
