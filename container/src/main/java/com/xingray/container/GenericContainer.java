package com.xingray.container;

import com.xingray.container.operators.CloneFactory;
import com.xingray.container.operators.Mapper;
import com.xingray.container.operators.Processor;
import com.xingray.container.operators.Tester;

import java.util.ArrayList;
import java.util.Map;

public class GenericContainer<T> extends Container<T> {

    public GenericContainer(Object container, int containerType) {
        super(container, containerType);
    }

    @Override
    public T[] asArray() {
        return null;
    }

    @Override
    public T[] asBooleanArray() {
        return null;
    }

    @Override
    public T[] asByteArray() {
        return null;
    }

    @Override
    public T[] asShortArray() {
        return null;
    }

    @Override
    public T[] asIntArray() {
        return null;
    }

    @Override
    public T[] asLongArray() {
        return null;
    }

    @Override
    public T[] asFloatArray() {
        return null;
    }

    @Override
    public T[] asDoubleArray() {
        return null;
    }

    @Override
    public ArrayList<T> asList() {
        return null;
    }

    @Override
    public <K> Map<K, T> asMap() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean hasElement() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isValidIndex(int index) {
        return false;
    }

    @Override
    public boolean isOutOfIndex(int index) {
        return false;
    }

    @Override
    public <K> boolean hasElementBy(K key) {
        return false;
    }

    @Override
    public boolean hasElementAt(int index) {
        return false;
    }

    @Override
    public boolean contains(Container<T> container) {
        return false;
    }

    @Override
    public T safetyGet(int index) {
        return null;
    }

    @Override
    public boolean equals(Container<?> container) {
        return false;
    }

    @Override
    public int indexOf(T t, int startIndex) {
        return 0;
    }

    @Override
    public T find(int startIndex, Tester<T> tester) {
        return null;
    }

    @Override
    public Container<T> findAll(int startIndex, Tester<T> tester) {
        return null;
    }

    @Override
    public Container<T> filter(Tester<T> tester) {
        return null;
    }

    @Override
    public Container<T> move(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public <K> Container<T> distinct(Mapper<T, K> mapper) {
        return null;
    }

    @Override
    public Container<T> merge(Container<T> container) {
        return null;
    }

    @Override
    public Container<T> intersection(Container<T> container) {
        return null;
    }

    @Override
    public Container<T> diff(Container<T> container) {
        return null;
    }

    @Override
    public Container<T> traversal(Processor<T> processor) {
        return null;
    }

    @Override
    public <K> Container<K> convert(Mapper<T, K> mapper) {
        return null;
    }

    @Override
    public Container<T> clone() {
        return null;
    }

    @Override
    public Container<T> deepClone(CloneFactory<T> factory) {
        return null;
    }

    @Override
    public Container<T> concat(Container<T> container) {
        return null;
    }

    @Override
    public Container<T> swap(int x, int y) {
        return null;
    }
}
