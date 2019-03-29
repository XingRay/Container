package com.xingray.container;

import com.xingray.container.operators.generic.CloneFactory;
import com.xingray.container.operators.generic.Mapper;
import com.xingray.container.operators.generic.Processor;
import com.xingray.container.operators.generic.Tester;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LongContainer extends Container {
    public LongContainer(Object container, int containerType) {
        super(container, containerType);
    }

    @Override
    public Object[] asArray() {
        return new Object[0];
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
    public ArrayList asList() {
        return null;
    }

    @Override
    public HashMap asMap() {
        return null;
    }

    @Override
    public HashSet asSet() {
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
    public boolean hasElementBy(Object key) {
        return false;
    }

    @Override
    public boolean hasElementAt(int index) {
        return false;
    }

    @Override
    public boolean contains(Container container) {
        return false;
    }

    @Override
    public Object safetyGet(int index) {
        return null;
    }

    @Override
    public boolean equals(Container container) {
        return false;
    }

    @Override
    public int indexOf(Object o, int startIndex) {
        return 0;
    }

    @Override
    public Object find(int startIndex, Tester tester) {
        return null;
    }

    @Override
    public Container findAll(int startIndex, Tester tester) {
        return null;
    }

    @Override
    public Container filter(Tester tester) {
        return null;
    }

    @Override
    public Container move(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public Container distinct(Mapper mapper) {
        return null;
    }

    @Override
    public Container merge(Container container) {
        return null;
    }

    @Override
    public Container intersection(Container container) {
        return null;
    }

    @Override
    public Container diff(Container container) {
        return null;
    }

    @Override
    public Container traversal(Processor processor) {
        return null;
    }

    @Override
    public Container convert(Mapper mapper) {
        return null;
    }

    @Override
    public Container clone() {
        return null;
    }

    @Override
    public Container deepClone(CloneFactory factory) {
        return null;
    }

    @Override
    public Container concat(Container container) {
        return null;
    }

    @Override
    public Container swap(int x, int y) {
        return null;
    }
}
