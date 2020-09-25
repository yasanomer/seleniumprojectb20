package com.cybertek.tests.day2_locators_getText_getAttribute.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #3: PracticeCybertek/ForgotPassword URL verification
1.Open Chrome browser
2.Go to http://practice.cybertekschool.com/forgot_password
3.Enter any email into input box
4.Click on Retrieve password
5.Verify URL contains: Expected: “email_sent”6.Verify textbox
displayed the content as expected.
Expected: “Your e-mail’s been sent!
”Hint: You need to use getText method for this practice
 */
public class CybertekVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
       Thread.sleep(3000);
        driver.findElement(By.name("email")).sendKeys("yasanomer@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.id("form_submit")).click();



        String expectedURL = "email_sent";
        String actualTitle = driver.getCurrentUrl();

        System.out.println("1->"+expectedURL);
        System.out.println("2->"+ actualTitle);

        if (actualTitle.contains(expectedURL)) {
            System.out.println("URL verification PASSED!");
        }else{
            System.out.println("URL verification failed!!!");
        }



        Thread.sleep(3000);
        driver.quit();


    }


}
