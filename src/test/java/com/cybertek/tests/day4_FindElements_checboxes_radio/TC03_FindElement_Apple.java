package com.cybertek.tests.day4_FindElements_checboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC03_FindElement_Apple {
    public static void main(String[] args) throws InterruptedException {

//        TC #03: FINDELEMENTS_APPLE
//        1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        2.Go to https://www.apple.com
        driver.get("https://www.apple.com");
//        3.Click to all of the headers one by one
        System.out.println("=========================Mac===========================");
//        a.Mac, iPad, iPhone, Watch, TV, Music, Support
//        driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-mac']")).click();

        driver.findElement(By.xpath("//body//nav//div//li[2]//a[@class='ac-gn-link ac-gn-link-mac']"));

//        4.Printout how many links on each pageWithThe titles of the pages
        List<WebElement> macList = driver.findElements(By.xpath("//body//a"));
        int maclinksWithoutText =0;
        int maclinksWithText =0;
        for(WebElement eachLink : macList){
            String textOfEachLink = eachLink.getText();
            System.out.println(textOfEachLink);
            if (textOfEachLink.isEmpty()){
                maclinksWithoutText++;
            }else {
                maclinksWithText++;
            }
        }
//        5.Loop through all
//        6.Print out how many link is missing textTOTAL
        System.out.println("The number of Links that does not have text = " + maclinksWithoutText);
//        7.Print out how many link has textTOTAL
        System.out.println("The number of Links that HAS text = "+maclinksWithText);
//        8.Print out how many total linkTOTAL
        System.out.println("The number of how many total link = "+macList.size());

        System.out.println("=========================iPad===========================");

//        driver.navigate().back();
        Thread.sleep(5000);



//        3.Click to all of the headers one by one
//        a.Mac, iPad, iPhone, Watch, TV, Music, Support
//        driver.findElement(By.xpath("//body//nav//div//ul[2]//li[3]//a[@class='ac-gn-link ac-gn-link-ipad']")).click();
        WebElement iPadHeader = driver.findElement(By.xpath("//body//nav//div//ul[2]//li[3]//a[@class='ac-gn-link ac-gn-link-ipad']"));
        iPadHeader.click();
//        4.Printout how many links on each pageWithThe titles of the pages
        List<WebElement> ipadList = driver.findElements(By.xpath("//body//a"));
        int ipadlinksWithoutText =0;
        int ipadlinksWithText =0;
        for(WebElement eachLink : ipadList){
            String textOfEachLink = eachLink.getText();
            System.out.println(textOfEachLink);
            if (textOfEachLink.isEmpty()){
                ipadlinksWithoutText++;
            }else {
                ipadlinksWithText++;
            }
        }
//        5.Loop through all
//        6.Print out how many link is missing textTOTAL
        System.out.println("The number of Links that does not have text = " + ipadlinksWithoutText);
//        7.Print out how many link has textTOTAL
        System.out.println("The number of Links that HAS text = "+ipadlinksWithText);
//        8.Print out how many total linkTOTAL
        System.out.println("The number of how many total link = "+ipadList.size());


    }
}
