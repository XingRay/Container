package com.xingray.container;


/**
 * @author : leixing
 * date : 2018/6/22 17:39
 * <p>
 * description : Processor
 */

public interface Processor<T> {
    void process(T t);
}
