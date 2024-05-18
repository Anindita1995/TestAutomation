package Log4j;

import lombok.extern.flogger.Flogger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.apache.log4j.Logger;



public class LoginMain {
    WebDriver driver;
    LoginBaseCode basecode;
    Logger logger;
    @BeforeTest
    public void setUP(){
    logger = Logger.getLogger("LoginMain");
    DOMConfigurator.configure("log4j.xml");

    logger.info("Browser opened");
        driver = new ChromeDriver();
        basecode = new LoginBaseCode(driver);
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().fullscreen();
    }
    @Test
    public void LoginTest(){
        logger.info("Valid User email");
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
