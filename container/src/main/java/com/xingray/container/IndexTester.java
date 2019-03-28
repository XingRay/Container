package com.xingray.container;

/**
 * @author : leixing
 * date : 2018/6/22 19:05
 * <p>
 * description : matcher
 */
public interface IndexTester<T> {
    boolean test(T t, int index);
}
