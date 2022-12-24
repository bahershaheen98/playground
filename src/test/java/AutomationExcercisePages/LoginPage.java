package AutomationExcercisePages;

import AutomationExcerciseTests.RegistrationTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.*;

public class LoginPage {

    RegistrationPage registrationPage;
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        registrationPage = new RegistrationPage(driver);
    }
    By LOGIN_PAGE = By.xpath("//a [@href = \"/login\"]");
    By VERIFY_HOME_PAGE = By.xpath("//h2 [@class = \"title text-center\"]");
    By LOGIN_EMAIL = By.xpath("//input [@data-qa = \"login-email\"]");
    By LOGIN_PASSWORD = By.xpath("//input [@data-qa = \"login-password\"]");

    By LOGIN_BTN = By.xpath("//button [@data-qa = \"login-button\"]");
    By LOGIN_AS_USER = By.xpath("//i [@class = \"fa fa-user\"]");
    By DELETE_ACCOUNT_AFTER_LOGIN = By.xpath("//a [@href=\"/delete_account\"]");
    By VERIFY_ACCOUNT_IS_DELETED = By.xpath("//h2 [@data-qa = \"account-deleted\"]");


    public void registerAccountBeforeLogin(){
        registrationPage.clickOnSignup();
        registrationPage.enterSignUpName("bayoomi.Mohamed");
        registrationPage.enterSignUpEmail("mohamedbyoommi0@gmail.com");
        registrationPage.clickSignUpBTN();
        registrationPage.clickTitleBTN();
        registrationPage.enterPassword("1235555");
        registrationPage.enterDayOfBirth(15);
        registrationPage.enterMonthOfBirth(3);
        registrationPage.enterYearOfBirth(30);
        registrationPage.checkNewsLetter();
        registrationPage.checkOffersFromPartners();
        registrationPage.enterFirstName("Hamda");
        registrationPage.enterLastName("Mostafa");
        registrationPage.enterCompanyName("Vodafone");
        registrationPage.enterFirstAddress("Shar3 Serag, 12345, Ikea");
        registrationPage.enterSecondAddress("Shar3 Mamdouh Farag, 1222, EL 7ATY");
        registrationPage.selectYourCountry("United States");
        registrationPage.selectYourCountryState("California");
        registrationPage.selectYourCity("Florida");
        registrationPage.selectZipCode("14444");
        registrationPage.enterYourMobileNumber("01088555667");
        registrationPage.createAccountBTN();
        registrationPage.clickOnContinueBTNAfterRegistration();
        registrationPage.setLOGOUT_AFTER_REGISTRATION();
        registrationPage.clickOnHomePage();
    }
    public boolean homePageVerify(String verifyHomePage){
        return driver.findElement(VERIFY_HOME_PAGE).getText().toLowerCase().contains(verifyHomePage);
    }
    public void clickOnLogin(){
        driver.findElement(LOGIN_PAGE).click();
    }
    public void enterLoginEmail(String loginEmail){
        driver.findElement(LOGIN_EMAIL).sendKeys(loginEmail);
    }
    public void enterLoginPassword(String passwordOfLogin){
        driver.findElement(LOGIN_PASSWORD).sendKeys(passwordOfLogin);
    }
    public void clickLoginBTN(){
        driver.findElement(LOGIN_BTN).click();
    }
    public boolean verifyLoginAsUser(String logInAsUser){
       return driver.findElement(LOGIN_AS_USER).getText().toLowerCase().contains(logInAsUser);
    }
    public void deleteAccountAfterLogin(){driver.findElement(DELETE_ACCOUNT_AFTER_LOGIN).click();
    }

    public void verifyAccountIsDeleted(String deletedAccount){
        driver.findElement(VERIFY_ACCOUNT_IS_DELETED).getText().toLowerCase().contains(deletedAccount);
    }


}
