package com.cybertek.tests.day2_locators_getText_getAttribute.WebDrivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
AC 2. Verify that when user click on any car on the grid ,
system should display general information about the car.
 */
public class JiraAc2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();

//        driver.get("https://qa2.vytrack.com/user/login");
        driver.navigate().to("https://qa2.vytrack.com/user/login");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id='prependedInput']")).sendKeys("user173");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("UserUser123"+ Keys.ENTER);
        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("span[class='title title-level-1']")).click();
        driver.findElement(By.xpath("//span[@class='title title-level-1']")).click();
//        driver.findElement(By.linkText("Vehicles")).click();
        Thread.sleep(3000);
//        driver.findElement(By.xpath("//tr[@class='grid-row row-click-action']")).click();
        driver.findElement(By.linkText("Vehicle Odometer")).click();



    }
}
