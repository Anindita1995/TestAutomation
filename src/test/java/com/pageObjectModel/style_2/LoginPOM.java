package com.pageObjectModel.style_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
    WebDriver driver;
    @FindBy(id="input-email")
    WebElement username;
    @FindBy(id="input-password")
    WebElement password;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement login;
    LoginPOM(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void valid_user_name(String v_user_name){
        username.sendKeys("tushar456@gmail.com");
    }
    public void valid_password(String v_pass){
        password.sendKeys("12345");
    }
    public void button(){
        login.click();
    }


}
