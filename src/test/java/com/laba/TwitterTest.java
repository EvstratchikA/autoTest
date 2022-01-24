package com.laba;

import com.laba.BaseTest;
import com.laba.pages.HomePage;
import com.laba.pages.LoginPage;
import com.laba.pages.SwagLabsConstants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TwitterTest extends BaseTest {


    @Test()
    public void verifyCorrectCred(){
        LoginPage loginPage = new LoginPage(driver);
        String productsLabel = loginPage.setLoginForTest();
        Assert.assertEquals(productsLabel, SwagLabsConstants.PRODUCTS_GALLERY);

        HomePage home = new HomePage(driver);
        home.clickByTwitterBtn();
        String expectedTwitterUrl = "https://twitter.com/saucelabs";
        Assert.assertEquals(home.getNewTabCurrentUrl(1), expectedTwitterUrl, "Twitter is not opened!");








    }
}
