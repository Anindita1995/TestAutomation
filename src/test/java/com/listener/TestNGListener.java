package com.listener;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestNGListener extends TestListenerAdapter{
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test started");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        System.out.println("Successfully Logged In");
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        System.out.println("Invalid email and password");
    }
}
