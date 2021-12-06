import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {

    protected WebDriver driver;

    @BeforeClass
    public void configureProperty(){
        System.setProperty("webdriver.chrome.driver","/Users/diana/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.get(SwagLabsConstants.HOST);
        driver.manage().window().maximize();
    }

   @AfterMethod
    public void shutDown(){
        driver.close();
    }

}
