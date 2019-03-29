package com.xingray.container.operators.primary.indexmapper;

public interface ShortGenericIndexMapper <T> {
    T map(int index, short value);
}