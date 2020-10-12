package com.cybertek.tests.day8_alerts_iframes_windows.Exercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframePractice {
 WebDriver driver;
@BeforeMethod
        public void setup () {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("http://practice.cybertekschool.com/iframe");
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
}

//    public void setupMethod() {
//    driver = WebDriverFactory.getDriver("chrome");
//    driver.manage().window().maximize();
//    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    driver.get("http://practice.cybertekschool.com/iframe");
//}
@Test

        public void iFrameTest () throws InterruptedException {
    System.out.println("Hello");
       Thread.sleep(10000);
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
     int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
        driver.switchTo().frame("mce_0_ifr");

        WebElement content = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(content.isDisplayed(),"Massage is not display verification FAILED !!");

        driver.switchTo().defaultContent();
        WebElement result = driver.findElement(By.xpath("//h3"));

        Assert.assertTrue(result.isDisplayed(),"iFrame is not display verification FAILED !!");

    }

    @Test
    public void iFrame1 (){

        driver.switchTo().frame(0);

        WebElement content = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(content.isDisplayed(),"Massage is not display verification FAILED !!");

        driver.switchTo().defaultContent();
        WebElement result = driver.findElement(By.xpath("//h3"));

        Assert.assertTrue(result.isDisplayed(),"iFrame is not display verification FAILED !!");

    }
}
