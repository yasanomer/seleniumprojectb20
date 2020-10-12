package com.cybertek.tests.Exercise;

//TC # : Window Handle practice
//1. Create a new class called: WindowHandlePractice
//2. Create new test and make set ups
//3. Go to : http://practice.cybertekschool.com/windows
//4. Assert: Title is “Practice”
//5. Click to: “Click Here” text
//6. Switch to new Window.
//7. Assert: Title is “New Window”

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandleT5 {

    WebDriver driver;
    @BeforeMethod
  public void setup (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/windows");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
@Test
    public void windowHandle (){
        String actualTitle = driver.getTitle();
    Assert.assertTrue(actualTitle.contains("Practice"));
    // //a[@target='_blank'] locating element by xpath
    // <Click Here>  locating element by linkText
    // //a[@href='/windows/new'] locating element by xpath
    // a[href='/windows/new'] locating element by css
   WebElement clickHere = driver.findElement(By.linkText("Click Here"));
   clickHere.click();
   String mainWindow = driver.getWindowHandle();
    Set<String> windowHandle = driver.getWindowHandles();
    for (String each : windowHandle) {
        driver.switchTo().window(each);
    }
    Assert.assertTrue(driver.getTitle().contains("New Window"));

    driver.switchTo().window(mainWindow);
    String firstWindow = driver.getTitle();
    System.out.println(firstWindow);


}

}
