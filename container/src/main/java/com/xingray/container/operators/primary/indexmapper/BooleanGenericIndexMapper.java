package com.xingray.container.operators.primary.indexmapper;

public interface BooleanGenericIndexMapper <T> {
    T map(int index, boolean value);
}