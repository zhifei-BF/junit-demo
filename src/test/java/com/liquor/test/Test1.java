package com.liquor.test;

import org.junit.*;


public class Test1 {

    @BeforeClass
    public static void beforeClassTest(){
        System.out.println("@BeforeClass");
    }

    @Test
    public void test1(){
        System.out.println("hello test1()");
    }

    @Test
    public void test2(){
        System.out.println("hello test2()");
    }

    @Before
    public void test5(){
        System.out.println("@Before");
    }

    @After
    public void test7(){
        System.out.println("@After");
    }

    @AfterClass
    public static void test4(){
        System.out.println("@AfterClass");
    }
}
