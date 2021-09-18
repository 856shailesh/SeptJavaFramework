package com.tmb.tests;

import com.tmb.driver.Driver;
import com.tmb.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public final class HomePageTests extends BaseTest {

    private HomePageTests() {

    }

    @Test
    public void test3() {
        //Driver.initDriver();
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Shailesh", Keys.ENTER);
    }
}
