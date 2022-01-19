package com.laba.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage {

    private WebDriver driver;

    @FindBy(how = How.XPATH, xpath = "//*[contains(text(),'THANK YOU FOR YOUR ORDER')]")
    private WebElement orderElement;

    @FindBy(how = How.XPATH, xpath = "//img[@class='pony_express']")
    private WebElement logoElement;

    public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Boolean isOrderPlaced(){
        return orderElement.isDisplayed();
    }

    public Boolean isOrderLogoDisplayed(){
        return logoElement.isDisplayed();
    }

}
