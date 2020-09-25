package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {
        // to setup chrome driver
        WebDriverManager.chromedriver().setup();
        //to create an object of ChromeDriver class
        ChromeDriver driver = new ChromeDriver();
        String url = "http://google.com";
        String url2= "http://youtube.com";

        // will open browser with URL
        // open google.com
        driver.get (url);
        Thread.sleep(3000);
        // will close web driver
        driver.navigate().refresh();

        /*
        // will put on hold current run on 3 seconds
        Thread.sleep(3000);

        driver.navigate().to(url2);
        Thread.sleep(3000);
        //will navigate back to the previous URL
        //in our case it's a google.com
        driver.navigate().back();

        //wait for 3 second
        Thread.sleep(3000);

        driver.navigate().forward();

         */
        //wait for 3 second
        Thread.sleep(3000);
        // will close web driver


        driver.close();
    }
}
