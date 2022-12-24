package AutomationExcercisePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class LogoutPage {
    RegistrationPage registrationPage;
    LoginPage loginPage;
    WebDriver driver;
    public LogoutPage(WebDriver driver) {
        this.driver = driver;
        registrationPage = new RegistrationPage(driver);
        loginPage = new LoginPage(driver);
    }

    By LOGOUT_BTN = By.xpath("//a [@href=\"/logout\"]");
    By VERIFY_LOGIN_PAGE = By.xpath("//div [@class = \"login-form\"]");


    public void registerAccountBeforeLogin(){
        registrationPage.clickOnSignup();
        registrationPage.enterSignUpName("bayoomi.Mohamed");
        registrationPage.enterSignUpEmail("mohamedbyoommi22@gmail.com");
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
    public void loginInBeforeLogout(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(loginPage.homePageVerify("features items"));
        loginPage.clickOnLogin();
        loginPage.enterLoginEmail("mohamedbyoommi22@gmail.com");
        loginPage.enterLoginPassword("1235555");
        loginPage.clickLoginBTN();
        softAssert.assertTrue(loginPage.verifyLoginAsUser("logged in as"));
        softAssert.assertAll();
    }

    public void logOutBTN(){
        driver.findElement(LOGOUT_BTN).click();
    }
    public boolean verifyLoginPage(String userLogin){
        return driver.findElement(VERIFY_LOGIN_PAGE).getText().toLowerCase().contains(userLogin);
    }
}

