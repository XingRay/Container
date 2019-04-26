package com.xingray.container;

import com.xingray.container.helper.ContainerCore;
import com.xingray.container.operators.CloneFactory;
import com.xingray.container.operators.IndexProcessor;
import com.xingray.container.operators.Mapper;
import com.xingray.container.operators.Tester;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author : leixing
 * date : 2017-02-20
 * Email       : leixing1012@qq.com
 * Version     : 0.0.1
 * <p>
 * Description : Container
 */
public interface Container<K, T> {

    static <T> Container<Integer, T> ofArray(T[] array) {
        return new ArrayContainer<>(array);
    }

    static Container<Integer, Boolean> ofArray(boolean[] array) {
        return new ArrayContainer<>(ContainerCore.toBoxArray(array));
    }

    static Container<Integer, Byte> ofArray(byte[] array) {
        return new ArrayContainer<>(ContainerCore.toBoxArray(array));
    }

    static Container<Integer, Character> ofArray(char[] array) {
        return new ArrayContainer<>(ContainerCore.toBoxArray(array));
    }

    static Container<Integer, Short> ofArray(short[] array) {
        return new ArrayContainer<>(ContainerCore.toBoxArray(array));
    }

    static Container<Integer, Integer> ofArray(int[] array) {
        return new ArrayContainer<>(ContainerCore.toBoxArray(array));
    }

    static Container<Integer, Long> ofArray(long[] array) {
        return new ArrayContainer<>(ContainerCore.toBoxArray(array));
    }

    static Container<Integer, Float> ofArray(float[] array) {
        return new ArrayContainer<>(ContainerCore.toBoxArray(array));
    }

    static Container<Integer, Double> ofArray(double[] array) {
        return new ArrayContainer<>(ContainerCore.toBoxArray(array));
    }

    static <T> Container<Integer, T> of(T... array) {
        return ofArray(array);
    }

    static Container<Integer, Boolean> of(boolean... array) {
        return ofArray(array);
    }

    static Container<Integer, Byte> of(byte... array) {
        return ofArray(array);
    }

    static Container<Integer, Character> of(char... array) {
        return ofArray(array);
    }

    static Container<Integer, Short> of(short... array) {
        return ofArray(array);
    }

    static Container<Integer, Integer> of(int... array) {
        return ofArray(array);
    }

    static Container<Integer, Long> of(long... array) {
        return ofArray(array);
    }

    static Container<Integer, Float> of(float... array) {
        return ofArray(array);
    }

    static Container<Integer, Double> of(double... array) {
        return ofArray(array);
    }

    static <T> Container<Integer, T> of(Iterable<T> iterable) {
        return new IterableContainer<>(iterable);
    }

    static <K, T> Container<K, T> of(Map<K, T> map) {
        return new MapContainer<>(map);
    }

    static <K, T> Container<K, T> of(Container<K, T> container) {
        return container.clone();
    }

    T[] asArray();

    ArrayList<T> asList();

    HashMap<K, T> asMap();

    HashSet<T> asSet();

    boolean isEmpty();

    boolean hasElement();

    int getSize();

    boolean isValidIndex(int index);

    boolean isOutOfIndex(int index);

    boolean hasElementBy(K key);

    boolean hasElementAt(int index);

    T safetyGet(int index);

    boolean contains(Container<K, T> container);

    boolean equals(Container<K, T> container);

    int indexOf(T t);

    int indexOf(int startIndex, T t);

    T find(Tester<T> tester);

    T find(int startIndex, Tester<T> tester);

    Container<K, T> filter(Tester<T> tester);

    Container<K, T> move(int fromIndex, int toIndex);

    Container<K, T> distinct();

    <K> Container<K, T> distinct(Mapper<T, K> mapper);

    Container<K, T> merge(Container<K, T> container);

    Container<K, T> intersection(Container<K, T> container);

    Container<K, T> diff(Container<K, T> container);

    Container<K, T> traversal(IndexProcessor<T> processor);

    <K> Container<K, K> convert(Mapper<T, K> mapper);

    Container<K, T> clone();

    Container<K, T> deepClone(CloneFactory<T> factory);

    Container<K, T> concat(Container<K, T> container);

    Container<K, T> swap(int x, int y);
}
