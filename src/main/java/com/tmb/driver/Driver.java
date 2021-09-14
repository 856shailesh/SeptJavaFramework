package com.tmb.driver;

import com.tmb.constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Driver {

    public static WebDriver driver;

    public static void initDriver() {
        if (Objects.isNull(driver)) { // equivalent to : driver == null , this if cond is to acheive single thread implementation , if it is called again => not execute
            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromedriverpath());
            driver = new ChromeDriver();
            driver.get("https://www.google.com");
        }
    }

    public static void quitDriver() {
        if (Objects.nonNull(driver)) { //equivalent to : driver != null
            driver.quit();
            driver = null; // assign it back to null just in case if it quits
        }
    }
}
