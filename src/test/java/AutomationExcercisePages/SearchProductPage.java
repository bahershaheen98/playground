package AutomationExcercisePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchProductPage {

    WebDriver driver;

    public SearchProductPage(WebDriver driver) {
        this.driver = driver;
    }

    By VERIFY_HOMEPAGE_SEARCH = By.xpath("//h2 [@class = \"title text-center\"]");
    By CLICK_PRODUCT_PAGE = By.xpath("//a [@href=\"/products\"]");
    By VERIFY_ALL_PRODUCT_PAGE = By.xpath("//div [@class=\"features_items\"]");
    By SEARCH_PRODUCT = By.id("search_product");
    By SEARCH_PRODUCT_BTN = By.id("submit_search");
    By SEARCHED_PRODUCTS = By.xpath("//div [@class=\"features_items\"]");
    By RELATED_PRODUCTS = By.xpath("//div [@class=\"productinfo text-center\"]");

    public boolean homePageVerify(String verifyHomePage){
        return driver.findElement(VERIFY_HOMEPAGE_SEARCH).getText().toLowerCase().contains(verifyHomePage);
    }
    public void clickProductPage(){
        driver.findElement(CLICK_PRODUCT_PAGE).click();
    }
    public boolean verifyProductPage(String allProducts){
        return driver.findElement(VERIFY_ALL_PRODUCT_PAGE).getText().toLowerCase().contains(allProducts);
    }
    public void searchForProduct(String nameOfProduct){
        driver.findElement(SEARCH_PRODUCT).sendKeys(nameOfProduct);
    }
    public void clickSearchProductBtn(){
        driver.findElement(SEARCH_PRODUCT_BTN).click();
    }
    public boolean searchProductsPageVerify(String searchedProductVerify){
        return driver.findElement(SEARCHED_PRODUCTS).getText().toLowerCase().contains(searchedProductVerify);
    }
    public boolean verifyRelatedSearch(String relatedSearch){
        return driver.findElement(RELATED_PRODUCTS).getText().toLowerCase().contains(relatedSearch);
    }


}
