package com.tmb.pages;

import com.tmb.driver.DriverManager;
import org.openqa.selenium.By;

public class OrangeHRMHomePage {

    private final By linkWelcome = By.id("welcome");
    private final By linkLogout = By.xpath("//a[text()='Logout']");

    public OrangeHRMHomePage clickWelcome() {
        DriverManager.getDriver().findElement(linkWelcome).click();
        return this;
    }

    public OrangeHRMLoginPage clickLogout() {
        DriverManager.getDriver().findElement(linkLogout).click();
        return new OrangeHRMLoginPage();
    }
}
