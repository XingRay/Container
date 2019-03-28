package com.xingray.container;


/**
 * @author : leixing
 * date : 2019-3-16
 * <p>
 * description : NodeHandler
 */

public interface NodeHandler<T> {
    boolean isNodeParent(T t);

    int getChildCount(T t);

    T getChildAt(T t, int index);
}
