package com.basiclearningTestNG;

import org.testng.annotations.Test;

public class grouping {
    @Test(groups = {"Sanity Test"})
    void test1(){
        System.out.println("Test1: Sanity Test");
    }
    @Test(groups = {"Regression Test"})
    void test2(){
        System.out.println("Test2:Regression Test");
    }
    @Test(groups={"Sanity Test"})
    void test3(){
        System.out.println("Test3: Sanity Test");
    }
    @Test(groups={"Sanity Test"})
    void test4(){
        System.out.println("Test4: Sanity Test");
    }
    @Test(groups={"Sanity Test","Regression Test"})
    void test5(){
        System.out.println("Test5: Sanity & Regression");
    }
}
