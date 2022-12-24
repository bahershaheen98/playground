package AutomationExcerciseTests;

import AutomationExcercisePages.LoginPage;
import AutomationExcercisePages.LogoutPage;
import AutomationExcercisePages.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class LogoutTest {
    String URL1 = "https://automationexercise.com/";
    WebDriver driver;
    WebDriverWait webDriverWait;

    RegistrationPage registrationPage;
    LoginPage loginPage;
    LogoutPage logoutPage;


    @BeforeClass
    public void setUpLogin()
    {
        driver = new ChromeDriver();
        driver.get(URL1);
        driver.manage().window().maximize();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        loginPage = new LoginPage(driver);
        logoutPage = new LogoutPage(driver);
        logoutPage.registerAccountBeforeLogin();

    }
    @BeforeMethod
    public void registrationBeforeLogin(){
        logoutPage.loginInBeforeLogout();
    }


    @Test
    public void testSuccessfulLogin(){
    SoftAssert softAssert = new SoftAssert();
    logoutPage.logOutBTN();
    softAssert.assertTrue(logoutPage.verifyLoginPage("login to your account"));
    softAssert.assertAll();

    }
}
