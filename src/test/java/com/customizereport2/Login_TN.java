package com.customizereport2;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(JyperionListener.class)
//I did not find this Listener class in my project. so I need to find other way to generate PDF report.
public class Login_TN {
    @Test(priority = 0,description = "testreportONE")
    public void testreportONE(){
        Assert.assertTrue(true,"test reportONE passed");
    }
    @Test(priority = 1,description = "testreportTWO")
    public void testreportTWO(){
        Assert.fail("test reportTWO failed");
    }
}
