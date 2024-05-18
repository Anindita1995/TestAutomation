package demo.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
    WebDriver driver;
    @Test
    void setUp(){
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
        Assert.fail();
    }
    @Test(dependsOnMethods ={"setUp"},alwaysRun = true)
    void clickMyAccount(){
        driver.findElement(By.linkText("My Account")).click();

    }
    @Test(dependsOnMethods = {"setUp","clickMyAccount"})
    void clickLogin(){
        driver.findElement(By.linkText("Login")).click();
    }
}
