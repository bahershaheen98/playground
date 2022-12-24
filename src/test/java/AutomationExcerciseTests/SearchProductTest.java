package AutomationExcerciseTests;

import AutomationExcercisePages.LoginPage;
import AutomationExcercisePages.SearchProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class SearchProductTest {
    String URL1 = "https://automationexercise.com/";
    WebDriver driver;
    WebDriverWait webDriverWait;
    SearchProductPage searchProductPage;
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.get(URL1);
        driver.manage().window().maximize();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        searchProductPage = new SearchProductPage(driver);
    }

    @Test
    public void searchProduct(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(searchProductPage.homePageVerify("features items"));
        searchProductPage.clickProductPage();
        softAssert.assertTrue(searchProductPage.verifyProductPage("all products"));
        searchProductPage.searchForProduct("Men Tshirt");
        searchProductPage.clickSearchProductBtn();
        softAssert.assertTrue(searchProductPage.searchProductsPageVerify("searched products"));
        softAssert.assertTrue(searchProductPage.verifyRelatedSearch("men tshirt"));
        softAssert.assertAll();
    }
}
