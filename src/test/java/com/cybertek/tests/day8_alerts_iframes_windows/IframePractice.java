package com.cybertek.tests.day8_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframePractice {
    WebDriver driver;

    @BeforeMethod

    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");
    }

//TC #4 : Iframe practice
//1. Create a new class called: IframePractice
//2. Create new test and make set ups
//3. Go to: http://practice.cybertekschool.com/iframe
//4. Assert: "Your content goes here." Text is displayed.
//5. Assert: "An iFrame containing the TinyMCE WYSIWYG Editor

    @Test
    public void p4_iframe_practice (){
        //3 ways of locating.
        //1- ByIndex
        driver.switchTo().frame(0);
        //2- By Id or Name
        //3- Locate as a web element, then switch to it


        //Locating paragraph tag as a web element
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

    }

}
