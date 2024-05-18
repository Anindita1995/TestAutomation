package com.extentsreport;

import base.extentreport.ExtentsReportManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestClass {
    public static ExtentReports extent;
    public static ExtentSparkReporter spark;
   public static ExtentTest test;
    @BeforeTest
    public void initializeLogin(){
        extent = ExtentsReportManager.getReports();
        test = extent.createTest("TutorialsNinja Longin Functionality test");//return object of class ExtentTest
    }
    @Test
    public void TN_Login(){
        test.log(Status.INFO,"Start Login test Case");
        test.log(Status.INFO,"Opening Browser");
        test.log(Status.INFO,"Validate Signin Link");
        test.log(Status.INFO,"Enter user Credential");
        test.log(Status.PASS,"Login Pass");
    }
    @AfterTest
    public void finish(){
        extent.flush();

    }
}
