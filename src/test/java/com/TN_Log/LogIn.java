package com.TN_Log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogIn {
    WebDriver driver;

    @BeforeTest
    void setup(){
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().fullscreen();
       WebElement myacc_dropdown = driver.findElement(By.linkText("My Account"));
       myacc_dropdown.click();
        WebElement login_btn= driver.findElement(By.linkText("Login"));
        login_btn.click();
    }
    @Test(priority = 0)
    void validcredential(){

        WebElement email_add = driver.findElement(By.id("input-email"));
        email_add.sendKeys("roypeu0207@gmail.com");
        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("123456");
        WebElement submit_btn = driver.findElement(By.cssSelector("input.btn.btn-primary"));
        submit_btn.click();
    }
    @Test(priority = 1)
    void validemailInvalidpass(){
        WebElement email_add = driver.findElement(By.id("input-email"));
        email_add.sendKeys("roypeu0207@gmail.com");
        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("123456909879809");
        WebElement submit_btn = driver.findElement(By.cssSelector("input.btn.btn-primary"));
        submit_btn.click();
    }
    @Test(priority = 1)
    void invalidemailvalidpass(){
        WebElement email_add = driver.findElement(By.id("input-email"));
        email_add.sendKeys("roypeu0200909877@gmail.com");
        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("123456");
        WebElement submit_btn = driver.findElement(By.cssSelector("input.btn.btn-primary"));
        submit_btn.click();
    }
    @AfterTest
    void teardown(){
      driver.quit();
    }
}
