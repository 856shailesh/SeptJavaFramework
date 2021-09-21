package com.tmb.pages;

import com.tmb.constants.FrameworkConstants;
import com.tmb.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected void click(By by) {
        explicitlyWaitForElementToBeClickable(by);
        DriverManager.getDriver().findElement(by).click();
    }

    protected void sendKeys(By by, String value) {
        explicitlyWaitForElementToBeClickable(by);
        DriverManager.getDriver().findElement(by).sendKeys(value);
    }

    protected String getPageTitle() {
        return DriverManager.getDriver().getTitle();
    }

    private void explicitlyWaitForElementToBeClickable(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitwait());
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    private void explicitlywaitForElementToBePresent(By by){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitwait());
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

}
