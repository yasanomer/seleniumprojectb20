package com.cybertek.tests.Exercise;

import com.cybertek.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/*
    //TC-6 : Window Handle practice
    //Create new test and make set ups
    //Go to : https://www.amazon.com
    //Copy paste the lines from below into your class
    //Create a logic to switch to the tab where Etsy.com is open
    //Assert: Title contains “Etsy”
    //Lines to be pasted:
    // ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
    // ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
    // ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
    These lines will simple open new tabs using something called JavaScriptExecut
    and get those pages. We will learn JavaScriptExecutor later as well.
 */
public class WindowHandleT6 {
    WebDriver driver;

    @BeforeMethod
    public void setup (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
    }
        @Test
    public void ups () {

            ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
            ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
            ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

            Set<String> windowHandles = driver.getWindowHandles();
            for (String each : windowHandles) {
                BrowserUtils.wait(2);
                driver.switchTo().window(each);
                System.out.println("Current page Title : " + driver.getTitle());
                if (driver.getCurrentUrl().contains("etsy")) {
                    Assert.assertTrue(driver.getTitle().contains("Etsy"));
                    break;
                }
            }


        }
}
