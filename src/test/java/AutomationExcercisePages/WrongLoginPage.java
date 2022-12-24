package AutomationExcercisePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WrongLoginPage {
    WebDriver driver;
    By VERIFY_HOMEPAGE_2 = By.xpath("//h2 [@class = \"title text-center\"]");
    By LOGIN_PAGE_WRONG = By.xpath("//a [@href = \"/login\"]");
    By LOGIN_EMAIL_WRONG = By.xpath("//input [@data-qa = \"login-email\"]");
    By LOGIN_PASS_WRONG = By.xpath("//input [@data-qa = \"login-password\"]");
    By LOGIN_BUTTN = By.xpath("//button [@data-qa = \"login-button\"]");

    By ERROR_MESSAGE_WRONG_EMAIL_OR_PASS = By.xpath("//p [@style = \"color: red;\"]");

    public WrongLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifyHomePage2(String verifyHomePage){
        return driver.findElement(VERIFY_HOMEPAGE_2).getText().toLowerCase().contains(verifyHomePage);

    }
    public void clickOnLoginPage(){
        driver.findElement(LOGIN_PAGE_WRONG).click();
    }

    public void wrongEmail(String emailIsWrong){
        driver.findElement(LOGIN_EMAIL_WRONG).sendKeys(emailIsWrong);
    }
    public void wrongPassword(String passwordIsWrong){
        driver.findElement(LOGIN_PASS_WRONG).sendKeys(passwordIsWrong);
    }

    public void loginBTN2(){
        driver.findElement(LOGIN_BUTTN).click();
    }
    public boolean errorMessageAfterWrongLogin(String errorMessage){
        return driver.findElement(ERROR_MESSAGE_WRONG_EMAIL_OR_PASS).getText().toLowerCase().contains(errorMessage);
    }


}
