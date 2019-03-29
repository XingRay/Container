package com.xingray.container.operators.primary.indexmapper;

public interface GenericFloatIndexMapper <T> {
    float map(int index, T value);
}