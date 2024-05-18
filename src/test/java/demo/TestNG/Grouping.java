package demo.TestNG;

import org.testng.annotations.Test;

public class Grouping {
    @Test(priority = 5)
    void testA(){
        System.out.println("I am Sanity Test");
    }
    @Test(priority = 5)
    void testD(){
        System.out.println("I am Sanity Test");
    }
    @Test(priority = 5)
    void testC(){
        System.out.println("I am Sanity Test");
    }

    @Test
    void testE(){
    System.out.println("I am Regression Test");
    }
    @Test
    void testF(){
        System.out.println("I am Regression Test");
    }
    @Test(priority = 1,enabled = false)
    void testB(){
        System.out.println("I am Regression Test");
    }

    @Test
    void testG(){
    System.out.println(" I am Sanity and Regression Test");
    }
}
