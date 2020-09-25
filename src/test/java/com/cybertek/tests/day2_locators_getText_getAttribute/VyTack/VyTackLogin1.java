package com.cybertek.tests.day2_locators_getText_getAttribute.VyTack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VyTackLogin1 {
/*
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://qa2.vytrack.com/user/login");
        Thread.sleep(3000);
        driver.findElement(By.id("prependedInput")).sendKeys("user173");
        Thread.sleep(2000);
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        Thread.sleep(2000);
        driver.findElement(By.id("_submit")).click();
        Thread.sleep(2000);
        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Login verification PASSED!");
        }else{
            System.out.println("Login verification failed!!!");
        }
        //locating fleet menu
        driver.findElement(By.xpath("(//li[@class='dropdown dropdown-level-1']/a/span)[1]")).click();

        //locating vehicle odometer and clicking
        driver.findElement(By.linkText("Vehicle Odometer")).click();

//        driver.quit();

    }

 */



    protected void setUp() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://qa2.vytrack.com/user/login");
        Thread.sleep(3000);
        driver.findElement(By.id("prependedInput")).sendKeys("user173");
        Thread.sleep(2000);
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        Thread.sleep(2000);
        driver.findElement(By.id("_submit")).click();
        Thread.sleep(3000);
//        String expectedTitle = "Dashboard";
//        String actualTitle = driver.getTitle();
//
//        if (actualTitle.equals(expectedTitle)) {
//            System.out.println("Login verification PASSED!");
//        }else{
//            System.out.println("Login verification failed!!!");
//        }





    }


}
