import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ProductsGalleryPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy (how = How.ID, id = "add-to-cart-sauce-labs-backpack")
    private WebElement buttonAddToCartBackPack;

    @FindBy (how = How.ID, id = "add-to-cart-sauce-labs-bike-light")
    private WebElement buttonAddToCartBikeLight;

    @FindBy (how = How.ID, id = "add-to-cart-sauce-labs-fleece-jacket")
    private WebElement buttonAddToCartFleeceJacket;

    @FindBy (how = How.CLASS_NAME, className = "shopping_cart_link")
    private WebElement shoppingCart;

    @FindBy (how = How.ID,id = "checkout")
    private WebElement buttonCheckout;

    @FindBy (how = How.ID, id = "first-name")
    private WebElement firstNameField;

    @FindBy (how = How.ID, id = "last-name")
    private WebElement lastNameField;

    @FindBy (how = How.ID, id = "postal-code")
    private WebElement postCodeField;

    @FindBy (how = How.ID, id = "continue")
    private WebElement continueButton;

    @FindBy (how = How.ID, id = "finish")
    private WebElement finishButton;

    @FindBy (how = How.XPATH, xpath = "//h2[@class = 'complete-header']")
    private WebElement completeOrder;

    @FindBy (how = How.ID, id = "continue-shopping")
    private WebElement continueShoppingButton;

    @FindBy (how = How.ID, id = "remove-sauce-labs-bike-light")
    private WebElement removeBikeLightFromCart;

    @FindBy (how = How.CLASS_NAME, className = "shopping_cart_badge")
    private WebElement numberOfItems;

    public ProductsGalleryPage (WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
        PageFactory.initElements(driver, this);
    }

    public String addOrder (){
        wait.until(ExpectedConditions.visibilityOf(buttonAddToCartBackPack)).click();
        wait.until(ExpectedConditions.visibilityOf(buttonAddToCartBikeLight)).click();
        wait.until(ExpectedConditions.visibilityOf(buttonAddToCartFleeceJacket)).click();
        wait.until(ExpectedConditions.visibilityOf(shoppingCart)).click();
        wait.until(ExpectedConditions.visibilityOf(buttonCheckout)).click();
        wait.until(ExpectedConditions.visibilityOf(firstNameField)).sendKeys(SwagLabsConstants.NAME);
        wait.until(ExpectedConditions.visibilityOf(lastNameField)).sendKeys(SwagLabsConstants.LAST_NAME);
        wait.until(ExpectedConditions.visibilityOf(postCodeField)).sendKeys(SwagLabsConstants.ZIP_CODE);
        wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(finishButton)).click();
        return wait.until(ExpectedConditions.visibilityOf(completeOrder)).getText();
    }

    public String addProduct(){
        wait.until(ExpectedConditions.visibilityOf(buttonAddToCartBackPack)).click();
        wait.until(ExpectedConditions.visibilityOf(buttonAddToCartBikeLight)).click();
        wait.until(ExpectedConditions.visibilityOf(buttonAddToCartFleeceJacket)).click();
        wait.until(ExpectedConditions.visibilityOf(shoppingCart)).click();
        return wait.until(ExpectedConditions.visibilityOf(numberOfItems)).getText();
    }

    public String removeProduct (){
        wait.until(ExpectedConditions.elementToBeClickable(continueShoppingButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(removeBikeLightFromCart)).click();
        wait.until(ExpectedConditions.visibilityOf(shoppingCart)).click();
        return wait.until(ExpectedConditions.visibilityOf(numberOfItems)).getText();
    }
}
