package com.test.testngexdome;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMethendDome {
    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }
}
