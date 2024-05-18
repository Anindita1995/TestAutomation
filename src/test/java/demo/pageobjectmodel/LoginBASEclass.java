package demo.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginBASEclass {
    WebDriver driver;
    By myacc_dropdown = By.linkText("My Account");
    By login_option =By.linkText("Login");
    By Email_address = By.id("input-email");
    By user_pass =By.id("input-password");
    By login_button= By.xpath("//input[@type='submit']");
    //we need a constructor to initialize webdriver
    LoginBASEclass(WebDriver d){
        driver = d;
    }
    //Now we will create methods for each web element.

    public void click_myacc(){
        driver.findElement(myacc_dropdown).click();
    }
    public void click_login(){
        driver.findElement(login_option).click();
    }
    public void user_id(String u_email){
        driver.findElement(Email_address).sendKeys(u_email);
    }
    public void password(String u_pass){
        driver.findElement(user_pass).sendKeys(u_pass);
    }
    public void click_submit(){
        driver.findElement(login_button).click();
    }

}

