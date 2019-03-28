package com.xingray.container.operators;

/**
 * @author : leixing
 * date : 2018/6/22 17:39
 * <p>
 * description : Mapper
 */
public interface Mapper<T, K> {
    K map(T t);
}