package demo.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BaseClass2 {
    WebDriver driver;
    @FindBy(linkText = "My Account")
    WebElement myacc_dropdown;
    @FindBy(linkText = "Login")
    WebElement login_option;
    @FindBy(id="input-email")
    WebElement Email_address;
    @FindBy(id="input-password")
    WebElement user_pass;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement login_button;
    BaseClass2(WebDriver driver ){
       this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    //Now we will create methods for each web element.

    public void click_myacc(){
        myacc_dropdown.click();
    }
    public void click_login(){
        login_option.click();
    }
    public void user_id(String u_email){
        Email_address.sendKeys("tushar456@gmail.com");
    }
    public void password(String u_pass){
        user_pass.sendKeys("12345");
    }
    public void click_submit(){
    login_button.click();
    }
// So, this is our new BaseClass. So let's implement this class into our main LogIn Class
}
