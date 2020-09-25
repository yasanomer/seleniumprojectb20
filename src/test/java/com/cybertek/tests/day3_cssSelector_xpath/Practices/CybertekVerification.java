package com.cybertek.tests.day3_cssSelector_xpath.Practices;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CybertekVerification {
    public static void main(String[] args) throws InterruptedException {

//TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
//1. Open Chrome browser

    WebDriver driver = WebDriverFactory.getDriver("chrome");

//2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

//3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
//    a. “Home” link
        WebElement home = driver.findElement(By.xpath("//a[@class='nav-link']"));
        String homeTitle = home.getText();

        if(home.isDisplayed()){
            System.out.println("Home button is displayed.");
        }else{
            System.out.println("Home button is NOT displayed.");
        }
        Thread.sleep(4000);

//    b.“Forgot password” header
        WebElement forgotPassword = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        if(forgotPassword.isDisplayed()){
            System.out.println("Forgot password header is displayed.");
        }else{
            System.out.println("Forgot password header is NOT displayed.");
        }
        Thread.sleep(4000);
//    c.“E-mail” text
//        //label[@for='email']
        WebElement eMail = driver.findElement(By.xpath("//*[@for='email']"));
        if(eMail.isDisplayed()){
            System.out.println("E-mail text is displayed.");
        }else{
            System.out.println("E-mail text is NOT displayed.");
        }
        Thread.sleep(4000);


//    d.E-mail input box
        WebElement inputEmail = driver.findElement(By.xpath("//input[@name='email']"));
        if(inputEmail.isDisplayed()){
            System.out.println("E-mail input box is displayed.");
        }else{
            System.out.println("E-mail input box is NOT displayed.");
        }
        Thread.sleep(4000);

//    e.“Retrieve password” button
//        .icon-2x
        WebElement retrieve = driver.findElement(By.xpath("//input[@name='email']"));
        if(retrieve.isDisplayed()){
            System.out.println("'Retrieve password' button is displayed.");
        }else{
            System.out.println("'Retrieve password' button is NOT displayed.");
        }
        Thread.sleep(4000);


//    f.“Powered by Cybertek School” text
//        //div[@style='text-align: center;']
        WebElement poweredbyCybertek = driver.findElement(By.xpath("//input[@name='email']"));

        if(poweredbyCybertek.isDisplayed()){
            System.out.println("'Powered by Cybertek School' text is displayed.");
        }else{
            System.out.println("'Powered by Cybertek School' text is NOT displayed.");
        }
        Thread.sleep(4000);


//4. Verify all WebElements are displayed.
//Better if you do with both XPATHand CSSselector for practice purposes.

    Thread.sleep(2000);
    driver.quit();


    }
}
