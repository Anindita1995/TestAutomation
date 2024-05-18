package com.pageObjectModel.style_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginMain {
    WebDriver driver;
    LoginPOM basecode;
    @BeforeTest
    public void setUP(){
        driver = new ChromeDriver();
        basecode = new LoginPOM(driver);
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().fullscreen();
    }
    @Test
    public void LoginTest(){
        basecode.valid_user_name("tushar456@gmail.com");
        basecode.valid_password("12345");
        basecode.button();
        //Validation
        SoftAssert soft = new SoftAssert();
        String actual_mesg = driver.findElement(By.xpath("//div[@id='content']//following::h2")).getText();
        String expected_mesg = "My Account";
        soft.assertEquals(actual_mesg,expected_mesg);
        soft.assertAll();
    }
    @AfterTest
    public void teardown(){
        //driver.close();
    }

}
