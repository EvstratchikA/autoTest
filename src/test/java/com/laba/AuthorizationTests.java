package com.laba;
import com.laba.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.laba.pages.LoginPage;
import com.laba.pages.SwagLabsConstants;

import java.util.ArrayList;
import java.util.List;

public class AuthorizationTests extends BaseTest {


    @Test ()
    public void verifyCorrectCred(){
        LoginPage loginPage = new LoginPage(driver);
        String productsLabel = loginPage.setLoginForTest();
        Assert.assertEquals(productsLabel,SwagLabsConstants.PRODUCTS_GALLERY);
    }

    @Test
    public void verifyCorrectCredLockedUser(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLoginLockedUser("locked_out_user", "secret_sauce");
        Boolean messageDisplayed = loginPage.isErrorMessageDisplayed();
        Assert.assertTrue(messageDisplayed);
    }

    @Test
    public void verifyCorrectCredProblemUser(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLoginProblemUser("problem_user", "secret_sauce");

        HomePage home = new HomePage(driver);
        Boolean resultProblem = home.isLabelDisplayed();
        Assert.assertTrue(resultProblem);

        ArrayList<String> expectedResult = new ArrayList<String>();
        for(int i = 0; i<6; i++){
            expectedResult.add("/static/media/sl-404.168b1cce.jpg");
        }
        List<String> actualResults = home.getListOfPathImgs();

        Assert.assertEquals(actualResults, expectedResult, "Image doesn't the same!");

    }



}
