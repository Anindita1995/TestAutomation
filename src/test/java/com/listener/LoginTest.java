package com.listener;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    @BeforeTest
    void setUp(){
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
    }
    @Test
    void loginvalidcred(){
        driver.findElement(By.id("input-email")).sendKeys("roypeu0207@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("123456");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
    }
    @Test
    void loginInvalidcred(){
        driver.findElement(By.id("input-email")).sendKeys("abcd67@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("12345690987");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        Assert.fail();
    }
}
