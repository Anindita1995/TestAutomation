package com.selenium;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class HandlingCookies {
    WebDriver driver;
    @BeforeTest
    void start(){
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
    }
    @Test
    void cookiesize() {

        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("Size of cookies" + cookies.size());
    }
    @Test
    void printcookiename(){
    Set <Cookie> printcookie = driver.manage().getCookies();
    for (Cookie c: printcookie){
    System.out.println(c.getName()+" : "+c.getValue());
}
    }
    @Test
    void callcookiesbyname(){
        System.out.println(driver.manage().getCookieNamed("language"));
    }
    @Test
    void addcookies(){
        Cookie cookie_obj = new Cookie("TN_newCookie","39098#7896ABCD89");
        driver.manage().addCookie(cookie_obj);
        Set <Cookie> newlistofcookie = driver.manage().getCookies();
        for(Cookie c:newlistofcookie ){
            System.out.println(c.getName()+" : "+c.getValue());
        }

    }
    @Test
    void deletecookies(){
        Cookie c_obj = new Cookie("TN_NewCookie","abc23@gmail.com");
        driver.manage().addCookie(c_obj);
        Set <Cookie> newcookielist = driver.manage().getCookies();
        for(Cookie c: newcookielist){
            System.out.println(c.getName()+" : "+c.getValue());
        }
        driver.manage().deleteCookie(c_obj);
        Set <Cookie> remainlistcookie = driver.manage().getCookies();
        for(Cookie c: remainlistcookie){
            System.out.println(c.getName()+" : "+c.getValue());
        }
        driver.manage().deleteAllCookies();
        System.out.println(newcookielist.size());
    }
    @Test
    void deleteallcookies(){
        Set <Cookie> c = driver.manage().getCookies();
        System.out.println("Cookie size before deleting all cookies: "+c.size());
        driver.manage().deleteAllCookies();
        c = driver.manage().getCookies();
        System.out.println("Cookie size after deleting all cookies: "+c.size());
    }
}
