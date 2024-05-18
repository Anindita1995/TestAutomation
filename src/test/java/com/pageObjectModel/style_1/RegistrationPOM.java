package com.pageObjectModel.style_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//This class is for Page object model.
//This class will not contain any main method or @Test annotations. Here we only
//mention the elements from the webpage.
public class RegistrationPOM {
    WebDriver driver;
    By FirstName = By.id("input-firstname");
    By LastName =  By.id("input-lastname");
    By Email = By.id("input-email");
    By Phone = By.id("input-telephone");
    By password = By.id("input-password");
    By confirm_pass = By.id("input-confirm");
    By newsSubscription = By.xpath("//input[@name='newsletter'][@Value=1]");
    By PrivacyPolicy = By.xpath("//input[@name='agree'][@Value=1]");
    By submit = By.xpath("//input[@value='Continue']");

    //to initiate the driver we need Constructor
    RegistrationPOM(WebDriver d){
        driver=d;
    }
    public void setFirstName(String fname){
        driver.findElement(FirstName).sendKeys(fname);
    }
    public void setLastName(String lname){
        driver.findElement(LastName).sendKeys(lname);
    }
    public void setEmail(String email){
        driver.findElement(Email).sendKeys(email);
    }
    public void setTelephone(String tel_no){
        driver.findElement(Phone).sendKeys(tel_no);
    }
    public void setPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    public void setConfirm_pass(String con_pass){
        driver.findElement(confirm_pass).sendKeys(con_pass);
    }
    public void setNewsSubscription(){
        driver.findElement(newsSubscription).click();
    }
    public void setPrivacyPolicy(){
        driver.findElement(PrivacyPolicy).click();
    }
    public void setSubmitButton(){
        driver.findElement(submit).click();
    }
}
