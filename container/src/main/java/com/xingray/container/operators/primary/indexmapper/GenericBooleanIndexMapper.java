package com.xingray.container.operators.primary.indexmapper;

public interface GenericBooleanIndexMapper <T> {
    boolean map(int index, T value);
}