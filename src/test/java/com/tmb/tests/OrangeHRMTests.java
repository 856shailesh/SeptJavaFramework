package com.tmb.tests;

import com.tmb.pages.OrangeHRMHomePage;
import com.tmb.pages.OrangeHRMLoginPage;
import org.testng.annotations.Test;

public final class OrangeHRMTests extends BaseTest {
    private OrangeHRMTests() {

    }

    @Test
    public void loginLoginTest() {
        OrangeHRMLoginPage ohlp = new OrangeHRMLoginPage();
        OrangeHRMHomePage ohhp = ohlp.enterUserName("Admin").enterPassword("admin123").clickLogin();
        ohhp.clickWelcome().clickLogout();

    }
}
