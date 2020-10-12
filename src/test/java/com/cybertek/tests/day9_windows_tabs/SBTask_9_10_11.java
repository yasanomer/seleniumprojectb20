package com.cybertek.tests.day9_windows_tabs;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

/*
TC #9: SmartBear delete order
1. Open browser and login to SmartBear 2. Delete “Mark Smith” from the list
3. Assert it is deleted from the list
 */
public class SBTask_9_10_11 {
WebDriver driver;

@BeforeMethod
public void setupMethod (){
    driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    SmartBearUtilities.loginToSmartBear(driver);
}
@Test
    public void deleteOrder(){
    driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tbody//tr[3]//td[1]")).click();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.findElement(By.name("ctl00$MainContent$btnDelete")).click();
    }


    @AfterMethod
    public void verifyName () {
        String name="Mark Smith";
        List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

        for (WebElement each : namesList) {
//            Assert.assertFalse(each.getText().equals(name));
            Assert.assertTrue(!each.getText().equals(name));
        }


}

}

