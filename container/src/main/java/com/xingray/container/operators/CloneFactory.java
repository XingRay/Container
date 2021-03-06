package com.xingray.container.operators;

/**
 * @author : leixing
 * date : 2018/6/22 17:39
 * <p>
 * description : CloneFactory
 */
public interface CloneFactory<T> {
    T clone(T t);
}