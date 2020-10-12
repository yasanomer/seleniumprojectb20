package com.cybertek.tests.Bitrix;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
/*
User Story–1. As a user, I should be able to send messages by clicking on Message tab under Active Stream.
AC-7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
AC-8. User should be able to click on the Topic icon to see the Message Topic text box displays on top of the message box.
AC-9. User should be able to click on “Record Video” tab to record a video and attach it with the message.
 */
public class jira5_US1_AC7 {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login2.nextbasecrm.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk23@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
    }

    @Test
    public void topicBar(){
        WebElement messageClick = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-message']"));
        messageClick.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement topic = driver.findElement(By.id("lhe_button_title_blogPostForm"));
        topic.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement topicBar = driver.findElement(By.id("POST_TITLE"));
        Assert.assertTrue(topicBar.isDisplayed(),"Topic bar not is display,TEST FAIL !!! ");
    }

    @Test
    public void visualEditor (){
      WebElement messageClick = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-message']"));
      messageClick.click();
      WebElement visualButton = driver.findElement(By.xpath("//span[@id='lhe_button_editor_blogPostForm']"));
      visualButton.click();
      WebElement visualBar = driver.findElement(By.xpath("//div[@id='bx-html-editor-tlbr-idPostFormLHE_blogPostForm']"));
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      Assert.assertTrue(visualBar.isDisplayed(),"Visual bar not is display, TEST FAIL !!!");

    }

//span[@class='popup-window-button popup-window-button-blue']
}
