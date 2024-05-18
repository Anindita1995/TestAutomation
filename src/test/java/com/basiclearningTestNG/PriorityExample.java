package com.basiclearningTestNG;

import org.testng.annotations.Test;

public class PriorityExample {
    @Test(priority =0 )
    void testC(){
        System.out.println("I am 1, My Test name is testC");
    }
    @Test(priority =1 )
    void testA(){
        System.out.println("I am 2, My Test name is testA");
    }
    @Test(priority =2, enabled = false)
    void testD(){
        System.out.println("I am 3, My Test name is testD");
    }
    @Test(priority =3 )
    void testB(){
        System.out.println("I am 4, My Test name is testB");
    }
}
