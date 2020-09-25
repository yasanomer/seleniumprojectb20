package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #6: Zero Bankheader verification1.Open Chrome browser
2.Go to http://zero.webappsecurity.com/login.html
3.Verify header textExpected: “Log in to ZeroBank
 */
public class P6_ZeroBankHeaderVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");

        String actualText = driver.findElement(By.tagName("h3")).getText();
        String expectedText = "Log in to ZeroBank";
        if(actualText.equals((expectedText))){
            System.out.println("Header verification PASSED!");
        }else {
            System.out.println("Header verification FAILED!!!");
        }
        Thread.sleep(5000);
        driver.close();


    }
}
