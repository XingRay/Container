package com.xingray.container;

import com.xingray.container.operators.CloneFactory;
import com.xingray.container.operators.Mapper;
import com.xingray.container.operators.Processor;
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
 * todo
 */
public abstract class Container<T> {

    private Object container;
    private int containerType;

    protected Container(Object container, int containerType) {
        this.container = container;
        this.containerType = containerType;
    }

    static <T> Container<T> ofArray(T[] array) {
        return new GenericContainer<>(array, ContainerType.ARRAY);
    }

    static Container ofArray(boolean[] array) {
        return new BooleanContainer(array, ContainerType.ARRAY);
    }

    static Container ofArray(byte[] array) {
        return new ByteContainer(array, ContainerType.ARRAY);
    }

    static Container ofArray(char[] array) {
        return new CharContainer(array, ContainerType.ARRAY);
    }

    static Container ofArray(short[] array) {
        return new ShortContainer(array, ContainerType.ARRAY);
    }

    static Container ofArray(int[] array) {
        return new IntContainer(array, ContainerType.ARRAY);
    }

    static Container ofArray(long[] array) {
        return new LongContainer(array, ContainerType.ARRAY);
    }

    static Container ofArray(float[] array) {
        return new FloatContainer(array, ContainerType.ARRAY);
    }

    static Container ofArray(double[] array) {
        return new DoubleContainer(array, ContainerType.ARRAY);
    }

    static <T> Container<T> of(T... array) {
        return ofArray(array);
    }

    static Container of(boolean... array) {
        return ofArray(array);
    }

    static Container of(byte... array) {
        return ofArray(array);
    }

    static Container of(char... array) {
        return ofArray(array);
    }

    static Container of(short... array) {
        return ofArray(array);
    }

    static Container of(int... array) {
        return ofArray(array);
    }

    static Container of(long... array) {
        return ofArray(array);
    }

    static Container of(float... array) {
        return ofArray(array);
    }

    static Container of(double... array) {
        return ofArray(array);
    }

    public static <T> Container<T> of(Iterable<T> iterable) {
        return new GenericContainer<>(iterable, ContainerType.ITERABLE);
    }

    public static <T> Container<T> of(Map<?, T> map) {
        return new GenericContainer<>(map, ContainerType.MAP);
    }

    public static <T> Container<T> of(Container<T> container) {
        return container.clone();
    }

    public abstract T[] asArray();

    public abstract boolean[] asBooleanArray();

    public abstract byte[] asByteArray();

    public abstract short[] asShortArray();

    public abstract int[] asIntArray();

    public abstract long[] asLongArray();

    public abstract float[] asFloatArray();

    public abstract double[] asDoubleArray();

    public abstract ArrayList<T> asList();

    public abstract <K> HashMap<K, T> asMap();

    public abstract HashSet<T> asSet();

    public abstract boolean isEmpty();

    public abstract boolean hasElement();

    public abstract int getSize();

    public abstract boolean isValidIndex(int index);

    public abstract boolean isOutOfIndex(int index);

    public abstract <K> boolean hasElementBy(K key);

    public abstract boolean hasElementAt(int index);

    public abstract boolean contains(Container<T> container);

    public abstract T safetyGet(int index);

    public abstract boolean equals(Container<?> container);

    public int indexOf(T t) {
        return indexOf(t, 0);
    }

    public abstract int indexOf(T t, int startIndex);

    public T find(Tester<T> tester) {
        return find(0, tester);
    }

    public abstract T find(int startIndex, Tester<T> tester);

    public Container<T> findAll(Tester<T> tester) {
        return findAll(0, tester);
    }

    public abstract Container<T> findAll(int startIndex, Tester<T> tester);

    public abstract Container<T> filter(Tester<T> tester);

    public abstract Container<T> move(int fromIndex, int toIndex);

    public Container<T> distinct() {
        return distinct(null);
    }

    public abstract <K> Container<T> distinct(Mapper<T, K> mapper);

    public abstract Container<T> merge(Container<T> container);

    public abstract Container<T> intersection(Container<T> container);

    public abstract Container<T> diff(Container<T> container);

    public abstract Container<T> traversal(Processor<T> processor);

    public abstract <K> Container<K> convert(Mapper<T, K> mapper);

    public abstract Container<T> clone();

    public abstract Container<T> deepClone(CloneFactory<T> factory);

    public abstract Container<T> concat(Container<T> container);

    public abstract Container<T> swap(int x, int y);
}
