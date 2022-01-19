package com.laba.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {

    private WebDriver driver;

    @FindBy(how = How.XPATH, xpath = "//span[@class='title']")
    private WebElement overviewElement;

    @FindBy(how = How.ID, id = "finish")
    private WebElement finishBtn;

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public CheckoutOverviewPage clickByFinishBtn() {
        finishBtn.click();
        return PageFactory.initElements(driver, CheckoutOverviewPage.class);
    }

    public Boolean isOrderDisplayed(){
        return overviewElement.isDisplayed();
    }




}
