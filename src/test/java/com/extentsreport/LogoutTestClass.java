package com.extentsreport;

import base.extentreport.ExtentsReportManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogoutTestClass {
    public static ExtentReports extent;
    public static ExtentSparkReporter spark;
    public static ExtentTest test;
    @BeforeTest
    public void initializeLogout(){
        extent = ExtentsReportManager.getReports();
        test = extent.createTest("TutorialsNinja LogOut Functionality test");//return object of class ExtentTest
    }
    @Test
    public void TN_Logout(){
        test.log(Status.INFO,"Start LogOut test Case");
        test.log(Status.INFO,"Visibility of all fields");
        test.log(Status.INFO,"Failed To Logout");
        test.log(Status.FAIL,"LogOut Test Failed");
    }
    @AfterTest
    public void finish(){
        extent.flush();

    }

}
