package com.laba.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TwitterPage {


    private WebDriver driver;

    public TwitterPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
