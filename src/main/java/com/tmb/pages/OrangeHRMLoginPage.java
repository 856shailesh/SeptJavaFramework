package com.tmb.pages;

import com.tmb.driver.DriverManager;
import org.openqa.selenium.By;

public final class OrangeHRMLoginPage {
    /*
    id > name > classname > linktest > partialLinktext > css or xpath
    Assertions should not be called in page layers
    Every page method should have a return type
     */


    private final By textboxUsername = By.id("txtUsername");
    private final By textboxPassword = By.xpath("//input[@id='txtPassword' and @type='password']");
    private final By buttonLogin = By.id("btnLogin");

    public OrangeHRMLoginPage enterUserName(String username) {
        DriverManager.getDriver().findElement(textboxUsername).sendKeys(username);
        return this;
    }

    public OrangeHRMLoginPage enterPassword(String password) {
        DriverManager.getDriver().findElement(textboxPassword).sendKeys(password);
        return this;
    }

    public OrangeHRMHomePage clickLogin() {
        DriverManager.getDriver().findElement(buttonLogin).click();
        return new OrangeHRMHomePage();
    }

    public String getTitle() {
        return DriverManager.getDriver().getTitle();
    }

}
