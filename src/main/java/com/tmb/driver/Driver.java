package com.tmb.driver;

import com.tmb.utils.ReadPropertyFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Objects;

//final : no one can extend this class and use getDriver direcly
//private const : stop obj creation
public final class Driver {

    private Driver() {

    }


    public static void initDriver() throws Exception {

        //System.out.println(Thread.currentThread().getId() + " : " + Driver.driver);

        if (Objects.isNull(DriverManager.getDriver())) { // equivalent to : driver == null , this if cond is to acheive single thread implementation , if it is called again => not execute
            //System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromedriverpath());
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            DriverManager.setDriver(driver);
            DriverManager.getDriver().get(ReadPropertyFile.get("url"));
        }
    }

    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {//equivalent to : driver != null
            DriverManager.getDriver().quit();
            //getDriver() = null; // assign it back to null just in case if it quits
            DriverManager.unload();
        }
    }
}