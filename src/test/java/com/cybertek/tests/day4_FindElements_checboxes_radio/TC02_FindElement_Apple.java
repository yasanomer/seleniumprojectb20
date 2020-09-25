package com.cybertek.tests.day4_FindElements_checboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC02_FindElement_Apple {
    public static void main(String[] args) {

//        TC #02: FINDELEMENTS_APPLE
//        1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        2.Go to https://www.apple.com
        driver.get("https://www.apple.com");
//        3.Click to iPhone
        driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']")).click();
//        WebElement clickIphone = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));
//        clickIphone.click();
//        4.Print out the texts of all links
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));
        int linksWithoutText =0;
        int linksWithText =0;
        for(WebElement eachLink : listOfLinks){
            String textOfEachLink = eachLink.getText();
            System.out.println(textOfEachLink);
            if (textOfEachLink.isEmpty()){
                linksWithoutText++;
            }else {
                linksWithText++;
            }
        }
//        5.Print out how many link is missing text
        System.out.println("The number of Links that does not have text = " + linksWithoutText);
//        6.Print out how many link has text
        System.out.println("The number of Links that HAS text = "+linksWithText);
//        7.Print out how many total link
        System.out.println("The number of how many total link = "+linksWithoutText+linksWithText);

    }
}
