package com.customizereport1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(LoginTN_CustomizeReport.class)
public class LoginTN {

    WebDriver driver;
    @BeforeTest
    void setUp(){

        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
    }
    @Test
    void loginVALIDcred(){
        driver.findElement(By.id("input-email")).sendKeys("roypeu0207@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("123456");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

        Assert.assertTrue(true);

    }
    @Test
    void loginINVALIDcred(){
        driver.findElement(By.id("input-email")).sendKeys("abcd67@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("12345690987");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

        Assert.fail("Login Failed");


    }
    @AfterTest
    public void finish(){

        driver.quit();

    }
}
