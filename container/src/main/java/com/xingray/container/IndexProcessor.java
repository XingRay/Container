package com.xingray.container;

/**
 * @author : leixing
 * date : 2018/6/22 17:39
 * <p>
 * description : IndexProcessor
 */
public interface IndexProcessor<T> {
    void process(int index, T t);
}