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
}