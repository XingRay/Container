package com.xingray.container.operators.primary.indexmapper;

public interface GenericDoubleIndexMapper <T> {
    double map(int index, T value);
}