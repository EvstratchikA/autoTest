package com.laba;

import com.laba.pages.HomePage;
import com.laba.pages.LoginPage;
import com.laba.pages.SwagLabsConstants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddingOneProductTest extends BaseTest{

    @Test()
    public void verifyAddingToCart() {


        LoginPage loginPage = new LoginPage(driver);
        String productsLabel = loginPage.setLoginForTest();
        Assert.assertEquals(productsLabel, SwagLabsConstants.PRODUCTS_GALLERY);

        HomePage home = new HomePage(driver);
        home.clickByAddBtn(0);
        home.clickByCartIcon();
    }
}
