package com.laba;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.laba.pages.SwagLabsConstants;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void configureProperty(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\evstr\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.get(SwagLabsConstants.HOST);
        driver.manage().window().maximize();
    }

//    @AfterMethod
//    public void shutDown(){
//        driver.close();
//    }

}
