package com.laba;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.laba.pages.LoginPage;
import com.laba.pages.SwagLabsConstants;

public class AuthorizationTests extends BaseTest {


    @Test ()
    public void verifyCorrectCredential(){

        LoginPage loginPage = new LoginPage(driver);
        String productsLabel = loginPage.setLoginForTest();
        Assert.assertEquals(productsLabel,SwagLabsConstants.PRODUCTS_GALLERY);
    }

}
