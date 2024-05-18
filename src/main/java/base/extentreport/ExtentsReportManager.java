package base.extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentsReportManager {
    public static ExtentReports extent;
    public static ExtentSparkReporter spark;
    public static ExtentTest test;
    public static ExtentReports getReports(){
        if(extent == null){
            extent = new ExtentReports();//ExtentReports is in internal class responsible for generation
            // of extent reports.ExtentReports acts as a Subject.
            //Step-2: Create the object of ExtentSparkReporter Class(act as a Observer) and it is attached to ExtentReports(Subject) class
            spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/target/ExtReportHTMLfile");//Here we need to specify the path.
            //Now we need to use "spark" reference
            spark.config().setReportName("My First Extent Report");
            spark.config().setDocumentTitle("TN_LogIn_JIRAstory_QA/UAT/Product Extent Reports");
            spark.config().setTheme(Theme.DARK);
            spark.config().setEncoding("utf-8");
            //Step-3: Need to attach the report
            extent.attachReporter(spark);
        }
        return extent ;
    }
}
