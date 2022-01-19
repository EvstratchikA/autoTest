package com.laba.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YourInformationPage {

    private WebDriver driver;

    @FindBy(how = How.ID, id = "first-name")
    private WebElement firstNameField;

    @FindBy(how = How.ID, id = "last-name")
    private WebElement lastNameField;

    @FindBy(how = How.ID, id = "postal-code")
    private WebElement postalCodeField;

    @FindBy(how = How.ID, id = "continue")
    private WebElement continueBtn;


    public YourInformationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public YourInformationPage inputFirstnameField(String firstName) {
        firstNameField.sendKeys(firstName);
        return PageFactory.initElements(driver, YourInformationPage.class);
    }

    public YourInformationPage inputLastNameField(String lastName){
        lastNameField.sendKeys(lastName);
        return PageFactory.initElements(driver, YourInformationPage.class);
    }

    public YourInformationPage inputPostalCodeField(String postalCode){
        postalCodeField.sendKeys(postalCode);
        return PageFactory.initElements(driver, YourInformationPage.class);
    }

    public YourInformationPage clickByContinueBtn(){
        continueBtn.click();
        return PageFactory.initElements(driver, YourInformationPage.class);

    }













}
