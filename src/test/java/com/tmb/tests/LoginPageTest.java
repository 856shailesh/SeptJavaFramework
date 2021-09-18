package com.tmb.tests;

import com.tmb.driver.Driver;
import com.tmb.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

// IMPORTANT NOTES :
//1. If there are multiple test , create the testng.xml
//Rules of Framework : 1. Never Hardcode 2. Keep right things at right place

public class LoginPageTest extends BaseTest {


    //BeforeMethod,AM has been moved to base test for code reusablity

    @Test
    public void test1() {
//        System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromedriverpath());
//        WebDriver driver = new ChromeDriver(); //Import : Clt+Shift+O
//        driver.get("https://www.google.com"); // Keep in excel of Properties file for manual tester
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automations", Keys.ENTER);
//        driver.quit(); // we are repeating few lines in every test so use after/before method
    }


}
