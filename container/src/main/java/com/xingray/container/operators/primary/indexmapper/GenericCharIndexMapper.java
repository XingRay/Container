package com.xingray.container.operators.primary.indexmapper;

public interface GenericCharIndexMapper <T> {
    char map(int index, T value);
}