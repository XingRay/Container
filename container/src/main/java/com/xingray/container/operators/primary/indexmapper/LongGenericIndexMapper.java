package com.xingray.container.operators.primary.indexmapper;

public interface LongGenericIndexMapper <T> {
    T map(int index, long value);
}