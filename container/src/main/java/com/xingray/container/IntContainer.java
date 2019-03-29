package com.xingray.container;

import com.xingray.container.helper.ContainerCore;
import com.xingray.container.helper.Converter;
import com.xingray.container.operators.generic.CloneFactory;
import com.xingray.container.operators.generic.Mapper;
import com.xingray.container.operators.generic.Processor;
import com.xingray.container.operators.generic.Tester;
import com.xingray.container.operators.primary.mapper.IntBooleanMapper;
import com.xingray.container.operators.primary.mapper.IntGenericMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class IntContainer extends Container {

    IntContainer(Object container, int containerType) {
        super(container, containerType);
    }

    @Override
    public Object[] asArray() {
        return Converter.convertGeneric(getArray(), new Object[getSize()], new IntGenericMapper<Object>(){
            @Override
            public Object map(int value) {
                return value;
            }
        });
    }

    @Override
    public boolean[] asBooleanArray() {
        return ContainerCore.convert(getArray(), new IntBooleanMapper(){
            @Override
            public boolean map(int value) {
                return false;
            }
        });
    }

    @Override
    public byte[] asByteArray() {
        return null;
    }

    @Override
    public short[] asShortArray() {
        return null;
    }

    @Override
    public int[] asIntArray() {
        return getArray();
    }

    @Override
    public long[] asLongArray() {
        return null;
    }

    @Override
    public float[] asFloatArray() {
        return null;
    }

    @Override
    public double[] asDoubleArray() {
        return null;
    }

    @Override
    public ArrayList asList() {
        return ContainerCore.toList(getArray());
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

    private int[] getArray() {
        if (mContainerType != ContainerType.ARRAY) {
            throw new IllegalStateException();
        }
        return (int[]) mContainer;
    }
}
