package AutomationExcercisePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddProductsInCartPage {
    WebDriver driver;
    WebDriverWait webDriverWait;


    By VERIFY_HOME_PAGE_ADD_PRODUCT = By.xpath("//h2 [@class = \"title text-center\"]");
    By CLICK_PRODUCT_PAGE = By.xpath("//a [@href=\"/products\"]");
    By CLICK_FIRST_PRODUCT = By.xpath("//a [@data-product-id=\"1\"]");
    By CLICK_CONTINUE_SHOPPING = By.xpath("//button [@class=\"btn btn-success close-modal btn-block\"]");
    By CLICK_SECOND_PRODUCT = By.xpath("//a [@data-product-id=\"2\"]");
    By CLICK_VIEW_CART_BTN = By.xpath("//a [@href=\"/view_cart\"]");
    By VERIFY_FIRST_PRODUCT = By.xpath("//a [@href=\"/product_details/1\"]");
    By VERIFY_SECOND_PRODCT = By.xpath("//a [@href=\"/product_details/2\"]");

    By VERIFY_PRODUCTS_PRICES1 = By.xpath("(//td[@class=\"cart_price\"]/p)[1]");
    By VERIFY_PRODUCT_PRICES2 = By.xpath("(//td[@class=\"cart_price\"]/p)[2]");
    By VERIFY_QUANTITY_OF_PRODUCTS = By.xpath("(//td [@class=\"cart_quantity\"])[1]");
    By VERIFY_QUANTITY_OF_PRODUCTS2 = By.xpath("(//td [@class=\"cart_quantity\"])[2]");
    By VERIFY_ITEM_TOTAL_PRICE = By.xpath("(//td [@class = \"cart_total\"])[1]");
    By VERIFY_ITEM_TOTAL_PRICE2= By.xpath("(//td [@class = \"cart_total\"])[2]");
    public AddProductsInCartPage(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public boolean homePageVerify(String verifyHomePage){
        return driver.findElement(VERIFY_HOME_PAGE_ADD_PRODUCT).getText().toLowerCase().contains(verifyHomePage);
    }
    public void clickProductPage(){
        driver.findElement(CLICK_PRODUCT_PAGE).click();
    }
    public void clickOnFirstProduct(){
        driver.findElement(CLICK_FIRST_PRODUCT).click();
    }
    public void clickContinueShopping(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(CLICK_CONTINUE_SHOPPING));
        driver.findElement(CLICK_CONTINUE_SHOPPING).click();
    }
    public void clickOnSecondProduct(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(CLICK_SECOND_PRODUCT));
        driver.findElement(CLICK_SECOND_PRODUCT).click();
    }
    public void clickOpenCart(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(CLICK_VIEW_CART_BTN));
        driver.findElement(CLICK_VIEW_CART_BTN).click();
    }
    public boolean verifyFirstProduct(String firstProduct){
        return driver.findElement(VERIFY_FIRST_PRODUCT).getText().toLowerCase().contains(firstProduct);
    }
    public boolean verifySecondProduct(String secondProduct){
        return driver.findElement(VERIFY_SECOND_PRODCT).getText().toLowerCase().contains(secondProduct);
    }
    public String verifyProductsPrices1(){
       return  driver.findElement(VERIFY_PRODUCTS_PRICES1).getText();
    }
    public String verifyProductsPrices2(){
        return   driver.findElement(VERIFY_PRODUCT_PRICES2).getText();
    }
    public boolean verifyQuantityOfProduct1(String quantity1){
        return driver.findElement(VERIFY_QUANTITY_OF_PRODUCTS).getText().toLowerCase().contains(quantity1);
    }
    public boolean verifyQuantityOfProduct2(String quantity2){
        return driver.findElement(VERIFY_QUANTITY_OF_PRODUCTS).getText().toLowerCase().contains(quantity2);
    }
    public boolean verifyTotalOfItem1(String Total1){
        return driver.findElement(VERIFY_ITEM_TOTAL_PRICE).getText().toLowerCase().contains(Total1);
    }
    public boolean verifyTotalOfItem2(String Total2){
        return driver.findElement(VERIFY_ITEM_TOTAL_PRICE2).getText().toLowerCase().contains(Total2);
    }


}
