package com.laba;

import com.laba.pages.HomePage;
import com.laba.pages.LoginPage;
import com.laba.pages.SwagLabsConstants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest{

    @Test()
    public void verifyCorrectCred() {
        LoginPage loginPage = new LoginPage(driver);
        String productsLabel = loginPage.setLoginForTest();
        Assert.assertEquals(productsLabel, SwagLabsConstants.PRODUCTS_GALLERY);

        HomePage home= new HomePage(driver);
        home.isLabelDisplayed();
        home.clickOnLogOut();
        Boolean resultLogout = home.isReturnedToLogInPage();
        Assert.assertTrue(resultLogout, "Login page doesn't displayed!");








    }

}
