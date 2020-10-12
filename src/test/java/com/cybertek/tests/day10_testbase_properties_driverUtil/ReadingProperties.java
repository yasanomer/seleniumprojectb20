package com.cybertek.tests.day10_testbase_properties_driverUtil;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
    @Test
    public void reading_from_properties_file () throws IOException {
        Properties properties = new Properties();

        String path ="configuration.properties";

        FileInputStream file = new FileInputStream(path);

        properties.load(file);

        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));






    }
    @Test
    public void using_from_properties_utility_method (){
        System.out.println("ConfigurationReader.getProperty(\"browser\") = " + ConfigurationReader.getProperty("browser"));
        System.out.println("ConfigurationReader.getProperty(\"smartbearUrl\") = " + ConfigurationReader.getProperty("smartbearUrl"));

    }
}
