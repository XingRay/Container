package com.xingray.container.operators.primary.indexmapper;

public interface DoubleGenericIndexMapper <T> {
    T map(int index, double value);
}