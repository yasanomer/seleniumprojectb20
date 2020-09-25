package com.cybertek.tests.day2_locators_getText_getAttribute.VyTack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
3.Verify that truck driver can add Event and it should display under
Activity tab and General information page as well .
 */
public class Jira3_AC3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa2.vytrack.com/user/login");
        driver.findElement(By.cssSelector("input[id='prependedInput']")).sendKeys("user173");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("UserUser123"+ Keys.ENTER);
        Thread.sleep(3000);
        //with a problem it finds fleet
        // driver.findElement(By.cssSelector("span[class='title title-level-1']")).click();
        //driver.findElement(By.linkText("Vehicles")).click();
        //with css it finds fleet
        // driver.findElement(By.cssSelector("li[class='dropdown dropdown-level-1']:nth-of-type(1)")).click();
        driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]")).click();
        Thread.sleep(3000);
        //finding vehicle

        driver.findElement(By.xpath("(//span[@class='title title-level-2'])[1]")).click();

        //driver.findElement(By.xpath("(//li[@class='dropdown dropdown-level-1']/div/div/ul/li[3]/a/span)[1]")).click();
        //driver.findElement(By.xpath("(//li[@class='dropdown dropdown-level-1']//span)[4]")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("tr[class='grid-row row-click-action']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@title='Add an event to this record']")).click();

    }
}