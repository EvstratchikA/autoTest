package com.laba;


import com.laba.pages.HomePage;
import com.laba.pages.LoginPage;
import com.laba.pages.SwagLabsConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SortedTest extends  BaseTest{


    @Test()
    public void verifyFilter(){
        LoginPage loginPage = new LoginPage(driver);
        String productsLabel = loginPage.setLoginForTest();
        Assert.assertEquals(productsLabel, SwagLabsConstants.PRODUCTS_GALLERY);

        HomePage home = new HomePage(driver);
        home.clickBystandartFilter();
        home.clickByHighLowFilter();
        Boolean resultFilter = home.isHighLowFilterDisplayed();
        Assert.assertTrue(home.isHighLowFilterDisplayed(), "HighLow filter doesn't display!");


    }
















}
