package com.liquor.test;

import org.junit.*;

public class ExpectedTest {
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

    @Test(expected = ArithmeticException.class)
    public void test5(){
        System.out.println("算术异常！");
        int i = 12 / 0;
        System.out.println("除以0.");
    }
}

