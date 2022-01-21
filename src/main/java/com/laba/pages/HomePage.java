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

    @FindBy(how = How.XPATH, xpath = "//*[contains(text(),'Sauce Labs Backpack')]")
    private WebElement productName;

    @FindBy(how = How.XPATH, xpath = "//a[@class='shopping_cart_link']")
    private WebElement cartIcon;

    @FindBy(how = How.XPATH, xpath = "//span[@class='shopping_cart_badge']")
    private WebElement cartBadge;

    @FindBy(how = How.XPATH, xpath = "//button[contains(text(), 'Remove')]")
    private List<WebElement> removeBtn;

    @FindBy (how = How.XPATH, xpath = "//*[contains(text(),'Products')]")
    private WebElement productLabel;

    @FindBy (how = How.XPATH, xpath = "//div[@class='inventory_item_img']")
    private List<WebElement> dogImg;

    @FindBy (how = How.XPATH, xpath = "//select[contains(@class,'product_sort_container')]")
    private WebElement defaultFilter;

    @FindBy (how = How.XPATH, xpath = "//option[@value='hilo']")
    private WebElement highLowFilter;

    @FindBy(how = How.XPATH, xpath = "//div[@class='inventory_item']")
    private List<WebElement> defaultItem;

    @FindBy(how = How.XPATH, xpath = "//div[@class='inventory_item']")
    private List<WebElement> sortedItem;


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

    public HomePage checkByCartBadge() {
        cartBadge.isDisplayed();
        return PageFactory.initElements(driver, HomePage.class);
    }

    public HomePage clickByRemoveBtn(int index) {
        removeBtn.get(index).click();
        return PageFactory.initElements(driver, HomePage.class);
    }

    public Boolean isCartBadgeEmpty(){
        return cartIcon.isDisplayed();
    }

    public Boolean isBadgeDisplayed(){
        return cartBadge.isDisplayed();
    }

    public Boolean isLabelDisplayed(){
        return productLabel.isDisplayed();
    }

    public List <WebElement> getDogImg(By by) {
        return (List<WebElement>) driver.findElements(by);
    }

    public Boolean isProductNameDisplayed(){
        return productName.isDisplayed();
    }

    public HomePage clickBystandartFilter() {
        defaultFilter.click();
        return PageFactory.initElements(driver, HomePage.class);
    }

    public HomePage clickByHighLowFilter() {
        highLowFilter.click();
        return PageFactory.initElements(driver, HomePage.class);
    }

    public Boolean isHighLowFilterDisplayed(){
        return highLowFilter.isDisplayed();
    }









}
