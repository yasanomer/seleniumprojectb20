package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHeaderVerification {
    public static void main(String[] args) throws InterruptedException {
//    TC #3: Facebook header verification
//    1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//    2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
        Thread.sleep(4000);
        driver.findElement(By.className("_8eso")).getText();
        Thread.sleep(4000);

//    3. Verify header text is as expected: Expected: “Connect with friends and the world around you on Facebook.”
        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        String actualHeader = driver.findElement(By.className("_8eso")).getText();

//        System.out.println(driver.findElement(By.className("_8eso")));
//        System.out.println(driver.findElement(By.className("_8eso")).getText());



        if(actualHeader.equals(expectedHeader)){
            System.out.println("Header verification pass!");
        }else{
            System.out.println("Header verification failed!!!");
        }

        Thread.sleep(7000);
        driver.close();

    }
}
