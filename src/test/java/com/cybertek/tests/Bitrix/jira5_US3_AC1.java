package com.cybertek.tests.Bitrix;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class jira5_US3_AC1 {
    WebDriver driver;

    /*
    User Story – 3 - As a user, I should be able to create events by clicking on Event tab under Activity Stream..
    AC: 1. User should be able to click on upload files icon to upload files and pictures from local disks,
    download from external drive,select documents from bitrix24, and create files to upload.
     */
    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login2.nextbasecrm.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk23@cybertekschool.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test

    public void helpdesk() throws InterruptedException {
        //input[@class='login-inp']


        WebElement event = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-calendar']"));
        event.click();
        WebElement downloadFile = driver.findElement(By.xpath("//span[@id='bx-b-uploadfile-blogPostForm_calendar']"));
        downloadFile.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement downloadClick = driver.findElement(By.xpath("(//div[@class='diskuf-uploader'])[3]"));
        downloadClick.click();


        //input[@class='diskuf-fileUploader wd-test-file-light-inp diskuf-filemacos'])[1]


    }
    @Test
    public void uploadFile () throws InterruptedException {
        WebElement uploadLink = driver.findElement(By.linkText("Screen Shot 2020-09-30 at 22.58.38 (1).png"));
        uploadLink.click();
        Thread.sleep(3000);
        WebElement select = driver.findElement(By.xpath("//span[@class='popup-window-button popup-window-button-accept']"));
        select.click();
        WebElement more = driver.findElement(By.xpath("(//span[@class='feed-event-more-link-text'])[1]"));
        more.click();
    }

    @Test
    public void downloadBitrix () throws InterruptedException {
        WebElement event = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-calendar']"));
        event.click();
        WebElement downloadFile = driver.findElement(By.xpath("//span[@id='bx-b-uploadfile-blogPostForm_calendar']"));
        downloadFile.click();
        WebElement download = driver.findElement(By.xpath("(//span[.='Select document from Bitrix24'])[3]"));
        Thread.sleep(3000);
        download.click();
        WebElement selectFile = driver.findElement(By.linkText("Screen Shot 2020-09-30 at 22.58.38.png"));
        selectFile.click();
        Thread.sleep(3000);
        WebElement selectDocument = driver.findElement(By.xpath("//span[@class='popup-window-button popup-window-button-accept']"));
        selectDocument.click();
        WebElement send = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        send.click();




    }


}