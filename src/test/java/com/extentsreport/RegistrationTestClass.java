package com.extentsreport;

import base.extentreport.ExtentsReportManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegistrationTestClass {

    public static ExtentReports extent;
    public static ExtentSparkReporter spark;
    public static ExtentTest test;
    @BeforeTest
    public void initializeRegistration(){
        extent = ExtentsReportManager.getReports();
        test = extent.createTest("TutorialsNinja Registration Functionality test");//return object of class ExtentTest
    }
    @Test
    public void TN_Registration(){
        test.log(Status.INFO,"Start Registration test Case");
        test.log(Status.INFO,"Visibility of all fields");
        test.log(Status.INFO,"Validate all user details");
        test.log(Status.INFO,"Validate Submit button");
        test.log(Status.PASS,"Registration Pass");
    }
    @AfterTest
    public void finish(){
        extent.flush();

    }
}
