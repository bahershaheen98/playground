package AutomationExcercisePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

    By SIGNUP_PAGE = By.xpath("//a [@href = \"/login\"]");
    By VERIFY_HOME_PAGE = By.xpath("//h2 [@class = \"title text-center\"]");

    By CLICK_HOME_PAGE = By.xpath("//i [@class = \"fa fa-home\"]");
    By VERIFY_SIGNUP_PAGE = By.xpath("//div [@class = \"signup-form\"]");

    WebDriverWait webDriverWait;
    By SIGNUP_NAME = By.xpath("//input [@data-qa = \"signup-name\"]");
    By SIGNUP_EMAIL = By.xpath("//input [@data-qa = \"signup-email\"]");
    By SIGNUP_BTN = By.xpath("//button [@data-qa = \"signup-button\"]");
    By ACCOUNT_INFORMATION = By.xpath("//h2 [@class = \"title text-center\"]");
    By TITLE_BTN = By.id("id_gender1");
    By PASSWORD_FIELD = By.id("password");
    By SELECT_DAY = By.id("days");
    By SELECT_MONTH = By.id("months");
    By SELECT_YEAR = By.id("years");
    By NEWS_LETTER = By.id("newsletter");
    By SPECIAL_OFFERS = By.id("optin");
    By FIRST_NAME = By.id("first_name");
    By LAST_NAME = By.id("last_name");
    By COMPANY_NAME = By.id("company");
    By ADDRESS_1 = By.id("address1");
    By ADDRESS_2 = By.id("address2");
    By SELECT_COUNTRY = By.id("country");
    By SELECT_YOUR_COUNTRY_STATE = By.id("state");
    By SELECT_CITY = By.id("city");
    By ENTER_ZIPCODE = By.id("zipcode");
    By MOBILE_NUMBER = By.id("mobile_number");
    By CREATE_ACCOUNT_BTN = By.xpath("//button [@data-qa = \"create-account\"]");
    By ACCOUNT_CREATED_SIGN = By.xpath("//h2 [@class = \"title text-center\"]");
    By CONTINUE_BTN_AFTER_REGISTRATION = By.xpath("//a [@data-qa = \"continue-button\"]");
    By LOGGED_IN_AS_USER_SIGN = By.xpath("//i [@class = \"fa fa-user\"]");
    By DELETE_ACCOUNT_BTN = By.xpath("//a [@href=\"/delete_account\"]");
    By ACCOUNT_DELETED_VERIFY = By.xpath("//h2 [@data-qa = \"account-deleted\"]");

    By LOGOUT_AFTER_REGISTRATION = By.xpath("//a [@href=\"/logout\"]");
    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnSignup(){
        driver.findElement(SIGNUP_PAGE).click();
    }
    public boolean verifySignUp(String signUpPageConfirm){
        return driver.findElement(VERIFY_SIGNUP_PAGE).getText().toLowerCase().contains(signUpPageConfirm);
    }
    public boolean homePageVerify(String verifyHomePage){
       return driver.findElement(VERIFY_HOME_PAGE).getText().toLowerCase().contains(verifyHomePage);
    }
    public void enterSignUpName(String signUpName){
    driver.findElement(SIGNUP_NAME).sendKeys(signUpName);
    }
    public void enterSignUpEmail(String signUpEmail){
        driver.findElement(SIGNUP_EMAIL).sendKeys(signUpEmail);
    }
    public void clickSignUpBTN(){
        driver.findElement(SIGNUP_BTN).click();
    }
    public boolean verifyAccount_Information(String AccountInfoVerify){
      return  driver.findElement(ACCOUNT_INFORMATION).getText().toLowerCase().contains(AccountInfoVerify);
    }
    public void clickTitleBTN(){
        driver.findElement(TITLE_BTN).click();
    }
    public void enterPassword(String thePassword) {
        driver.findElement(PASSWORD_FIELD).sendKeys(thePassword);
    }
    public void enterDayOfBirth(int dayOfBirth){
    Select select = new Select(driver.findElement(SELECT_DAY));
    select.selectByIndex(dayOfBirth);
    }

    public void enterMonthOfBirth(int MonthOfBirth){
        Select select = new Select(driver.findElement(SELECT_MONTH));
        select.selectByIndex(MonthOfBirth);
    }
    public void enterYearOfBirth(int HowOld){
        Select select = new Select((driver.findElement(SELECT_YEAR)));
        select.selectByIndex(HowOld);
    }
    public void checkNewsLetter(){
        driver.findElement(NEWS_LETTER).click();
    }
    public void checkOffersFromPartners(){
        driver.findElement(SPECIAL_OFFERS).click();
    }
    public void enterFirstName(String writeFirstName){
        driver.findElement(FIRST_NAME).sendKeys(writeFirstName);
    }
    public void enterLastName(String writeLastName){
        driver.findElement(LAST_NAME).sendKeys(writeLastName);
    }
    public void enterCompanyName(String writeCompanyName){
        driver.findElement(COMPANY_NAME).sendKeys(writeCompanyName);
    }
    public void enterFirstAddress(String addressNumberOne){
        driver.findElement(ADDRESS_1).sendKeys(addressNumberOne);
    }
    public void enterSecondAddress(String addressNumberTwo){
        driver.findElement(ADDRESS_2).sendKeys(addressNumberTwo);
    }
    public void selectYourCountry(String countries){
        Select select = new Select(driver.findElement(SELECT_COUNTRY));
        select.selectByValue(countries);
    }
    public void selectYourCountryState(String state){
        driver.findElement(SELECT_YOUR_COUNTRY_STATE).sendKeys(state);
    }
    public void selectYourCity(String city){
        driver.findElement(SELECT_CITY).sendKeys(city);
    }
    public void selectZipCode(String zipCode){
        driver.findElement(ENTER_ZIPCODE).sendKeys(zipCode);
    }
    public void enterYourMobileNumber(String mobileNumber){
        driver.findElement(MOBILE_NUMBER).sendKeys(mobileNumber);
    }
    public void createAccountBTN(){
        driver.findElement(CREATE_ACCOUNT_BTN).click();
    }
    public boolean accountCreatedSign(String signVerification){
       return driver.findElement(ACCOUNT_CREATED_SIGN).getText().toLowerCase().contains(signVerification);

    }
    public void clickOnContinueBTNAfterRegistration(){
        driver.findElement(CONTINUE_BTN_AFTER_REGISTRATION).click();
    }
    public boolean verifyLoggedInAsUser(String User){
      return   driver.findElement(LOGGED_IN_AS_USER_SIGN).getText().toLowerCase().contains(User);
    }
    public void deleteAccountBTN(){
        driver.findElement(DELETE_ACCOUNT_BTN).click();
    }
    public boolean verifyAccountDeleted(String deleted){
      return driver.findElement(ACCOUNT_DELETED_VERIFY).getText().toLowerCase().contains(deleted);
    }
    public void setLOGOUT_AFTER_REGISTRATION(){
        driver.findElement(LOGOUT_AFTER_REGISTRATION).click();
    }
    public void clickOnHomePage(){
        driver.findElement(CLICK_HOME_PAGE).click();
    }

}
