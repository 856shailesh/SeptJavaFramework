package com.tmb.tests;

import com.tmb.pages.OrangeHRMHomePage;
import com.tmb.pages.OrangeHRMLoginPage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public final class OrangeHRMTests extends BaseTest {
    private OrangeHRMTests() {

    }

    @Test
    public void loginLoginTest() {
        //OrangeHRMLoginPage ohlp = new OrangeHRMLoginPage();
        String title = new OrangeHRMLoginPage().enterUserName("Admin")
                .enterPassword("admin123").clickLogin()
                .clickWelcome().clickLogout().getTitle();

        Assertions.assertThat(title)
                .isEqualTo("OrangeHRM");
    }
}
