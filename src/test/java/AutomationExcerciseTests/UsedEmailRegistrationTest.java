package AutomationExcerciseTests;

import AutomationExcercisePages.RegistrationPage;
import AutomationExcercisePages.UsedEmailRegistrationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class UsedEmailRegistrationTest {
    String URL1 = "https://automationexercise.com/";
    WebDriver driver;
    WebDriverWait webDriverWait;
    UsedEmailRegistrationPage usedEmailRegistrationPage;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.get(URL1);
        driver.manage().window().maximize();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        usedEmailRegistrationPage = new UsedEmailRegistrationPage(driver);
    }

    @BeforeMethod
    public void registrationBeforeLogin(){
        driver.get(URL1);
        usedEmailRegistrationPage.registerAccountBeforeRegistering();
    }

    @Test
    public void registerWithUsedEmail(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(usedEmailRegistrationPage.verifyHomePage("features items"));
        usedEmailRegistrationPage.signUpPage();
        usedEmailRegistrationPage.enterName("bayoomi.Mohamed");
        usedEmailRegistrationPage.enterEmail("mohamedbyoommi55@gmail.com");
        usedEmailRegistrationPage.clickSignUp();
        softAssert.assertTrue(usedEmailRegistrationPage.verifyAlreadyRegisteredMessage("email address already exist!"));
        softAssert.assertAll();
    }
}
