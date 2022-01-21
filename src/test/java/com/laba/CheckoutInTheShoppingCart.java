package com.laba;

import com.laba.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutInTheShoppingCart extends BaseTest {

        @Test()
        public void verifyRemovingToCart() {

                LoginPage loginPage = new LoginPage(driver);
                String productsLabel = loginPage.setLoginForTest();
                Assert.assertEquals(productsLabel, SwagLabsConstants.PRODUCTS_GALLERY);

                HomePage home = new HomePage(driver);
                home.clickByAddBtn(0);
                home.clickByCartIcon();

                YourCartPage yourCartPage = new YourCartPage(driver);
                yourCartPage.clickByCheckout();

                YourInformationPage yourInformation = new YourInformationPage(driver);
                yourInformation.inputLastNameField("Auto");
                yourInformation.inputFirstnameField("Bob");
                yourInformation.inputPostalCodeField("22000");
                yourInformation.clickByContinueBtn();

                CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
                checkoutOverviewPage.clickByFinishBtn();
                Boolean descriptionOrder = checkoutOverviewPage.isOrderDisplayed();
                Assert.assertTrue(descriptionOrder, "Order is not displayed");

                CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);
                Boolean completeOrder = checkoutCompletePage.isOrderLogoDisplayed();
                Assert.assertTrue(completeOrder);











        }
}