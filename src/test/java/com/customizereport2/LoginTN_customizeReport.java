package com.customizereport2;

import org.testng.*;
import org.testng.xml.XmlSuite;

import java.util.*;

public class LoginTN_customizeReport implements IReporter {
    @Override

    public void generateReport(List<XmlSuite> arg0, List<ISuite> arg1,String outputDirectory) {
        // Second parameter of this method ISuite will contain all the suite executed.

        for (ISuite iSuite : arg1) {
            //Get a map of result of a single suite at a time
            Map<String,ISuiteResult> results =    iSuite.getResults();

            //Get the key of the result map
            Set<String> keys = results.keySet();

            //Go to each map value one by one
            for (String key : keys) {
                //The Context object of current result
                ITestContext context = results.get(key).getTestContext();
                //Print Suite detail in Console
                System.out.println("Suite Name->"+context.getName()

                        + "::Report output Ditectory->"+context.getOutputDirectory()

                        +"::Suite Name->"+ context.getSuite().getName()

                        +"::Start Date Time for execution->"+context.getStartDate()

                        +"::End Date Time for execution->"+context.getEndDate());



                //Get Map for only failed test cases
                IResultMap resultMap = context.getFailedTests();

                //Get method detail of failed test cases
                Collection<ITestNGMethod> failedMethods = resultMap.getAllMethods();

                //Loop one by one in all failed methods
                System.out.println("--------FAILED Login_TN TEST CASE---------");

                for (ITestNGMethod iTestNGMethod : failedMethods) {

                    //Print failed test cases detail
                    System.out.println("TESTCASE NAME->"+iTestNGMethod.getMethodName()

                            +"\nDescription->"+iTestNGMethod.getDescription()

                            +"\nPriority->"+iTestNGMethod.getPriority()

                            +"\n:Date->"+new Date(iTestNGMethod.getDate()));



                }

            }

        }



    }
}
