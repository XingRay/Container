package com.xingray.container;

import com.xingray.container.helper.ContainerCore;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ContainerCoreTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void filter() {
        List<String> strings = ContainerCore.toList(new String[]{"aaa", "bbbbb", "cc"});

        ContainerCore.filter(strings, s -> s.length() < 4);

        assert strings.size() == 2;
        assert strings.get(0).equals("aaa");
        assert strings.get(1).equals("cc");
    }

    @Test
    public void objectArrayTest() {
        Object[] objects = new Integer[]{1, 2, 3, 4, 5};
        Integer[] integers = (Integer[]) objects;
        Integer[] result = Container.of(integers)
                .filter(integer -> integer < 4)
                .traversal((index, integer) -> System.out.println(integer))
                .asArray();
        assert result[0] == 1;
        assert result[1] == 2;
        assert result[2] == 3;
    }
}