package com.xingray.container.operators.primary.indexmapper;

public interface ByteGenericIndexMapper <T> {
    T map(int index, byte value);
}