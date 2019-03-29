package com.xingray.container;

import com.xingray.container.operators.generic.CloneFactory;
import com.xingray.container.operators.generic.Mapper;
import com.xingray.container.operators.generic.Processor;
import com.xingray.container.operators.generic.Tester;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GenericContainer<T> extends Container<T> {

    public GenericContainer(Object container, int containerType) {
        super(container, containerType);
    }

    @Override
    public T[] asArray() {
        return null;
    }

    @Override
    public boolean[] asBooleanArray() {
        return new boolean[0];
    }

    @Override
    public byte[] asByteArray() {
        return new byte[0];
    }

    @Override
    public short[] asShortArray() {
        return new short[0];
    }

    @Override
    public int[] asIntArray() {
        return new int[0];
    }

    @Override
    public long[] asLongArray() {
        return new long[0];
    }

    @Override
    public float[] asFloatArray() {
        return new float[0];
    }

    @Override
    public double[] asDoubleArray() {
        return new double[0];
    }

    @Override
    public ArrayList<T> asList() {
        return null;
    }

    @Override
    public <K> HashMap<K, T> asMap() {
        return null;
    }

    @Override
    public HashSet<T> asSet() {
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
