package com.laba;

import com.laba.pages.HomePage;
import com.laba.pages.LoginPage;
import com.laba.pages.SwagLabsConstants;
import com.laba.pages.YourCartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemovingOneProductFromTheCartTest extends BaseTest{

    @Test ()
    public void verifyRemovingToCart()  {

        LoginPage loginPage = new LoginPage(driver);
        String productsLabel = loginPage.setLoginForTest();
        Assert.assertEquals(productsLabel, SwagLabsConstants.PRODUCTS_GALLERY);

        HomePage home = new HomePage(driver);
        home.clickByAddBtn(0);
        home.clickByCartIcon();

        YourCartPage yourCart = new YourCartPage(driver);
        Boolean resultProduct = yourCart.isProductDisplayed();
        Assert.assertTrue(yourCart.isProductDisplayed(), "Product doesn't displayed");
        yourCart.clickByRemove();












    }
}
