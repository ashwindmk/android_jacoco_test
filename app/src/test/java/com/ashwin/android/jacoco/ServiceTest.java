package com.ashwin.android.jacoco;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ServiceTest {
    private Service service;

    @Before
    public void setUp() {
        service = new Service();
    }

    @Test
    public void addTest() {
        int sum = service.add(3, 4);
        Assert.assertEquals(7, sum);
    }

    @Test
    public void calculateAddTest() {
        int sum = service.calculate("add", 5, 2);
        Assert.assertEquals(7, sum);
    }

    @After
    public void tearDown() {
        service = null;
    }
}
