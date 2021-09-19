package com.tmb.tests;

import com.tmb.driver.DriverManager;

import static org.assertj.core.api.Assertions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public final class HomePageTests extends BaseTest {

    private HomePageTests() {

    }

    /*
        Validate that if the page title cointains the google search or not.
        Use AssertJ for all the assertions
     */

    @Test
    public void test3() {
        //Driver.initDriver();
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Testing Mini Bytes", Keys.ENTER);
        String title = DriverManager.getDriver().getTitle();


        assertThat(title)
                .isNotNull()
                .containsIgnoringCase("google search")
                .hasSizeBetween(15, 100);

        List<WebElement> elements = DriverManager.getDriver().findElements(By.xpath("//h3/span"));
        assertThat(elements)

                .extracting(WebElement::getText)  //same as .extracting(e-> e.getText())
                .contains("searches");

        /*
        Assert.assertTrue(Objects.nonNull(title));
        Assert.assertTrue(title.toLowerCase().contains("google search"));
        Assert.assertTrue(title.length() > 15);
        List<WebElement> elements = DriverManager.getDriver().findElements(By.xpath("//h3/span"));
        //Assert.assertEquals(elements.size(), 10);


        boolean isElementPresent = false;
        for (WebElement e : elements) {
            if(e.getText().equalsIgnoreCase("Shailesh Lodha")) {
                isElementPresent = true;
                break;
            }
        }
        Assert.assertTrue(isElementPresent,"shailesh lodha not found"); */
    }
}
