package com.xingray.container;

import java.util.Collection;

/**
 * @author : leixing
 * date : 2017-02-20
 * Email       : leixing1012@qq.com
 * Version     : 0.0.1
 * <p>
 * Description : Container
 * todo
 */
public class Container<T> {
    private Container() {

    }

    public static <T> Container<T> of(T... array) {
        return new Container<>();
    }

    public static <T> Container<T> of(Collection<T> collection) {
        return new Container<>();
    }
}
