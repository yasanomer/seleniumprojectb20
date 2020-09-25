package com.cybertek.tests.day5_SeleniumEasy_Task1.Warmuptask;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TC1_Dropdown {
    public static void main(String[] args) throws InterruptedException {

//        TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
//        1.Open Chrome browser
//        2.Go to http://practice.cybertekschool.com/dropdown

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

//        3.Verify “Simple dropdown” default selected value is correctExpected: “Please select an option”
        //select[@id='dropdown']
        //*[@id='dropdown']

        Select actualResult = new Select(driver.findElement(By.xpath("//*[@id='dropdown']")));
        //return type is web element

        String actualDropDown = actualResult.getFirstSelectedOption().getText();
        String expectedDropDown = "Please select an option";

        Assert.assertEquals(actualDropDown, expectedDropDown);
        Thread.sleep(2000);

//        4.Verify“State selection” default selected value is correctExpected: “Select a State"
        Select actualResult2 = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //return type is web element
        //*[@id="content"]/h6[3]

        String actualSelectedOption = actualResult2.getFirstSelectedOption().getText();
        String expectedSelectedOption = "Select a State";

        Assert.assertEquals(actualSelectedOption, expectedSelectedOption);





    }

}
