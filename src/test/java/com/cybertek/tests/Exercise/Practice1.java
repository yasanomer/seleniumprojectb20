package com.cybertek.tests.Exercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Practice1 {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }

    @Test
    public void findAlert() throws InterruptedException {

        WebElement alertFind = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        alertFind.click();
        Thread.sleep(200);

        Alert alert = driver.switchTo().alert();

        alert.sendKeys("hi");
        alert.accept();




    }
}

