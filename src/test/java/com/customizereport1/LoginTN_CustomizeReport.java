package com.customizereport1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LoginTN_CustomizeReport implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
        System.out.println("Start of Execution(TEST)-> "+context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started "+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Pass : "+result.getName());
    }
    public void onTestFailure(ITestResult arg0) {

        System.out.println("Test Failed->"+arg0.getName());

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
       // ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }
}
