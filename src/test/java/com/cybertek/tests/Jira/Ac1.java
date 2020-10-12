package com.cybertek.tests.Jira;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/*
AC:
1. User should be able to click on upload files icon to upload files and pictures from local disks,
download from external drive, select documents from bixtrix24, and create files to upload.
 */
public class Ac1 {
    WebDriver driver;
    @BeforeMethod
    public void setup (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login2.nextbasecrm.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void helpdesk (){
        driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk23@cybertekschool.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


}
