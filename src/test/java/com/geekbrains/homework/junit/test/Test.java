package com.geekbrains.homework.junit.test;

import com.geekbrains.homework.junit.lesson6.MainApp;
import org.junit.Assert;

public class Test {

    @org.junit.Test
    public void getArrayTest() {
        Assert.assertArrayEquals(new int[]{1, 7}, MainApp.getArray(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}));
        Assert.assertArrayEquals(new int[]{1, 1, 1, 1, 1, 1, 1, 1}, MainApp.getArray(new int[]{4, 1, 1, 1, 1, 1, 1, 1, 1}));
        Assert.assertArrayEquals(new int[]{}, MainApp.getArray(new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4}));
    }

    @org.junit.Test(expected = RuntimeException.class)
    public void getArrayExceptionTest() {
        MainApp.getArray(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1});
    }

    @org.junit.Test
    public void checkOneAndFourTest() {
        Assert.assertEquals(true, MainApp.checkOneandFour(new int[]{1, 1, 1, 4, 4, 1, 4, 4}));
        Assert.assertEquals(false, MainApp.checkOneandFour(new int[]{1, 1, 1, 1, 1, 1}));
        Assert.assertEquals(false, MainApp.checkOneandFour(new int[]{4, 4, 4, 4}));
        Assert.assertEquals(false, MainApp.checkOneandFour(new int[]{1, 4, 4, 1, 1, 4, 3}));
    }
}
