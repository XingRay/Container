package com.xingray.container;

/**
 * @author : leixing
 * date : 2018/6/22 17:39
 * <p>
 * description : Mapper
 */
public interface IndexMapper<T, E> {
    E map(T t, int index);
}
