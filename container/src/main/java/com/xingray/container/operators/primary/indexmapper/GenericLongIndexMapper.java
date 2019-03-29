package com.xingray.container.operators.primary.indexmapper;

public interface GenericLongIndexMapper <T> {
    long map(int index, T value);
}