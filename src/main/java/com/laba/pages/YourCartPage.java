package com.laba.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Set;

public class YourCartPage {

    private WebDriver driver;

    @FindBy(how = How.XPATH, xpath = "//div[contains(text(), 'Sauce Labs Backpack')]")
    private WebElement product;

    @FindBy(how = How.ID, id = "remove-sauce-labs-backpack")
    private WebElement removeBtn;

    @FindBy(how = How.XPATH, xpath = "//div[@class='cart_item_label']")
    private WebElement cartItemLabel;

    @FindBy(how = How.XPATH, xpath = "//button[contains(text(), 'Checkout')]")
    private WebElement checkoutBtn;

    public YourCartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public YourCartPage clickByRemove() {
        removeBtn.click();
        return PageFactory.initElements(driver, YourCartPage.class);
    }

    public YourCartPage clickByCheckout(){
        checkoutBtn.click();
        return PageFactory.initElements(driver, YourCartPage.class);
    }

    public Boolean isProductDisplayed() {
        return product.isDisplayed();
    }


}
