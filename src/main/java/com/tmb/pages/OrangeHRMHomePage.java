package com.tmb.pages;

import com.google.common.util.concurrent.Uninterruptibles;
import com.tmb.driver.DriverManager;
import com.tmb.reports.ExtentLogger;
import com.tmb.reports.ExtentReport;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class OrangeHRMHomePage extends BasePage {

    private final By linkWelcome = By.id("welcome");
    private final By linkLogout = By.xpath("//a[text()='Logout']");

    public OrangeHRMHomePage clickWelcome() {

        click(linkWelcome);
        ExtentLogger.pass("Welcome Clicked");
        return this;
    }

    public OrangeHRMLoginPage clickLogout() {
        //Thread.sleep(5000);
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS); // Kind of Thread.sleep
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(linkLogout));
        //wait.until(d -> d.findElement(linkLogout).isEnabled()); //Java 8 implementation
        click(linkLogout);
        ExtentLogger.pass("Logout clicked");
        return new OrangeHRMLoginPage();
    }
}
