package AutomationExcercisePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsedEmailRegistrationPage {
    RegistrationPage registrationPage;
    WebDriver driver;

    By VERIFY_HOMEPAGE = By.xpath("//h2 [@class = \"title text-center\"]");
    By SIGNUP_PAGE = By.xpath("//a [@href = \"/login\"]");
    By SIGNUP_NAME = By.xpath("//input [@data-qa = \"signup-name\"]");
    By SIGNUP_EMAIL = By.xpath("//input [@data-qa = \"signup-email\"]");

    By SIGNUP_BTN = By.xpath("//button [@data-qa = \"signup-button\"]");

    By VERIFY_ALREADY_REGISTERED_ERROR = By.xpath("//p [@style=\"color: red;\"]");

    public UsedEmailRegistrationPage(WebDriver driver) {
        this.driver = driver;
        registrationPage = new RegistrationPage(driver);

    }

    public void registerAccountBeforeRegistering(){
            registrationPage.clickOnSignup();
            registrationPage.enterSignUpName("bayoomi.Mohamed");
            registrationPage.enterSignUpEmail("mohamedbyoommi55@gmail.com");
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
        public boolean verifyHomePage(String VerificationText){
        return driver.findElement(VERIFY_HOMEPAGE).getText().toLowerCase().contains(VerificationText);
        }

        public void signUpPage(){
        driver.findElement(SIGNUP_PAGE).click();
        }
        public void enterName(String signUpName){
        driver.findElement(SIGNUP_NAME).sendKeys(signUpName);
        }
        public void enterEmail(String signUpEmail){
        driver.findElement(SIGNUP_EMAIL).sendKeys(signUpEmail);
        }

        public void clickSignUp(){
        driver.findElement(SIGNUP_BTN).click();
        }

        public boolean verifyAlreadyRegisteredMessage(String errorMessage){
        return driver.findElement(VERIFY_ALREADY_REGISTERED_ERROR).getText().toLowerCase().contains(errorMessage);
        }

}

