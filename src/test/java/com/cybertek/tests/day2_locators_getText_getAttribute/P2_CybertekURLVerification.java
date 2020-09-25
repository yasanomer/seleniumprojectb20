package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC	#2:	Cybertek	verifications
1.Open	Chrome	browser
2.Go	to	https://practice.cybertekschool.com
3.Verify	URL	containsExpected:	cybertekschool
4.Verify	title:	Expected:	Practice
 */
public class P2_CybertekURLVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");

        String expectedInUrl = "http://practice.cybertekschool.com/";
        String actualUrl = driver.getCurrentUrl();

//        if (actualUrl.contains(expectedInUrl)){
//            System.out.println("URL Verification PASSED!");
//        }else {
//            System.out.println("URL Verification FAILED !!!");
//        }

        System.out.println(actualUrl.equals("http://practice.cybertekschool.com/")? "URL verification passed" : "URL verification failed");


    }
}
