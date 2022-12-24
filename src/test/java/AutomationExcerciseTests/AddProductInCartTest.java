package AutomationExcerciseTests;

import AutomationExcercisePages.AddProductsInCartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class AddProductInCartTest {
    String URL1 = "https://automationexercise.com/";
    WebDriver driver;
    WebDriverWait webDriverWait;
    AddProductsInCartPage addProductsInCartPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(URL1);
        driver.manage().window().maximize();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        addProductsInCartPage = new AddProductsInCartPage(driver);
    }
    @Test
    public void addProductInCart(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(addProductsInCartPage.homePageVerify("features items"));
        addProductsInCartPage.clickProductPage();
        addProductsInCartPage.clickOnFirstProduct();
        addProductsInCartPage.clickContinueShopping();
        addProductsInCartPage.clickOnSecondProduct();
        addProductsInCartPage.clickOpenCart();
        softAssert.assertTrue(addProductsInCartPage.verifyFirstProduct("blue top"));
        softAssert.assertTrue(addProductsInCartPage.verifySecondProduct("men tshirt"));
        softAssert.assertEquals(addProductsInCartPage.verifyProductsPrices1(),"Rs. 500");
        softAssert.assertEquals(addProductsInCartPage.verifyProductsPrices2(),"Rs. 400");
        softAssert.assertTrue(addProductsInCartPage.verifyQuantityOfProduct1("1"));
        softAssert.assertTrue(addProductsInCartPage.verifyQuantityOfProduct2("1"));
        softAssert.assertTrue(addProductsInCartPage.verifyTotalOfItem1("rs. 500"));
        softAssert.assertTrue(addProductsInCartPage.verifyTotalOfItem2("rs. 400"));
        softAssert.assertAll();
    }
}

