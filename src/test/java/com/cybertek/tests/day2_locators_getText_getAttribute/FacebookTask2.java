package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
TC #2: Facebook incorrect login title verification
1.Open Chrome browser
2.Go to https://www.facebook.com
3.Enter incorrect username
4.Enter incorrect password
5.Verify title changed to: Expected: “Log into Facebook | Facebook”
 */
public class FacebookTask2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("anything@gmail.com" );
        Thread.sleep(4000);
        driver.findElement(By.id("pass")).sendKeys("121212" + Keys.ENTER);
        Thread.sleep(5000);

        String expectedTitle = "Log into Facebook | Facebook";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification pass!");
        }else{
            System.out.println("Title verification failed!!!");
        }







    }


}
