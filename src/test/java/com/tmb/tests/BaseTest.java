package com.tmb.tests;

import com.tmb.driver.Driver;
import com.tmb.reports.ExtentReport;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class BaseTest {

    protected BaseTest() {
        //protected constructor to avoid object creation . Why we didn't do private ?
    }

    /*
    private , protected , default -> public , go in this hierarchy
     */

    @BeforeMethod
    protected void setUp(Method m) throws Exception {
        Driver.initDriver();
        // ================== Below code moved to Driver class for better usage . ==========
//        System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromedriverpath());
//        //WebDriver driver = new ChromeDriver(); // make it class level vaiable to be used in every method
//        driver = new ChromeDriver();
//        driver.get("https://www.google.com");
    }

    @AfterMethod
    protected void tearDown(ITestResult result) {
        Driver.quitDriver();
    }
}
