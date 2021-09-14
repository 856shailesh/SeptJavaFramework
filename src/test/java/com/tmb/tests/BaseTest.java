package com.tmb.tests;

import com.tmb.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected BaseTest() {
        //protected constructor to avoid object creation . Why we didn't do private ?
    }


    @BeforeMethod
    public void setUp() {
        Driver.initDriver();
        // ================== Below code moved to Driver class for better usage . ==========
//        System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromedriverpath());
//        //WebDriver driver = new ChromeDriver(); // make it class level vaiable to be used in every method
//        driver = new ChromeDriver();
//        driver.get("https://www.google.com");
    }

    @AfterMethod
    public void tearDown() {
      Driver.quitDriver();
    }
}
