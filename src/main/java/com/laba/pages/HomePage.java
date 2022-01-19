package com.laba.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class HomePage {

    private WebDriver driver;

    @FindBy(how = How.XPATH,xpath = "//button[contains(text(), 'Add to cart')]")
    private List<WebElement> addToCartBtns;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement cartIcon;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HomePage clickByAddBtn(int index) {
        addToCartBtns.get(index).click();
        return PageFactory.initElements(driver, HomePage.class);
    }

    public YourCartPage clickByCartIcon() {
        cartIcon.click();
        return PageFactory.initElements(driver, YourCartPage.class);
    }



}
