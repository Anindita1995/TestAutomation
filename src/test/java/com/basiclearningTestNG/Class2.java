package com.basiclearningTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class2 {
    WebDriver driver;
    @Test
    void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://tutorialsninja.com/demo/");
    }
    @Test(dependsOnMethods = {"setUp"})
    void ClickLogIn(){
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Login")).click();
    }
    @Test(dependsOnMethods = {"ClickLogIn"})
    void teardown(){
        driver.close();
    }
}
