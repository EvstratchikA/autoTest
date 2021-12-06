import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends AbstractTest {


    @Test (groups = "high_priority")
    public void authorizationTest_happyPath(){

        //given
        LoginPage loginPage = new LoginPage(driver);


        //when
        String productsLabel = loginPage.setLoginForTest();

        //then
        Assert.assertEquals(productsLabel,SwagLabsConstants.PRODUCTS_GALLERY);
    }


    @Test (groups = "high_priority")
    public void buyProductsTest_happyPath(){

        //given
        LoginPage loginPage = new LoginPage(driver);
        ProductsGalleryPage productsGalleryPage = new ProductsGalleryPage(driver);


        //when
        loginPage.login();
        String completeOrder = productsGalleryPage.addOrder();

        //then
        Assert.assertEquals(completeOrder, SwagLabsConstants.THANK_FOR_ORDER);


    }

    @Test (groups = "low_priority")
    public void removeProductTest_happyPath(){
        //given
        LoginPage loginPage = new LoginPage(driver);
        ProductsGalleryPage productsGalleryPage = new ProductsGalleryPage(driver);


        //when
        loginPage.login();
        String numberProductBeforeRemove = productsGalleryPage.addProduct();
        String numberProductAfterRemove =  productsGalleryPage.removeProduct();

        //then
        Assert.assertNotEquals(numberProductBeforeRemove,numberProductAfterRemove);

    }


}
