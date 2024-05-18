package com.pageObjectModel.style_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//this is our main class where we are going to use our RegistrationPOM class.
//In this class we will mention the value of the findelements,which ever we are
// going to pass through the operational class (RegistrationPOM.java)
public class RegistrationMain {
    WebDriver driver;
    RegistrationPOM regPOM;
    SoftAssert soft;
    @BeforeTest
    public void setUP(){
        driver = new ChromeDriver();
        //Now we have to create an object of 'RegistrationPOM' class
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        regPOM = new RegistrationPOM(driver);//also we need to pass driver as a parameter
        driver.manage().window().maximize();
    }
    @Test
    public void reg_form(){
    regPOM.setFirstName("Tushar");
    regPOM.setLastName("Bhattacharjee");
    regPOM.setTelephone("909878990");
    regPOM.setEmail("tushar456@gmail.com");
    regPOM.setPassword("12345");
    regPOM.setConfirm_pass("12345");
    regPOM.setNewsSubscription();
    regPOM.setPrivacyPolicy();
    regPOM.setSubmitButton();
    //Validation
    SoftAssert soft = new SoftAssert();
    String expectedmsg = driver.findElement(By.xpath("//div[@id='content'][@class='col-sm-9']//following::h1")).getText();
    String actualmsg = "Your Account Has Been Created!";
    soft.assertEquals(actualmsg,expectedmsg);
    soft.assertAll("Registration Testcases Pass");

    }
    @AfterTest
    public void teardown(){
        driver.close();
    }

}
