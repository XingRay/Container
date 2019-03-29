package com.xingray.container.helper;


import com.xingray.container.operators.generic.*;
import com.xingray.container.operators.primary.mapper.*;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author : leixing
 * date : 2017-02-20
 * Email       : leixing1012@qq.com
 * Version     : 0.0.1
 * <p>
 * Description : util for collection
 * <p>
 */

@SuppressWarnings({"WeakerAccess", "unused", "unchecked"})
public class ContainerCore {

    private ContainerCore() {
        throw new UnsupportedOperationException();
    }

    public static boolean isEmpty(Iterable<?> iterable) {
        return iterable == null || (iterable instanceof Collection && isEmpty((Collection) iterable))
                || !iterable.iterator().hasNext();
    }

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    public static <T> boolean isEmpty(T[] array) {
        return array == null || array.length == 0;
    }

    public static boolean isEmpty(boolean[] array) {
        return array == null || array.length == 0;
    }

    public static boolean isEmpty(byte[] array) {
        return array == null || array.length == 0;
    }

    public static boolean isEmpty(char[] array) {
        return array == null || array.length == 0;
    }

    public static boolean isEmpty(short[] array) {
        return array == null || array.length == 0;
    }

    public static boolean isEmpty(int[] array) {
        return array == null || array.length == 0;
    }

    public static boolean isEmpty(long[] array) {
        return array == null || array.length == 0;
    }

    public static boolean isEmpty(float[] array) {
        return array == null || array.length == 0;
    }

    public static boolean isEmpty(double[] array) {
        return array == null || array.length == 0;
    }

    public static boolean hasElement(Iterable<?> iterable) {
        return iterable != null && iterable.iterator().hasNext();
    }

    public static boolean hasElement(Collection<?> collection) {
        return collection != null && !collection.isEmpty();
    }

    public static boolean hasElement(Map<?, ?> map) {
        return map != null && !map.isEmpty();
    }

    public static <T> boolean hasElement(T[] array) {
        return array != null && array.length > 0;
    }

    public static boolean hasElement(boolean[] array) {
        return array != null && array.length > 0;
    }

    public static boolean hasElement(byte[] array) {
        return array != null && array.length > 0;
    }

    public static boolean hasElement(char[] array) {
        return array != null && array.length > 0;
    }

    public static boolean hasElement(int[] array) {
        return array != null && array.length > 0;
    }

    public static boolean hasElement(long[] array) {
        return array != null && array.length > 0;
    }

    public static boolean hasElement(float[] array) {
        return array != null && array.length > 0;
    }

    public static boolean hasElement(double[] array) {
        return array != null && array.length > 0;
    }

    public static <T> int getSize(Iterable<T> iterable) {
        if (iterable == null) {
            return 0;
        }
        if (iterable instanceof Collection) {
            return ((Collection<T>) iterable).size();
        }
        int size = 0;
        for (T e : iterable) {
            size++;
        }
        return size;
    }

    public static int getSize(Map<?, ?> map) {
        return map == null ? 0 : map.size();
    }

    public static <T> int getSize(T[] array) {
        return array == null ? 0 : array.length;
    }

    public static int getSize(boolean[] array) {
        return array == null ? 0 : array.length;
    }

    public static int getSize(byte[] array) {
        return array == null ? 0 : array.length;
    }

    public static int getSize(char[] array) {
        return array == null ? 0 : array.length;
    }

    public static int getSize(int[] array) {
        return array == null ? 0 : array.length;
    }

    public static int getSize(long[] array) {
        return array == null ? 0 : array.length;
    }

    public static int getSize(float[] array) {
        return array == null ? 0 : array.length;
    }

    public static int getSize(double[] array) {
        return array == null ? 0 : array.length;
    }

    public static boolean isValidIndex(Iterable<?> iterable, int index) {
        return index < getSize(iterable) && index >= 0;
    }

    public static boolean isValidIndex(Collection<?> collection, int index) {
        return index < getSize(collection) && index >= 0;
    }

    public static boolean isValidIndex(List<?> list, int index) {
        return index < getSize(list) && index >= 0;
    }

    public static boolean isValidIndex(boolean[] array, int index) {
        return index < getSize(array) && index >= 0;
    }

    public static <T> boolean isValidIndex(T[] array, int index) {
        return index < getSize(array) && index >= 0;
    }

    public static boolean isValidIndex(byte[] array, int index) {
        return index < getSize(array) && index >= 0;
    }

    public static boolean isValidIndex(char[] array, int index) {
        return index < getSize(array) && index >= 0;
    }

    public static boolean isValidIndex(int[] array, int index) {
        return index < getSize(array) && index >= 0;
    }

    public static boolean isValidIndex(float[] array, int index) {
        return index < getSize(array) && index >= 0;
    }

    public static boolean isValidIndex(double[] array, int index) {
        return index < getSize(array) && index >= 0;
    }

    public static boolean isValidIndex(long[] array, int index) {
        return index < getSize(array) && index >= 0;
    }

    public static boolean isOutOfIndex(Iterable<?> iterable, int index) {
        return index < 0 || index >= getSize(iterable);
    }

    public static <T> boolean isOutOfIndex(T[] array, int index) {
        return index < 0 || index >= getSize(array);
    }

    public static boolean isOutOfIndex(boolean[] array, int index) {
        return index < 0 || index >= getSize(array);
    }

    public static boolean isOutOfIndex(byte[] array, int index) {
        return index < 0 || index >= getSize(array);
    }

    public static boolean isOutOfIndex(char[] array, int index) {
        return index < 0 || index >= getSize(array);
    }

    public static boolean isOutOfIndex(int[] array, int index) {
        return index < 0 || index >= getSize(array);
    }

    public static boolean isOutOfIndex(float[] array, int index) {
        return index < 0 || index >= getSize(array);
    }

    public static boolean isOutOfIndex(double[] array, int index) {
        return index < 0 || index >= getSize(array);
    }

    public static boolean isOutOfIndex(long[] array, int index) {
        return index < 0 || index >= getSize(array);
    }

    public static <T> boolean hasElementByKey(Map<T, ?> map, T key) {
        return !(map == null || map.isEmpty()) && map.get(key) != null;
    }

    public static <T> boolean hasElementAt(Iterable<T> iterable, int index) {
        if (iterable == null) {
            return false;
        }

        if (iterable instanceof List) {
            return isValidIndex((List<T>) iterable, index)
                    && ((List<T>) iterable).get(index) != null;
        }

        int i = 0;
        for (T t : iterable) {
            if (i == index) {
                return t != null;
            }
            i++;
        }
        return false;
    }

    public static <T> boolean hasElementAt(T[] array, int index) {
        return isValidIndex(array, index) && array[index] != null;
    }

    public static boolean hasElementAt(boolean[] array, int index) {
        return index < getSize(array) && index >= 0;
    }

    public static boolean hasElementAt(byte[] array, int index) {
        return index < getSize(array) && index >= 0;
    }

    public static boolean hasElementAt(char[] array, int index) {
        return index < getSize(array) && index >= 0;
    }

    public static boolean hasElementAt(int[] array, int index) {
        return index < getSize(array) && index >= 0;
    }

    public static boolean hasElementAt(long[] array, int index) {
        return index < getSize(array) && index >= 0;
    }

    public static boolean hasElementAt(float[] array, int index) {
        return index < getSize(array) && index >= 0;
    }

    public static boolean hasElementAt(double[] array, int index) {
        return index < getSize(array) && index >= 0;
    }

    public static <T> T safetyGet(Iterable<T> iterable, int index) {
        if (iterable == null) {
            return null;
        }
        if (iterable instanceof Collection) {
            return safetyGet((Collection<T>) iterable, index);
        }
        int i = 0;
        for (T t : iterable) {
            if (i == index) {
                return t;
            }
            i++;
        }
        return null;
    }

    public static <T> T safetyGet(Collection<T> collection, int index) {
        if (isOutOfIndex(collection, index)) {
            return null;
        }
        if (collection instanceof List) {
            return safetyGet((List<T>) collection, index);
        }
        return (T) collection.toArray()[index];
    }

    public static <T> T safetyGet(List<T> list, int index) {
        T t = null;
        if (isValidIndex(list, index)) {
            t = list.get(index);
        }

        return t;
    }

    public static <T> T safetyGet(T[] array, int index) {
        T t = null;
        if (isValidIndex(array, index)) {
            t = array[index];
        }

        return t;
    }

    public static <K, V> V safetyGet(Map<K, V> map, K key) {
        return map == null ? null : map.get(key);
    }

    public static <T> boolean equals(T t1, T t2) {
        if (t1 == t2) {
            return true;
        }
        if (t1 != null) {
            return t1.equals(t2);
        }
        //noinspection ConstantConditions
        return t2.equals(t1);
    }

    public static <T> boolean equals(Set<T> set1, Set<T> set2) {
        if (set1 == set2) {
            return true;
        }
        if (set1 == null || set2 == null) {
            return false;
        }

        if (set1.size() != set2.size()) {
            return false;
        }

        for (T t : set1) {
            if (t == null) {
                continue;
            }

            if (!set2.contains(t)) {
                return false;
            }
        }

        for (T t : set2) {
            if (t == null) {
                continue;
            }

            if (!set1.contains(t)) {
                return false;
            }
        }

        return true;
    }

    public static <K, V> boolean equals(Map<K, V> map1, Map<K, V> map2) {
        if (map1 == map2) {
            return true;
        }
        if (map1 == null || map2 == null) {
            return false;
        }
        Set<K> keySet1 = map1.keySet();
        Set<K> keySet2 = map2.keySet();
        if (!equals(keySet1, keySet2)) {
            return false;
        }

        for (K k : keySet1) {
            if (!equals(map1.get(k), map2.get(k))) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean equals(Iterable<T> list1, Iterable<T> list2) {
        if (list1 == list2) {
            return true;
        }
        if (list1 == null || list2 == null) {
            return false;
        }

        if (list1 instanceof Collection && list2 instanceof Collection
                && ((Collection) list1).size() != ((Collection) list2).size()) {
            return false;
        }

        Iterator<T> iterator1 = list1.iterator();
        Iterator<T> iterator2 = list2.iterator();
        while (iterator1.hasNext() && iterator2.hasNext()) {
            T t1 = iterator1.next();
            T t2 = iterator2.next();
            if (!equals(t1, t2)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean equals(T[] array1, T[] array2) {
        if (array1 == array2) {
            return true;
        }
        if (array1 == null || array2 == null) {
            return false;
        }
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0, size = array1.length; i < size; i++) {
            if (!equals(array1[i], array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean equals(boolean[] array1, boolean[] array2) {
        if (array1 == array2) {
            return true;
        }
        if (array1 == null || array2 == null) {
            return false;
        }
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0, size = array1.length; i < size; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean equals(byte[] array1, byte[] array2) {
        if (array1 == array2) {
            return true;
        }
        if (array1 == null || array2 == null) {
            return false;
        }
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0, size = array1.length; i < size; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean equals(char[] array1, char[] array2) {
        if (array1 == array2) {
            return true;
        }
        if (array1 == null || array2 == null) {
            return false;
        }
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0, size = array1.length; i < size; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1 == array2) {
            return true;
        }
        if (array1 == null || array2 == null) {
            return false;
        }
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0, size = array1.length; i < size; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean equals(long[] array1, long[] array2) {
        if (array1 == array2) {
            return true;
        }
        if (array1 == null || array2 == null) {
            return false;
        }
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0, size = array1.length; i < size; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean equals(float[] array1, float[] array2) {
        if (array1 == array2) {
            return true;
        }
        if (array1 == null || array2 == null) {
            return false;
        }
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0, size = array1.length; i < size; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean equals(double[] array1, double[] array2) {
        if (array1 == array2) {
            return true;
        }
        if (array1 == null || array2 == null) {
            return false;
        }
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0, size = array1.length; i < size; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static <T> void swap(List<T> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }

    public static <T> void swap(T[] array, int i, int j) {
        T tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static <T> void swap(boolean[] array, int i, int j) {
        boolean tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static <T> void swap(byte[] array, int i, int j) {
        byte tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static <T> void swap(char[] array, int i, int j) {
        char tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static <T> void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static <T> void swap(long[] array, int i, int j) {
        long tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static <T> void swap(float[] array, int i, int j) {
        float tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static <T> void swap(double[] array, int i, int j) {
        double tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static int getIndexOf(boolean[] array, boolean target) {
        return getIndexOf(array, target, 0);
    }

    public static int getIndexOf(boolean[] array, boolean target, int startIndex) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = startIndex, size = array.length; i < size; i++) {
            if (target == array[i]) {
                return i;
            }
        }

        return -1;
    }

    public static int getIndexOf(byte[] array, byte target) {
        return getIndexOf(array, target, 0);
    }

    public static int getIndexOf(byte[] array, byte target, int startIndex) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = startIndex, size = array.length; i < size; i++) {
            if (target == array[i]) {
                return i;
            }
        }

        return -1;
    }

    public static int getIndexOf(char[] array, char target) {
        return getIndexOf(array, target, 0);
    }

    public static int getIndexOf(char[] array, char target, int startIndex) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = startIndex, size = array.length; i < size; i++) {
            if (target == array[i]) {
                return i;
            }
        }

        return -1;
    }

    public static int getIndexOf(int[] array, int target) {
        return getIndexOf(array, target, 0);
    }

    public static int getIndexOf(int[] array, int target, int startIndex) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = startIndex, size = array.length; i < size; i++) {
            if (target == array[i]) {
                return i;
            }
        }

        return -1;
    }

    public static int getIndexOf(float[] array, float target) {
        return getIndexOf(array, target, 0);
    }

    public static int getIndexOf(float[] array, float target, int startIndex) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = startIndex, size = array.length; i < size; i++) {
            if (target == array[i]) {
                return i;
            }
        }

        return -1;
    }

    public static int getIndexOf(double[] array, double target) {
        return getIndexOf(array, target, 0);
    }

    public static int getIndexOf(double[] array, double target, int startIndex) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = startIndex, size = array.length; i < size; i++) {
            if (target == array[i]) {
                return i;
            }
        }

        return -1;
    }

    public static int getIndexOf(long[] array, long target) {
        return getIndexOf(array, target, 0);
    }

    public static int getIndexOf(long[] array, long target, int startIndex) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = startIndex, size = array.length; i < size; i++) {
            if (target == array[i]) {
                return i;
            }
        }

        return -1;
    }

    public static <T> int getIndexOf(T[] array, T target) {
        return getIndexOf(array, target, 0);
    }

    public static <T> int getIndexOf(T[] array, T target, int startIndex) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = startIndex, size = array.length; i < size; i++) {
            if (equals(target, array[i])) {
                return i;
            }
        }

        return -1;
    }


    public static <T> int getIndexOf(Iterable<T> iterable, T target) {
        return getIndexOf(iterable, target, 0);
    }

    public static <T> int getIndexOf(Iterable<T> iterable, T target, int startIndex) {
        if (iterable == null) {
            return -1;
        }

        if (iterable instanceof List && iterable instanceof RandomAccess) {
            List<T> list = (List<T>) iterable;
            for (int i = startIndex, size = list.size(); i < size; i++) {
                if (equals(target, list.get(i))) {
                    return i;
                }
            }
        } else {
            int index = -1;
            for (T t : iterable) {
                index++;
                if (index < startIndex) {
                    continue;
                }
                if (equals(target, t)) {
                    return index;
                }
            }
        }

        return -1;
    }

    public static int getIndexOf(boolean[] array, Tester<Boolean> tester) {
        return getIndexOf(array, 0, tester);
    }

    public static int getIndexOf(boolean[] array, int startIndex, Tester<Boolean> tester) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = 0, size = array.length; i < size; i++) {
            if (tester.test(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int getIndexOf(byte[] array, Tester<Byte> tester) {
        return getIndexOf(array, 0, tester);
    }

    public static int getIndexOf(byte[] array, int startIndex, Tester<Byte> tester) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = 0, size = array.length; i < size; i++) {
            if (tester.test(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int getIndexOf(char[] array, Tester<Character> tester) {
        return getIndexOf(array, 0, tester);
    }

    public static int getIndexOf(char[] array, int startIndex, Tester<Character> tester) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = 0, size = array.length; i < size; i++) {
            if (tester.test(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int getIndexOf(int[] array, Tester<Integer> tester) {
        return getIndexOf(array, 0, tester);
    }

    public static int getIndexOf(int[] array, int startIndex, Tester<Integer> tester) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = 0, size = array.length; i < size; i++) {
            if (tester.test(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int getIndexOf(long[] array, Tester<Long> tester) {
        return getIndexOf(array, 0, tester);
    }

    public static int getIndexOf(long[] array, int startIndex, Tester<Long> tester) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = 0, size = array.length; i < size; i++) {
            if (tester.test(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int getIndexOf(float[] array, Tester<Float> tester) {
        return getIndexOf(array, 0, tester);
    }

    public static int getIndexOf(float[] array, int startIndex, Tester<Float> tester) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = 0, size = array.length; i < size; i++) {
            if (tester.test(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int getIndexOf(double[] array, Tester<Double> tester) {
        return getIndexOf(array, 0, tester);
    }

    public static int getIndexOf(double[] array, int startIndex, Tester<Double> tester) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = 0, size = array.length; i < size; i++) {
            if (tester.test(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public static <T> int getIndexOf(T[] array, Tester<T> tester) {
        return getIndexOf(array, 0, tester);
    }

    public static <T> int getIndexOf(T[] array, int startIndex, Tester<T> tester) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = 0, size = array.length; i < size; i++) {
            if (tester.test(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public static <T> int getIndexOf(Iterable<T> iterable, Tester<T> tester) {
        return getIndexOf(iterable, 0, tester);
    }

    public static <T> int getIndexOf(Iterable<T> iterable, int startIndex, Tester<T> tester) {
        if (isOutOfIndex(iterable, startIndex)) {
            return -1;
        }
        if (iterable instanceof List && iterable instanceof RandomAccess) {
            List<T> list = (List<T>) iterable;
            for (int i = startIndex, size = list.size(); i < size; i++) {
                if (tester.test(list.get(i))) {
                    return i;
                }
            }
        } else {
            int index = -1;
            for (T t : iterable) {
                index++;
                if (index < startIndex) {
                    continue;
                }
                if (tester.test(t)) {
                    return index;
                }
            }
        }

        return -1;
    }

    public static <V> int getIndexOf(boolean[] array, V target, IndexTester<V> matcher) {
        return getIndexOf(array, 0, target, matcher);
    }

    public static <V> int getIndexOf(boolean[] array, int startIndex, V target, IndexTester<V> matcher) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = startIndex, size = array.length; i < size; i++) {
            if (matcher.test(target, i)) {
                return i;
            }
        }

        return -1;
    }

    public static <V> int getIndexOf(byte[] array, V target, IndexTester<V> matcher) {
        return getIndexOf(array, 0, target, matcher);
    }

    public static <V> int getIndexOf(byte[] array, int startIndex, V target, IndexTester<V> matcher) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = startIndex, size = array.length; i < size; i++) {
            if (matcher.test(target, i)) {
                return i;
            }
        }

        return -1;
    }

    public static <V> int getIndexOf(char[] array, V target, IndexTester<V> matcher) {
        return getIndexOf(array, 0, target, matcher);
    }

    public static <V> int getIndexOf(char[] array, int startIndex, V target, IndexTester<V> matcher) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = startIndex, size = array.length; i < size; i++) {
            if (matcher.test(target, i)) {
                return i;
            }
        }

        return -1;
    }

    public static <V> int getIndexOf(int[] array, V target, IndexTester<V> matcher) {
        return getIndexOf(array, 0, target, matcher);
    }

    public static <V> int getIndexOf(int[] array, int startIndex, V target, IndexTester<V> matcher) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = startIndex, size = array.length; i < size; i++) {
            if (matcher.test(target, i)) {
                return i;
            }
        }

        return -1;
    }

    public static <V> int getIndexOf(long[] array, V target, IndexTester<V> matcher) {
        return getIndexOf(array, 0, target, matcher);
    }

    public static <V> int getIndexOf(long[] array, int startIndex, V target, IndexTester<V> matcher) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = startIndex, size = array.length; i < size; i++) {
            if (matcher.test(target, i)) {
                return i;
            }
        }

        return -1;
    }

    public static <V> int getIndexOf(float[] array, V target, IndexTester<V> matcher) {
        return getIndexOf(array, 0, target, matcher);
    }

    public static <V> int getIndexOf(float[] array, int startIndex, V target, IndexTester<V> matcher) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = startIndex, size = array.length; i < size; i++) {
            if (matcher.test(target, i)) {
                return i;
            }
        }

        return -1;
    }

    public static <V> int getIndexOf(double[] array, V target, IndexTester<V> matcher) {
        return getIndexOf(array, 0, target, matcher);
    }

    public static <V> int getIndexOf(double[] array, int startIndex, V target, IndexTester<V> matcher) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = startIndex, size = array.length; i < size; i++) {
            if (matcher.test(target, i)) {
                return i;
            }
        }

        return -1;
    }

    public static <T, V> int getIndexOf(T[] array, V target, IndexTester<V> matcher) {
        return getIndexOf(array, 0, target, matcher);
    }

    public static <T, V> int getIndexOf(T[] array, int startIndex, V target, IndexTester<V> matcher) {
        if (isOutOfIndex(array, startIndex)) {
            return -1;
        }

        for (int i = startIndex, size = array.length; i < size; i++) {
            if (matcher.test(target, i)) {
                return i;
            }
        }

        return -1;
    }

    public static <T, V> int getIndexOf(Iterable<T> iterable, V target, IndexTester<V> matcher) {
        return getIndexOf(iterable, 0, target, matcher);
    }

    public static <T, V> int getIndexOf(Iterable<T> iterable, int startIndex, V target, IndexTester<V> matcher) {
        if (isOutOfIndex(iterable, startIndex)) {
            return -1;
        }

        if (iterable instanceof List && iterable instanceof RandomAccess) {
            List<T> list = (List<T>) iterable;
            for (int index = startIndex, size = list.size(); index < size; index++) {
                if (matcher.test(target, index)) {
                    return index;
                }
            }
        } else {
            int index = -1;
            for (T t : iterable) {
                index++;
                if (index < startIndex) {
                    continue;
                }
                if (matcher.test(target, index)) {
                    return index;
                }
            }
        }

        return -1;
    }

    public static <T> T find(T[] array, Tester<T> tester) {
        return find(array, 0, tester);
    }

    public static <T> T find(T[] array, int startIndex, Tester<T> tester) {
        if (isOutOfIndex(array, startIndex)) {
            return null;
        }
        for (int i = startIndex, size = array.length; i < size; i++) {
            T t = array[i];
            if (tester.test(t)) {
                return t;
            }
        }
        return null;
    }

    public static <T> T find(Iterable<T> iterable, Tester<T> tester) {
        return find(iterable, 0, tester);
    }

    public static <T> T find(Iterable<T> iterable, int startIndex, Tester<T> tester) {
        if (isOutOfIndex(iterable, startIndex)) {
            return null;
        }

        if (iterable instanceof List && iterable instanceof RandomAccess) {
            List<T> list = (List<T>) iterable;
            for (int i = startIndex, size = list.size(); i < size; i++) {
                T t = list.get(i);
                if (tester.test(t)) {
                    return t;
                }
            }
        } else {
            int index = -1;
            for (T t : iterable) {
                index++;
                if (index < startIndex) {
                    continue;
                }
                if (tester.test(t)) {
                    return t;
                }
            }
        }

        return null;
    }

    public static <T, K> T find(Iterable<T> iterable, K key, IndexTester<K> matcher) {
        return find(iterable, 0, key, matcher);
    }

    public static <T, K> T find(Iterable<T> iterable, int startIndex, K key, IndexTester<K> matcher) {
        if (isOutOfIndex(iterable, startIndex)) {
            return null;
        }

        if (iterable instanceof List && iterable instanceof RandomAccess) {
            List<T> list = (List<T>) iterable;
            for (int i = startIndex, size = list.size(); i < size; i++) {
                T t = list.get(i);
                if (matcher.test(key, i)) {
                    return t;
                }
            }
        } else {
            int index = -1;
            for (T t : iterable) {
                index++;
                if (index < startIndex) {
                    continue;
                }
                if (matcher.test(key, index)) {
                    return t;
                }
            }
        }

        return null;
    }

    public static <T, K> T find(T[] array, K key, IndexTester<K> matcher) {
        return find(array, 0, key, matcher);
    }

    public static <T, K> T find(T[] array, int startIndex, K key, IndexTester<K> matcher) {
        if (isOutOfIndex(array, startIndex)) {
            return null;
        }

        for (int i = startIndex, size = array.length; i < size; i++) {
            T t = array[i];
            if (matcher.test(key, i)) {
                return t;
            }
        }

        return null;
    }

    public static <T> int[] indexOf(T[][] array2, Tester<T> tester) {
        return indexOf(array2, 0, 0, tester);
    }

    public static <T> int[] indexOf(T[][] array2, int startIndex0, int startIndex1, Tester<T> tester) {
        if (isOutOfIndex(array2, startIndex0)) {
            return null;
        }
        for (int index0 = startIndex0, size0 = array2.length; index0 < size0; index0++) {
            T[] array = array2[index0];
            if (isOutOfIndex(array, startIndex1)) {
                continue;
            }
            for (int index1 = startIndex1, size1 = array.length; index1 < size1; index1++) {
                T t = array[index1];
                if (tester.test(t)) {
                    return new int[]{index0, index1};
                }
            }
        }
        return null;
    }

    public static <T, K> int[] indexOf(T[][] array2, K key, IndexTester<K> matcher) {
        return indexOf(array2, 0, 0, key, matcher);
    }

    public static <T, K> int[] indexOf(T[][] array2, int startIndex0, int startIndex1, K key, IndexTester<K> matcher) {
        if (isOutOfIndex(array2, startIndex0)) {
            return null;
        }
        for (int index0 = startIndex0, size0 = array2.length; index0 < size0; index0++) {
            T[] array = array2[index0];
            if (isOutOfIndex(array, startIndex1)) {
                continue;
            }
            for (int index1 = startIndex1, size1 = array.length; index1 < size1; index1++) {
                T t = array[index1];
                if (matcher.test(key, index1)) {
                    return new int[]{index0, index1};
                }
            }
        }
        return null;
    }

    public static <T> ArrayList<T> findAll(T[] array, Tester<T> tester) {
        return findAll(array, 0, tester);
    }

    public static <T> ArrayList<T> findAll(T[] array, int startIndex, Tester<T> tester) {
        ArrayList<T> result = new ArrayList<>();

        if (isOutOfIndex(array, startIndex)) {
            return result;
        }

        for (int i = startIndex, size = array.length; i < size; i++) {
            T t = array[i];
            if (tester.test(t)) {
                result.add(t);
            }
        }

        return result;
    }

    public static <T> ArrayList<T> findAll(Iterable<T> iterable, Tester<T> tester) {
        return findAll(iterable, 0, tester);
    }

    public static <T> ArrayList<T> findAll(Iterable<T> iterable, int startIndex, Tester<T> tester) {
        ArrayList<T> result = new ArrayList<>();

        if (isOutOfIndex(iterable, startIndex)) {
            return result;
        }

        if (iterable instanceof List && iterable instanceof RandomAccess) {
            List<T> list = (List<T>) iterable;
            for (int i = startIndex, size = list.size(); i < size; i++) {
                T t = list.get(i);
                if (tester.test(t)) {
                    result.add(t);
                }
            }
        } else {
            int index = -1;
            for (T t : iterable) {
                index++;
                if (index < startIndex) {
                    continue;
                }
                if (tester.test(t)) {
                    result.add(t);
                }
            }
        }

        return result;
    }

    public static <T, K> ArrayList<T> findAll(T[] array, K key, IndexTester<K> matcher) {
        return findAll(array, 0, key, matcher);
    }

    public static <T, K> ArrayList<T> findAll(T[] array, int startIndex, K key, IndexTester<K> matcher) {
        ArrayList<T> result = new ArrayList<>();

        if (isOutOfIndex(array, startIndex)) {
            return result;
        }

        for (int i = startIndex, size = array.length; i < size; i++) {
            T t = array[i];
            if (matcher.test(key, i)) {
                result.add(t);
            }
        }

        return result;
    }

    public static <T, K> ArrayList<T> findAll(Iterable<T> iterable, K key, IndexTester<K> matcher) {
        return findAll(iterable, 0, key, matcher);
    }

    public static <T, K> ArrayList<T> findAll(Iterable<T> iterable, int startIndex, K key, IndexTester<K> matcher) {
        ArrayList<T> result = new ArrayList<>();

        if (isOutOfIndex(iterable, startIndex)) {
            return result;
        }

        if (iterable instanceof List && iterable instanceof RandomAccess) {
            List<T> list = (List<T>) iterable;
            for (int i = startIndex, size = list.size(); i < size; i++) {
                T t = list.get(i);
                if (matcher.test(key, i)) {
                    result.add(t);
                }
            }
        } else {
            int index = -1;
            for (T t : iterable) {
                index++;
                if (index < startIndex) {
                    continue;
                }
                if (matcher.test(key, index)) {
                    result.add(t);
                }
            }
        }

        return result;
    }

    public static <T> void filter(Iterable<T> iterable, Tester<T> tester) {
        if (isEmpty(iterable)) {
            return;
        }
        Iterator<T> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            T t = iterator.next();
            if (!tester.test(t)) {
                iterator.remove();
            }
        }
    }

    public static <T> void move(List<T> list, int fromIndex, int toIndex) {
        if (isOutOfIndex(list, fromIndex)) {
            return;
        }

        if (isOutOfIndex(list, toIndex)) {
            return;
        }

        if (fromIndex == toIndex) {
            return;
        }

        if (fromIndex > toIndex) {
            for (int i = fromIndex; i > toIndex; i--) {
                Collections.swap(list, i, i - 1);
            }
        } else {
            for (int i = fromIndex; i < toIndex; i++) {
                Collections.swap(list, i, i + 1);
            }
        }
    }

    public static <T> void move(T[] array, int fromIndex, int toIndex) {
        if (isOutOfIndex(array, fromIndex)) {
            return;
        }

        if (isOutOfIndex(array, toIndex)) {
            return;
        }

        if (fromIndex == toIndex) {
            return;
        }

        if (fromIndex > toIndex) {
            T temp = array[fromIndex];
            System.arraycopy(array, toIndex, array, toIndex + 1, fromIndex - toIndex);
            array[toIndex] = temp;
        } else {
            T temp = array[fromIndex];
            System.arraycopy(array, fromIndex + 1, array, fromIndex, toIndex - fromIndex);
            array[toIndex] = temp;
        }
    }

    public static <T> void move(boolean[] array, int fromIndex, int toIndex) {
        if (isOutOfIndex(array, fromIndex)) {
            return;
        }

        if (isOutOfIndex(array, toIndex)) {
            return;
        }

        if (fromIndex == toIndex) {
            return;
        }

        if (fromIndex > toIndex) {
            boolean temp = array[fromIndex];
            System.arraycopy(array, toIndex, array, toIndex + 1, fromIndex - toIndex);
            array[toIndex] = temp;
        } else {
            boolean temp = array[fromIndex];
            System.arraycopy(array, fromIndex + 1, array, fromIndex, toIndex - fromIndex);
            array[toIndex] = temp;
        }
    }

    public static <T> void move(byte[] array, int fromIndex, int toIndex) {
        if (isOutOfIndex(array, fromIndex)) {
            return;
        }

        if (isOutOfIndex(array, toIndex)) {
            return;
        }

        if (fromIndex == toIndex) {
            return;
        }

        if (fromIndex > toIndex) {
            byte temp = array[fromIndex];
            System.arraycopy(array, toIndex, array, toIndex + 1, fromIndex - toIndex);
            array[toIndex] = temp;
        } else {
            byte temp = array[fromIndex];
            System.arraycopy(array, fromIndex + 1, array, fromIndex, toIndex - fromIndex);
            array[toIndex] = temp;
        }
    }

    public static <T> void move(char[] array, int fromIndex, int toIndex) {
        if (isOutOfIndex(array, fromIndex)) {
            return;
        }

        if (isOutOfIndex(array, toIndex)) {
            return;
        }

        if (fromIndex == toIndex) {
            return;
        }

        if (fromIndex > toIndex) {
            char temp = array[fromIndex];
            System.arraycopy(array, toIndex, array, toIndex + 1, fromIndex - toIndex);
            array[toIndex] = temp;
        } else {
            char temp = array[fromIndex];
            System.arraycopy(array, fromIndex + 1, array, fromIndex, toIndex - fromIndex);
            array[toIndex] = temp;
        }
    }

    public static <T> void move(int[] array, int fromIndex, int toIndex) {
        if (isOutOfIndex(array, fromIndex)) {
            return;
        }

        if (isOutOfIndex(array, toIndex)) {
            return;
        }

        if (fromIndex == toIndex) {
            return;
        }

        if (fromIndex > toIndex) {
            int temp = array[fromIndex];
            System.arraycopy(array, toIndex, array, toIndex + 1, fromIndex - toIndex);
            array[toIndex] = temp;
        } else {
            int temp = array[fromIndex];
            System.arraycopy(array, fromIndex + 1, array, fromIndex, toIndex - fromIndex);
            array[toIndex] = temp;
        }
    }

    public static <T> void move(long[] array, int fromIndex, int toIndex) {
        if (isOutOfIndex(array, fromIndex)) {
            return;
        }

        if (isOutOfIndex(array, toIndex)) {
            return;
        }

        if (fromIndex == toIndex) {
            return;
        }

        if (fromIndex > toIndex) {
            long temp = array[fromIndex];
            System.arraycopy(array, toIndex, array, toIndex + 1, fromIndex - toIndex);
            array[toIndex] = temp;
        } else {
            long temp = array[fromIndex];
            System.arraycopy(array, fromIndex + 1, array, fromIndex, toIndex - fromIndex);
            array[toIndex] = temp;
        }
    }

    public static <T> void move(float[] array, int fromIndex, int toIndex) {
        if (isOutOfIndex(array, fromIndex)) {
            return;
        }

        if (isOutOfIndex(array, toIndex)) {
            return;
        }

        if (fromIndex == toIndex) {
            return;
        }

        if (fromIndex > toIndex) {
            float temp = array[fromIndex];
            System.arraycopy(array, toIndex, array, toIndex + 1, fromIndex - toIndex);
            array[toIndex] = temp;
        } else {
            float temp = array[fromIndex];
            System.arraycopy(array, fromIndex + 1, array, fromIndex, toIndex - fromIndex);
            array[toIndex] = temp;
        }
    }

    public static <T> void move(double[] array, int fromIndex, int toIndex) {
        if (isOutOfIndex(array, fromIndex)) {
            return;
        }

        if (isOutOfIndex(array, toIndex)) {
            return;
        }

        if (fromIndex == toIndex) {
            return;
        }

        if (fromIndex > toIndex) {
            double temp = array[fromIndex];
            System.arraycopy(array, toIndex, array, toIndex + 1, fromIndex - toIndex);
            array[toIndex] = temp;
        } else {
            double temp = array[fromIndex];
            System.arraycopy(array, fromIndex + 1, array, fromIndex, toIndex - fromIndex);
            array[toIndex] = temp;
        }
    }

    public static <T> void distinct(Iterable<T> iterable) {
        distinct(iterable, false);
    }

    public static <T> void distinct(Iterable<T> collection, boolean keepNull) {
        if (isEmpty(collection)) {
            return;
        }
        HashSet<T> set = new HashSet<>();

        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            T t = iterator.next();
            if (t == null && !keepNull) {
                iterator.remove();
            }
            if (set.contains(t)) {
                iterator.remove();
                continue;
            }
            set.add(t);
        }
    }

    public static <T, K> void distinct(Collection<T> collection, Mapper<T, K> mapper) {
        distinct(collection, false, mapper);
    }

    public static <T, K> void distinct(Collection<T> collection, boolean keepNull, Mapper<T, K> mapper) {
        if (isEmpty(collection)) {
            return;
        }
        HashSet<K> set = new HashSet<>();

        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            T t = iterator.next();
            K k = mapper.map(t);
            if (k == null && !keepNull) {
                iterator.remove();
            }
            if (set.contains(k)) {
                iterator.remove();
                continue;
            }
            set.add(k);
        }
    }


    public static <T> ArrayList<T> createDistinctList(Collection<T> collection) {
        return createDistinctList(collection, false);
    }

    public static <T> ArrayList<T> createDistinctList(Collection<T> collection, boolean keepNull) {
        ArrayList<T> list = new ArrayList<>();
        if (isEmpty(collection)) {
            return list;
        }

        HashSet<T> set = new HashSet<>();

        for (T t : collection) {
            if (t == null && !keepNull) {
                continue;
            }
            if (set.contains(t)) {
                continue;
            }
            set.add(t);
            list.add(t);
        }

        return list;
    }

    public static <T, K> ArrayList<T> createDistinctList(Collection<T> collection, Mapper<T, K> mapper) {
        return createDistinctList(collection, false, mapper);
    }

    public static <T, K> ArrayList<T> createDistinctList(Collection<T> collection, boolean keepNull, Mapper<T, K> mapper) {
        ArrayList<T> list = new ArrayList<>();
        if (isEmpty(collection)) {
            return list;
        }

        HashSet<K> set = new HashSet<>();

        for (T t : collection) {
            K key = mapper.map(t);
            if (key == null && !keepNull) {
                continue;
            }

            if (set.contains(key)) {
                continue;
            }

            set.add(key);
            list.add(t);
        }
        set.clear();
        return list;
    }

    public static <T> ArrayList<T> merge(Collection<T>... collections) {
        return merge(false, collections);
    }

    public static <T> ArrayList<T> merge(boolean keepNull, Collection<T>... collections) {
        ArrayList<T> list = new ArrayList<>();
        if (isEmpty(collections)) {
            return list;
        }
        HashSet<T> set = new HashSet<>();

        for (Collection<T> c : collections) {
            if (c == null) {
                continue;
            }
            for (T t : c) {
                if (t == null && !keepNull) {
                    continue;
                }
                if (set.contains(t)) {
                    continue;
                }
                list.add(t);
                set.add(t);
            }
        }
        return list;
    }

    public static <T, K> ArrayList<T> merge(Mapper<T, K> mapper, Collection<T>... collections) {
        return merge(mapper, false, collections);
    }

    public static <T, K> ArrayList<T> merge(Mapper<T, K> mapper, boolean keepNull, Collection<T>... collections) {
        return merge(collections, keepNull, mapper);
    }

    public static <T, K> ArrayList<T> merge(Collection<T>[] collections, Mapper<T, K> mapper) {
        return merge(collections, false, mapper);
    }

    public static <T, K> ArrayList<T> merge(Collection<T>[] collections, boolean keepNull, Mapper<T, K> mapper) {
        ArrayList<T> list = new ArrayList<>();
        if (isEmpty(collections)) {
            return list;
        }
        HashSet<K> set = new HashSet<>();

        for (Collection<T> c : collections) {
            if (c == null) {
                continue;
            }
            for (T t : c) {
                K k = mapper.map(t);
                if (k == null && !keepNull) {
                    continue;
                }
                if (set.contains(k)) {
                    continue;
                }
                list.add(t);
                set.add(k);
            }
        }
        return list;
    }

    public static <T> ArrayList<T> intersection(Collection<T> collection, Collection<T> target) {
        ArrayList<T> list = new ArrayList<>();
        if (isEmpty(collection)) {
            return list;
        }
        if (isEmpty(target)) {
            return list;
        }

        HashSet<T> set;
        if (target instanceof HashSet) {
            set = (HashSet<T>) target;
        } else {
            set = new HashSet<>(target);
        }

        for (T t : collection) {
            if (set.contains(t)) {
                list.add(t);
            }
        }

        return list;
    }

    /**
     * 交集
     */
    public static <T, K> ArrayList<T> intersection(Collection<T> collection, Collection<K> target, Mapper<T, K> mapper) {
        ArrayList<T> list = new ArrayList<>();
        if (isEmpty(collection)) {
            return list;
        }
        if (isEmpty(target)) {
            return list;
        }

        HashSet<K> set;
        if (target instanceof HashSet) {
            set = (HashSet<K>) target;
        } else {
            set = new HashSet<>(target);
        }

        for (T t : collection) {
            K k = mapper.map(t);
            if (set.contains(k)) {
                list.add(t);
            }
        }

        return list;
    }

    /**
     * 差集
     */
    public static <T> ArrayList<T> difference(Collection<T> collection, Collection<T> target) {
        ArrayList<T> list = new ArrayList<>();
        if (isEmpty(collection)) {
            return list;
        }
        if (isEmpty(target)) {
            list.addAll(collection);
            return list;
        }

        HashSet<T> set;
        if (target instanceof HashSet) {
            set = (HashSet<T>) target;
        } else {
            set = new HashSet<>(target);
        }

        for (T t : collection) {
            if (!set.contains(t)) {
                list.add(t);
            }
        }

        return list;
    }

    public static <T, K> ArrayList<T> subCollectionExclude(Collection<T> collection, Collection<K> target, Mapper<T, K> mapper) {
        ArrayList<T> list = new ArrayList<>();
        if (isEmpty(collection)) {
            return list;
        }
        if (isEmpty(target)) {
            list.addAll(collection);
            return list;
        }

        HashSet<K> set;
        if (target instanceof HashSet) {
            set = (HashSet<K>) target;
        } else {
            set = new HashSet<>(target);
        }

        for (T t : collection) {
            K k = mapper.map(t);
            if (!set.contains(k)) {
                list.add(t);
            }
        }

        return list;
    }

    public static <T> void traversal(Collection<T> collection, IndexProcessor<T> indexProcessor) {
        if (isEmpty(collection)) {
            return;
        }

        int index = -1;
        for (T t : collection) {
            index++;
            indexProcessor.process(index, t);
        }
    }

    public static <T> void traversal(List<T> list, IndexProcessor<T> indexProcessor) {
        if (isEmpty(list)) {
            return;
        }
        int index = -1;
        for (T t : list) {
            index++;
            indexProcessor.process(index, t);
        }
    }

    public static <T> void traversal(T root, NodeHandler<T> nodeHandler, Processor<T> processor) {
        if (root == null) {
            return;
        }

        processor.process(root);
        if (!nodeHandler.isNodeParent(root)) {
            return;
        }

        for (int i = 0, size = nodeHandler.getChildCount(root); i < size; i++) {
            T t = nodeHandler.getChildAt(root, i);
            traversal(t, nodeHandler, processor);
        }
    }

    public static <T> T find(T root, NodeHandler<T> nodeHandler, Tester<T> tester) {
        if (root == null) {
            return null;
        }

        if (tester.test(root)) {
            return root;
        }

        if (!nodeHandler.isNodeParent(root)) {
            return null;
        }

        for (int i = 0, size = nodeHandler.getChildCount(root); i < size; i++) {
            T t = nodeHandler.getChildAt(root, i);
            T result = find(t, nodeHandler, tester);
            if (result != null) {
                return result;
            }
        }

        return null;
    }

    public static <T, K> HashSet<K> extractSet(Collection<T> collection, Mapper<T, K> mapper) {
        return extractSet(collection, false, mapper);
    }

    public static <T, K> HashSet<K> extractSet(Collection<T> collection, boolean keepNull, Mapper<T, K> mapper) {
        HashSet<K> set = new HashSet<>();

        if (isEmpty(collection)) {
            return set;
        }

        for (T t : collection) {
            K key = mapper.map(t);
            if (key == null && !keepNull) {
                continue;
            }

            set.add(key);
        }

        return set;
    }

    public static <T, K> ArrayList<K> extractList(Collection<T> collection, Mapper<T, K> mapper) {
        return extractList(collection, false, mapper);
    }

    public static <T, K> ArrayList<K> extractList(Collection<T> collection, boolean keepNull, Mapper<T, K> mapper) {
        ArrayList<K> list = new ArrayList<>();

        if (isEmpty(collection)) {
            return list;
        }

        for (T t : collection) {
            K key = mapper.map(t);
            if (key == null && !keepNull) {
                continue;
            }

            list.add(key);
        }

        return list;
    }

    public static <T> int[] getSizeRange(T[][] arrays) {
        boolean initialized = false;
        int min = 0;
        int max = 0;


        for (T[] array : arrays) {
            int length = getSize(array);
            if (initialized) {
                min = Math.min(length, min);
                max = Math.max(length, max);
            } else {
                min = length;
                max = length;
                initialized = true;
            }
        }

        if (!initialized) {
            throw new IllegalStateException("no array found");
        }

        return new int[]{min, max};
    }

    public static <T> int getMinSize(T[][] arrays) {
        return getSizeRange(arrays)[0];
    }

    public static <T> int getMaxSize(T[][] arrays) {
        return getSizeRange(arrays)[1];
    }

    public static <T> T findCommonElement(T[][] arrays) {
        return findCommonElement(arrays, 0);
    }

    public static <T> T findCommonElement(T[][] arrays, int startIndex) {
        if (isEmpty(arrays)) {
            return null;
        }

        int minSize = getMinSize(arrays);
        if (minSize == 0) {
            return null;
        }

        T common = null;

        for (int index = startIndex; index < minSize; index++) {
            T tmp = null;
            boolean initialized = false;
            boolean sameElements = false;

            for (T[] array : arrays) {
                T t = array[index];
                if (t == null) {
                    return common;
                }

                if (!initialized) {
                    tmp = t;
                    initialized = true;
                    continue;
                }

                if (!tmp.equals(t)) {
                    return common;
                }
            }

            common = tmp;
        }

        return common;
    }

    public static <T> T findLastCommonElement(T[][] arrays) {
        return findLastCommonElement(arrays, 0);
    }

    public static <T> T findLastCommonElement(T[][] arrays, int startIndex) {
        if (isEmpty(arrays)) {
            return null;
        }

        int minSize = getMinSize(arrays);
        if (minSize == 0) {
            return null;
        }

        T common = null;

        for (int index = startIndex; index < minSize; index++) {
            T tmp = null;
            boolean initialized = false;

            for (T[] array : arrays) {
                T t = array[index];
                if (t == null) {
                    return common;
                }

                if (!initialized) {
                    tmp = t;
                    initialized = true;
                    continue;
                }

                if (!tmp.equals(t)) {
                    return common;
                }
            }

            common = tmp;
        }

        return common;
    }

    public static <T> ArrayList<T> clone(Iterable<T> src, CloneFactory<T> factory) {
        ArrayList<T> cloneList = new ArrayList<>();

        if (src == null) {
            return cloneList;
        }

        for (T t : src) {
            T clone = factory.clone(t);
            cloneList.add(clone);
        }

        return cloneList;
    }

    public static int compare(boolean x, boolean y) {
        return Boolean.compare(x, y);
    }

    public static int compare(byte x, byte y) {
        return Byte.compare(x, y);
    }

    public static int compare(char x, char y) {
        return Character.compare(x, y);
    }

    public static int compare(int x, int y) {
        return Integer.compare(x, y);
    }

    public static int compare(long x, long y) {
        return Long.compare(x, y);
    }

    public static int compare(float x, float y) {
        return Float.compare(x, y);
    }

    public static int compare(double x, double y) {
        return Double.compare(x, y);
    }

    public static <K, V> ArrayList<Map.Entry<K, V>> getEntryList(Map<K, V> map) {
        ArrayList<Map.Entry<K, V>> entryList = new ArrayList<>();
        if (isEmpty(map)) {
            return entryList;
        }

        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        if (!isEmpty(entrySet)) {
            entryList.addAll(entrySet);
        }
        return entryList;
    }

    public static <T, E> ArrayList<E> convert(Iterable<T> srcList, IndexMapper<T, E> indexMapper) {
        ArrayList<E> dstList = new ArrayList<>();
        if (srcList == null) {
            return dstList;
        }
        int i = 0;
        for (T t : srcList) {
            dstList.add(indexMapper.map(t, i));
            i++;
        }

        return dstList;
    }

    public static <T, E> void convert(T[] srcArray, E[] dstArray, IndexMapper<T, E> indexMapper) {
        if (isEmpty(srcArray) || isEmpty(dstArray)) {
            return;
        }

        for (int i = 0, size = Math.min(srcArray.length, dstArray.length); i < size; i++) {
            T t = srcArray[i];
            dstArray[i] = indexMapper.map(t, i);
        }
    }

    public static <T> boolean[] convert(T[] array, GenericBooleanMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        boolean[] result = new boolean[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static <T> byte[] convert(T[] array, GenericByteMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static <T> char[] convert(T[] array, GenericCharMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static <T> short[] convert(T[] array, GenericShortMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        short[] result = new short[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static <T> int[] convert(T[] array, GenericIntMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static <T> long[] convert(T[] array, GenericLongMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        long[] result = new long[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static <T> float[] convert(T[] array, GenericFloatMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        float[] result = new float[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static <T> double[] convert(T[] array, GenericDoubleMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static <T> T[] convert(boolean[] array, BooleanGenericMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        T[] result = new T[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static boolean[] convert(boolean[] array, BooleanBooleanMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        boolean[] result = new boolean[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static byte[] convert(boolean[] array, BooleanByteMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static char[] convert(boolean[] array, BooleanCharMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static short[] convert(boolean[] array, BooleanShortMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        short[] result = new short[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static int[] convert(boolean[] array, BooleanIntMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static long[] convert(boolean[] array, BooleanLongMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        long[] result = new long[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static float[] convert(boolean[] array, BooleanFloatMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        float[] result = new float[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static double[] convert(boolean[] array, BooleanDoubleMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static <T> T[] convert(byte[] array, ByteGenericMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        T[] result = new T[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static boolean[] convert(byte[] array, ByteBooleanMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        boolean[] result = new boolean[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static byte[] convert(byte[] array, ByteByteMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static char[] convert(byte[] array, ByteCharMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static short[] convert(byte[] array, ByteShortMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        short[] result = new short[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static int[] convert(byte[] array, ByteIntMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static long[] convert(byte[] array, ByteLongMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        long[] result = new long[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static float[] convert(byte[] array, ByteFloatMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        float[] result = new float[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static double[] convert(byte[] array, ByteDoubleMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static <T> T[] convert(char[] array, CharGenericMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        T[] result = new T[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static boolean[] convert(char[] array, CharBooleanMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        boolean[] result = new boolean[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static byte[] convert(char[] array, CharByteMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static char[] convert(char[] array, CharCharMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static short[] convert(char[] array, CharShortMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        short[] result = new short[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static int[] convert(char[] array, CharIntMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static long[] convert(char[] array, CharLongMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        long[] result = new long[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static float[] convert(char[] array, CharFloatMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        float[] result = new float[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static double[] convert(char[] array, CharDoubleMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static <T> T[] convert(short[] array, ShortGenericMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        T[] result = new T[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static boolean[] convert(short[] array, ShortBooleanMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        boolean[] result = new boolean[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static byte[] convert(short[] array, ShortByteMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static char[] convert(short[] array, ShortCharMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static short[] convert(short[] array, ShortShortMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        short[] result = new short[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static int[] convert(short[] array, ShortIntMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static long[] convert(short[] array, ShortLongMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        long[] result = new long[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static float[] convert(short[] array, ShortFloatMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        float[] result = new float[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static double[] convert(short[] array, ShortDoubleMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static Integer[] convert(int[] array, IntGenericMapper<Integer> mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        Integer[] result = new Integer[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static boolean[] convert(int[] array, IntBooleanMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        boolean[] result = new boolean[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static byte[] convert(int[] array, IntByteMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static char[] convert(int[] array, IntCharMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static short[] convert(int[] array, IntShortMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        short[] result = new short[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static int[] convert(int[] array, IntIntMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static long[] convert(int[] array, IntLongMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        long[] result = new long[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static float[] convert(int[] array, IntFloatMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        float[] result = new float[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static double[] convert(int[] array, IntDoubleMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static <T> T[] convert(long[] array, LongGenericMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        T[] result = new T[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static boolean[] convert(long[] array, LongBooleanMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        boolean[] result = new boolean[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static byte[] convert(long[] array, LongByteMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static char[] convert(long[] array, LongCharMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static short[] convert(long[] array, LongShortMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        short[] result = new short[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static int[] convert(long[] array, LongIntMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static long[] convert(long[] array, LongLongMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        long[] result = new long[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static float[] convert(long[] array, LongFloatMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        float[] result = new float[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static double[] convert(long[] array, LongDoubleMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static <T> T[] convert(float[] array, FloatGenericMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        T[] result = new T[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static boolean[] convert(float[] array, FloatBooleanMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        boolean[] result = new boolean[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static byte[] convert(float[] array, FloatByteMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static char[] convert(float[] array, FloatCharMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static short[] convert(float[] array, FloatShortMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        short[] result = new short[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static int[] convert(float[] array, FloatIntMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static long[] convert(float[] array, FloatLongMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        long[] result = new long[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static float[] convert(float[] array, FloatFloatMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        float[] result = new float[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static double[] convert(float[] array, FloatDoubleMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static <T> T[] convert(double[] array, DoubleGenericMapper<T> mapper) {
        if (isEmpty(array)) {
            return null;
        }


        int length = array.length;
        T[] result = new T[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static boolean[] convert(double[] array, DoubleBooleanMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        boolean[] result = new boolean[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static byte[] convert(double[] array, DoubleByteMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static char[] convert(double[] array, DoubleCharMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static short[] convert(double[] array, DoubleShortMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        short[] result = new short[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static int[] convert(double[] array, DoubleIntMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static long[] convert(double[] array, DoubleLongMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        long[] result = new long[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static float[] convert(double[] array, DoubleFloatMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        float[] result = new float[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static double[] convert(double[] array, DoubleDoubleMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static <T> T[] concat(T[]... arrays) {
        int[] indexes = indexOf(arrays, new Tester<T>() {
            @Override
            public boolean test(T t) {
                return t != null;
            }
        });

        if (indexes == null) {
            return null;
        }
        Class<T> cls = (Class<T>) arrays[indexes[0]][indexes[1]].getClass();
        return concat(cls, arrays);
    }

    public static <T> T[] concat(Class<T> cls, T[]... arrays) {
        int size = getSize(arrays);
        if (size == 0) {
            return (T[]) Array.newInstance(cls, 0);
        }


        int length = 0;

        for (T[] array : arrays) {
            length += getSize(array);
        }

        T[] result = (T[]) Array.newInstance(cls, length);
        int index = 0;

        for (T[] array : arrays) {
            if (isEmpty(array)) {
                continue;
            }
            System.arraycopy(array, 0, result, index, array.length);
            index += array.length;
        }

        return result;
    }

    public static <T> boolean contains(T[] container, T[] elements) {
        if (isEmpty(elements)) {
            return true;
        }
        if (isEmpty(container)) {
            return false;
        }
        for (int i = 0, elementSize = getSize(elements); i < elementSize; i++) {
            T element = elements[i];
            if (!contains(container, element)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean contains(T[] container, T element) {
        if (isEmpty(container)) {
            return false;
        }
        for (int i = 0, size = getSize(container); i < size; i++) {
            T t = container[i];
            if (t == null) {
                if (element == null) {
                    return true;
                } else {
                    continue;
                }
            }
            if (t.equals(element)) {
                return true;
            }
        }

        return false;
    }

    public static <T> ArrayList<T> listOf(T... array) {
        if (isEmpty(array)) {
            return new ArrayList<>();
        }

        return new ArrayList<>(Arrays.asList(array));
    }

    public static <T> T[] arrayOf(T... array) {
        return array;
    }

    public static <T> ArrayList<T> toList(T[] array) {
        return array == null ? null : new ArrayList<>(Arrays.asList(array));
    }


    public static <T> T[] toArray(Iterable<T> iterable) {
        T t = find(iterable, new Tester<T>() {
            @Override
            public boolean test(T t) {
                return t != null;
            }
        });
        if (t == null) {
            return null;
        }
        return toArray(iterable, (Class<T>) t.getClass());
    }

    public static <T> T[] toArray(Iterable<T> iterable, Class<T> cls) {
        int size = getSize(iterable);
        T[] array = (T[]) Array.newInstance(cls, size);
        if (size == 0) {
            return array;
        }

        if (iterable instanceof List) {
            return ((List<T>) iterable).toArray(array);
        }

        int index = -1;
        for (T t : iterable) {
            index++;
            array[index] = t;
        }

        return array;
    }

    public static <T> List toMultiDimension(Iterable<T> list, int... sizes) {
        List<T> result = new ArrayList<>();
        if (isEmpty(list)) {
            return result;
        }
        int[] capacities = new int[sizes.length + 1];
        capacities[sizes.length] = 1;
        for (int i = sizes.length - 1; i >= 0; i--) {
            capacities[i] = capacities[i + 1] * sizes[i];
        }

        int[] indexArray = new int[sizes.length + 1];
        int index;
        Iterator<T> iterator = list.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            T t = iterator.next();
            index = i;

            for (int j = 0; j < indexArray.length; j++) {
                indexArray[j] = index / capacities[j];
                index = index % capacities[j];
            }

            List parent = result;
            for (int j = 0; j < indexArray.length - 1; j++) {
                index = indexArray[j];
                Object child = safetyGet(parent, index);
                if (child == null) {
                    child = new ArrayList();
                    parent.add(child);
                }
                parent = (List) child;
            }
            parent.add(t);
            i++;
        }

        return result;
    }

    public static <T> List<T> fromMultiDimension(Iterable iterable, int dimension) {
        List<T> result = new ArrayList<>();
        if (isEmpty(iterable)) {
            return result;
        }

        Iterable i = iterable;
        for (int d = 0; d < dimension - 1; d++) {
            ArrayList<Iterable> iterableList = new ArrayList<>();
            for (Object o1 : i) {
                Iterable iterable1 = (Iterable) o1;
                if (d < dimension - 2) {
                    for (Object o2 : iterable1) {
                        iterableList.add((Iterable) o2);
                    }
                } else {
                    for (Object o : iterable1) {
                        result.add((T) o);
                    }
                }
            }
            i = iterableList;
        }

        return result;
    }

    public static ArrayList<Boolean> toList(boolean[] array) {
        if (isEmpty(array)) {
            return null;
        }

        ArrayList<Boolean> result = new ArrayList<>();
        for (boolean value : array) {
            result.add(value);
        }
        return result;
    }

    public static ArrayList<Byte> toList(byte[] array) {
        if (isEmpty(array)) {
            return null;
        }

        ArrayList<Byte> result = new ArrayList<>();
        for (byte value : array) {
            result.add(value);
        }
        return result;
    }

    public static ArrayList<Character> toList(char[] array) {
        if (isEmpty(array)) {
            return null;
        }

        ArrayList<Character> result = new ArrayList<>();
        for (char value : array) {
            result.add(value);
        }
        return result;
    }

    public static ArrayList<Short> toList(short[] array) {
        if (isEmpty(array)) {
            return null;
        }

        ArrayList<Short> result = new ArrayList<>();
        for (short value : array) {
            result.add(value);
        }
        return result;
    }

    public static ArrayList<Integer> toList(int[] array) {
        if (isEmpty(array)) {
            return null;
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int value : array) {
            result.add(value);
        }
        return result;
    }

    public static ArrayList<Long> toList(long[] array) {
        if (isEmpty(array)) {
            return null;
        }

        ArrayList<Long> result = new ArrayList<>();
        for (long value : array) {
            result.add(value);
        }
        return result;
    }

    public static ArrayList<Float> toList(float[] array) {
        if (isEmpty(array)) {
            return null;
        }

        ArrayList<Float> result = new ArrayList<>();
        for (float value : array) {
            result.add(value);
        }
        return result;
    }

    public static ArrayList<Double> toList(double[] array) {
        if (isEmpty(array)) {
            return null;
        }

        ArrayList<Double> result = new ArrayList<>();
        for (double value : array) {
            result.add(value);
        }
        return result;
    }

    public static <T> T[] toArray(boolean[] iterable) {
        T t = find(iterable, new Tester<T>() {
            @Override
            public boolean test(T t) {
                return t != null;
            }
        });
        if (t == null) {
            return null;
        }
        return toArray(iterable, (Class<T>) t.getClass());
    }
}