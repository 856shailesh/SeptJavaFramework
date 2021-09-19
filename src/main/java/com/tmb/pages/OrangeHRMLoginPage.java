package com.tmb.pages;

import com.tmb.driver.DriverManager;
import org.openqa.selenium.By;

public final class OrangeHRMLoginPage {
    /*
    id > name > classname > linktest > partialLinktext > css or xpath
     */


    private final By textbox_username = By.id("txtUsername");
    private final By textbox_password = By.xpath("//input[@id='txtPassword' and @type='password']");
    private final By button_login = By.id("btnLogin");

    public OrangeHRMLoginPage enterUserName(String username) {
        DriverManager.getDriver().findElement(textbox_username).sendKeys(username);
        return this;
    }

    public OrangeHRMLoginPage enterPassword(String password) {
        DriverManager.getDriver().findElement(textbox_password).sendKeys(password);
        return this;
    }

    public OrangeHRMHomePage clickLogin(){
        DriverManager.getDriver().findElement(button_login).click();
        return new OrangeHRMHomePage();
    }

}
