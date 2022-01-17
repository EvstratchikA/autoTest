package com.laba;

import com.laba.pages.LoginPageProblemUser;
import com.laba.pages.SwagLabsConstants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationProblemUserTest extends BaseTest{

    @Test()
    public void verifyCorrectCredentialProblemUser(){
        LoginPageProblemUser loginPageProblemUser = new LoginPageProblemUser(driver);
        String productsLabel = loginPageProblemUser.setLoginForTestProblemUser();
        Assert.assertEquals(productsLabel, SwagLabsConstants.PRODUCTS_GALLERY);
    }
}
