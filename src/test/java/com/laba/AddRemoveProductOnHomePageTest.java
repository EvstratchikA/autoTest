package com.laba;

import com.laba.pages.HomePage;
import com.laba.pages.LoginPage;
import com.laba.pages.SwagLabsConstants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveProductOnHomePageTest extends BaseTest {

    @Test()
    public void verifyCorrectCred() {
        LoginPage loginPage = new LoginPage(driver);
        String productsLabel = loginPage.setLoginForTest();
        Assert.assertEquals(productsLabel, SwagLabsConstants.PRODUCTS_GALLERY);

        HomePage home = new HomePage(driver);
        home.clickByAddBtn(0);
        home.checkByCartBadge();
        Boolean resultBadge = home.isBadgeDisplayed();
        Assert.assertTrue(home.isLabelDisplayed());
        home.clickByRemoveBtn(0);
        Assert.assertTrue(home.isCartBadgeEmpty(), "is Cart Badge not Empty");

    }



}
