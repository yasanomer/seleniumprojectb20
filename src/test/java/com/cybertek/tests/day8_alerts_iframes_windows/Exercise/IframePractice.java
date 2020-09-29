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
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.get("http://practice.cybertekschool.com/iframe");

}
@Test
        public void iFrameTest (){
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframe);

       WebElement content = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(content.isDisplayed(),"Massage is not display verification FAILED !!");

        driver.switchTo().defaultContent();
        WebElement result = driver.findElement(By.xpath("//h3"));

        Assert.assertTrue(result.isDisplayed(),"iFrame is not display verification FAILED !!");

    }
}
