package com.liquor.test;

import org.junit.*;

public class TimeoutTest {
    @BeforeClass
    public static void test1(){
        System.out.println("Before Class");
    }

    @AfterClass
    public static void test2(){
        System.out.println("After Class");
    }

    @Before
    public void test3(){
        System.out.println("Before");
    }

    @After
    public void test4(){
        System.out.println("After");
    }

    @Test(timeout = 1)
    public void test5(){
        for(int i = 0 ; i < 10000; i ++){
            System.out.println(i);
        }
    }
}
