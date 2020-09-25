package com.cybertek.tests.day3_cssSelector_xpath.Practices;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RemoveElement {
    public static void main(String[] args) throws InterruptedException {

//        TC #2: PracticeCybertek.com_AddRemoveElements WebElement verification
//        1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        2. Go to http://practice.cybertekschool.com/add_remove_elements/
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        // div[class='example']
        Thread.sleep(3000);

//        3. Click to “Add Element” button
        WebElement addElement = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        addElement.click();
        Thread.sleep(2000);

//        4. Verify “Delete” button is displayed after clicking.
        WebElement delete = driver.findElement(By.xpath("//button[.='Delete']"));


        if(delete.isDisplayed()){
            System.out.println("Delete button is displayed");
        }else {
            System.out.println("Delete button is NOT displayed");
        }
//        5. Click to “Delete” button.
        delete.click();

//        6. Verify “Delete” button is NOT displayed after clicking.
        System.out.println("After delete");
        int button = driver.findElements(By.xpath("//button[.='Delete']")).size();
//        System.out.println("Delete button is NOT displayed"+delete1);
        if(button>0 ){
            System.out.println("Delete button is displayed");
        }else {
            System.out.println("Delete button is NOT displayed");
        }
//        USE XPATH and/orCSS Selector LOCATOR FOR ALL WEBELEMENT LOCATORS
//        Better if you do with both for practice purposes

        Thread.sleep(3000);
        driver.quit();

    }
}
