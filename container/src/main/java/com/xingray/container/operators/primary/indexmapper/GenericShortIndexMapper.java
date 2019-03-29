package com.xingray.container.operators.primary.indexmapper;

public interface GenericShortIndexMapper <T> {
    short map(int index, T value);
}