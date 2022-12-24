package AutomationExcerciseTests;

import AutomationExcercisePages.LoginPage;
import AutomationExcercisePages.RegistrationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;

public class LoginTest {
    String URL1 = "https://automationexercise.com/";
    WebDriver driver;
    WebDriverWait webDriverWait;

    RegistrationPage registrationPage;
    LoginPage loginPage;


    @BeforeClass
    public void setUpLogin()
    {
        driver = new ChromeDriver();
        driver.get(URL1);
        driver.manage().window().maximize();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        loginPage = new LoginPage(driver);

    }
    @BeforeMethod
    public void registrationBeforeLogin(){
        driver.get(URL1);
        loginPage.registerAccountBeforeLogin();
    }


 @Test
    public void testSuccessfulLogin(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(loginPage.homePageVerify("features items"));
        loginPage.clickOnLogin();
        loginPage.enterLoginEmail("mohamedbyoommi0@gmail.com");
        loginPage.enterLoginPassword("1235555");
        loginPage.clickLoginBTN();
        softAssert.assertTrue(loginPage.verifyLoginAsUser("logged in as"));
        loginPage.deleteAccountAfterLogin();
        loginPage.verifyAccountIsDeleted("account deleted");
    }
}
