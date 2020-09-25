package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook4 {
    public static void main(String[] args) throws InterruptedException {

/*
TC #4: Facebook header verification
1.Open Chrome browser
2.Go to https://www.facebook.com
3.Verify “Create a page” link href value contains text: Expected: “registration_form”•
Create new class for each task.
•There are some tips in the 2nd page for whoever needs it.
•Please try to solve yourself first before moving to the tips.
 */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(4000);
//        driver.findElement(By.linkText("Create a Page")).click();

        String expectedInAttribute = "registration_form";
        String actualAttribute = driver.findElement(By.linkText("Create a Page")).getAttribute("href");

        System.out.println("expected in attribute: "+expectedInAttribute);
        System.out.println("Actual attribute: "+actualAttribute);

        if(actualAttribute.contains(expectedInAttribute)){
            System.out.println("Attribute value verification PASSED !");
        }else {
            System.out.println("Attribute value verification FAILED !!!");
        }

        Thread.sleep(5000);
        driver.close();

    }
}
