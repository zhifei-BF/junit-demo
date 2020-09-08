package com.liquor.test;

import org.junit.*;

public class IgnoreTest {
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

    @Ignore
    @Test
    public void test5(){
        System.out.println("Ignore");
    }

    @Test
    public void test6(){
        System.out.println("test6");
    }

    @Ignore
    @Test
    public void test7(){
        System.out.println("test7");
    }
}
