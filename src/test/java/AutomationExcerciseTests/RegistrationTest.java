package AutomationExcerciseTests;

import AutomationExcercisePages.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class RegistrationTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    String URL = "https://automationexercise.com/";

    RegistrationPage registrationPage;

    @BeforeClass
    public void preConditions(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    @BeforeMethod
    public void setUp(){
    registrationPage = new RegistrationPage(driver);
    }

    @Test
    public void registration(){
        SoftAssert softAssert = new SoftAssert();
    softAssert.assertTrue(registrationPage.homePageVerify("features items"));
    registrationPage.clickOnSignup();
    softAssert.assertTrue(registrationPage.verifySignUp("new user signup!"));
    registrationPage.enterSignUpName("bayoomi.Mohamed");
    registrationPage.enterSignUpEmail("mohamedBayoommi0021@gmail.com");
    registrationPage.clickSignUpBTN();
    softAssert.assertTrue(registrationPage.verifyAccount_Information("enter account information"));
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
    softAssert.assertTrue(registrationPage.accountCreatedSign("account created"));
    registrationPage.clickOnContinueBTNAfterRegistration();
    softAssert.assertTrue(registrationPage.verifyLoggedInAsUser("logged in as"));
    registrationPage.deleteAccountBTN();
    softAssert.assertTrue(registrationPage.verifyAccountDeleted("account deleted"));
    softAssert.assertAll();

    }
}



