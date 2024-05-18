package com.basiclearningTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestNG {
    @Test
    void startCar(){
        System.out.println("Car Started");
        Assert.fail();
    }
    @Test(dependsOnMethods = {"startCar"})
    void drivecar(){
        System.out.println("Car is moving");
    }
    @Test(dependsOnMethods = {"drivecar"},alwaysRun = true)
    void stopCar(){
        System.out.println("Car Stopped");
    }
}
