package demo.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TN_ChromeDriver {
    WebDriver driver;
    @BeforeTest
    void getURL(){
    driver = new ChromeDriver();
    driver.get("https://tutorialsninja.com/demo/");
    driver.manage().window().maximize();
    }
    @Test
    void clicklogin(){
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Login")).click();
    }
}
