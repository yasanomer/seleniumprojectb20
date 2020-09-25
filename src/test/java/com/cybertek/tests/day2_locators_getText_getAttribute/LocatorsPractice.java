package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatorsPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.instagram.com/?hl=en");
        WebElement name = driver.findElement(By.name("username"));
        String actualText = name.getAttribute("aria-label");
        String expectedText = "Phone number, username, or email";
        if(actualText.equals(expectedText)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
            System.out.println("Expected text: "+expectedText);
            System.out.println("Actual text: "+actualText);
        }
        name.click();
        Thread.sleep(5000);
        driver.close();

    }

}
