package demo.TestNG;

import org.apache.poi.hwpf.model.types.SEPAbstractType;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class CookiesHandling {
    WebDriver driver;
    @BeforeTest
            void setup(){
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
    }
    @Test
    void cookiesize(){
        Set < Cookie> cookies = driver.manage().getCookies();
        System.out.println("Size of cookies: "+cookies.size());
    }
    @Test
    void printcookiename(){
        Set <Cookie> printcookiename = driver.manage().getCookies();
        for(Cookie c:printcookiename){
            System.out.println(c.getName()+" : "+c.getValue());
        }
    }
    @Test
    void printcookiesbyname(){
        System.out.println(driver.manage().getCookieNamed("currency"));
    }
    @Test
    void addnewCookie(){
        Cookie cookie_obj= new Cookie("USER_Name1","sam34@gmail.com");
        driver.manage().addCookie(cookie_obj);
        Set<Cookie> newCookieList = driver.manage().getCookies();
        for (Cookie c:newCookieList){
            System.out.println(c.getName()+" : "+c.getValue());
        }
    }
}
