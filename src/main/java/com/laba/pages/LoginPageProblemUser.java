package com.laba.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageProblemUser {

    private WebDriver driver;
    private WebDriverWait wait;


    @FindBy (how = How.ID, id = "user-name")
    private WebElement login;

    @FindBy (how = How.ID, id = "password")
    private WebElement password;

    @FindBy (how = How.ID, id = "login-button")
    private WebElement buttonSubmit;

    @FindBy (how = How.XPATH, xpath = "//*[contains(text(),'Products')]")
    private WebElement productLabel;

    public LoginPageProblemUser(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
        PageFactory.initElements(driver, this);
    }

    public void login (){
        wait.until(ExpectedConditions.visibilityOf(login)).sendKeys(SwagLabsConstants.LOGIN_PROBLEM_USER);
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(SwagLabsConstants.PASSWORD_USER);
        wait.until(ExpectedConditions.elementToBeClickable(buttonSubmit)).click();

    }

    public String setLoginForTestProblemUser() {
        wait.until(ExpectedConditions.visibilityOf(login)).sendKeys(SwagLabsConstants.LOGIN_PROBLEM_USER);
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(SwagLabsConstants.PASSWORD_USER);
        wait.until(ExpectedConditions.elementToBeClickable(buttonSubmit)).click();
        return wait.until(ExpectedConditions.visibilityOf(productLabel)).getText();

    }


}
