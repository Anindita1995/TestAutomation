package com.extentsreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;
//What is Extent Report? Extent Report is a logger (kind of object which logs certain messages)
// style reporting library for automated testes.
//What does it do? It adds information about test cases. screenshots, assigning tags.
// series of steps and sequencing those step.
// All methods inside Extent Reports are thread safe - Recommend to create a single instance of Extent Report.

public class ExReport_Demo {
    @Test
        public void Login(){
        //Step-1: Create the object of ExtentReports Class
        ExtentReports extent = new ExtentReports();//ExtentReports is in internal class responsible for generation
        // of extent reports.ExtentReports acts as a Subject.
        //Step-2: Create the object of ExtentSparkReporter Class(act as a Observer) and it is attached to ExtentReports(Subject) class
        ExtentSparkReporter spark = new ExtentSparkReporter("target/spark.html");//Here we need to specify the path.
        //Now we need to use "spark" reference
        spark.config().setReportName("My First Extent Report");
        spark.config().setDocumentTitle("TN_LogIn_JIRAstory_QA/UAT/Product Extent Reports");
        spark.config().setTheme(Theme.DARK);
        spark.config().setEncoding("utf-8");
        //Step-3: Need to attach the report
        extent.attachReporter(spark);
        ExtentTest test = extent.createTest("Longin Functionality test");//return object of class ExtentTest
        test.log(Status.INFO,"Start Login test Case");
        test.log(Status.INFO,"Opening Browser");
        //If any test cases fail to run then html report will not generate.
        //Assert.fail("Server not found");
        test.log(Status.FAIL,"Server not found");
        test.log(Status.INFO,"Validate Signin Link");
        test.log(Status.INFO,"Enter user Credential");
        test.log(Status.PASS,"Login Pass");

        //Step-4: Need to call the method flush(). It instructs ExtentReports to write the test info at a certain destination
        extent.flush();




    }



}
