package AutomationExcerciseTests;

import AutomationExcercisePages.WrongLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class WrongLoginTest {
    String URL = "https://automationexercise.com/";
    WebDriver driver;
    WebDriverWait webDriverWait;
    WrongLoginPage wrongLoginPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wrongLoginPage = new WrongLoginPage(driver);
    }

    @Test
    public void wrongUserAndPassLogin(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(wrongLoginPage.verifyHomePage2("features items"));
        wrongLoginPage.clickOnLoginPage();
        wrongLoginPage.wrongEmail("thewrongemail@hotmail.com");
        wrongLoginPage.wrongPassword("thewrongpasswoord");
        wrongLoginPage.loginBTN2();
        softAssert.assertTrue(wrongLoginPage.errorMessageAfterWrongLogin("your email or password is incorrect!"));
        softAssert.assertAll();
    }
}


