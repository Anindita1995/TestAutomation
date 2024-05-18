package demo.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginMAINclass {
    WebDriver driver;
    // Now we need to implement our LoginBASEclass here
    BaseClass2 baseclass;
    @BeforeTest
    public void initialize(){
        driver = new ChromeDriver();
        baseclass = new BaseClass2(driver);
        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
        driver.manage().window().maximize();
    }
    @Test
    public void LoginTestCase(){
        //now we just use the methods
        baseclass.click_myacc();
        baseclass.click_login();
        baseclass.user_id("tushar456@gmail.com");
        baseclass.password("12345");
        baseclass.click_submit();


        //to validate our testcase we need assertion
        SoftAssert soft = new SoftAssert();
        String actualTitel = driver.findElement(By.xpath("//div[@id='content']//following::h2[1]")).getText();
        String expectedTitle = "My Account";
        soft.assertEquals(actualTitel,expectedTitle);
        soft.assertAll();
    }
    @AfterTest
    public void teardown(){
        driver.close();
    }

}


