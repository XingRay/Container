package com.xingray.container.operators.primary.indexmapper;

public interface GenericByteIndexMapper <T> {
    byte map(int index, T value);
}