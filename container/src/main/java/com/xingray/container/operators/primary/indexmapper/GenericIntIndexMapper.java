package com.xingray.container.operators.primary.indexmapper;

public interface GenericIntIndexMapper <T> {
    int map(int index, T value);
}