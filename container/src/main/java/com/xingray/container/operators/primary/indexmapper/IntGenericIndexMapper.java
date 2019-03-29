package com.xingray.container.operators.primary.indexmapper;

public interface IntGenericIndexMapper <T> {
    T map(int index, int value);
}