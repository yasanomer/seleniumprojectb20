package com.school.usa;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Monday {
    WebDriver driver;
@Test
          public void webpage (){
      driver = WebDriverFactory.getDriver("chrome");
      driver.get("https://www.facebook.com/");
  }



}
