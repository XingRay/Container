package com.xingray.container;

import com.xingray.container.operators.CloneFactory;
import com.xingray.container.operators.Mapper;
import com.xingray.container.operators.Processor;
import com.xingray.container.operators.Tester;

import java.util.ArrayList;
import java.util.Map;

public class LongContainer extends Container {
    public LongContainer(Object container, int containerType) {
        super(container, containerType);
    }

    @Override
    public Object[] asArray() {
        return new Object[0];
    }

    @Override
    public Object[] asBooleanArray() {
        return new Object[0];
    }

    @Override
    public Object[] asByteArray() {
        return new Object[0];
    }

    @Override
    public Object[] asShortArray() {
        return new Object[0];
    }

    @Override
    public Object[] asIntArray() {
        return new Object[0];
    }

    @Override
    public Object[] asLongArray() {
        return new Object[0];
    }

    @Override
    public Object[] asFloatArray() {
        return new Object[0];
    }

    @Override
    public Object[] asDoubleArray() {
        return new Object[0];
    }

    @Override
    public ArrayList asList() {
        return null;
    }

    @Override
    public Map asMap() {
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
