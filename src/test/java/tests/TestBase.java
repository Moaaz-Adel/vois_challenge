package tests;

import com.github.javafaker.Faker;
import helpers.ElementActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import ui.com.automationpracticesite.pages.AuthPage;

public class TestBase {

    WebDriver driver;

    Faker faker = new Faker();

    private By search = By.xpath("//input[@type='text']");

    @BeforeSuite
    public void test1() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }
    public void test() {
        ElementActions.type(driver, search, "test");
//        driver.quit();
    }

    @Test
    public void test2() {
        Assert.assertEquals(
                new AuthPage(driver).provideEmailStep(
                        faker.internet().emailAddress()
                ).createAccount(
                        "male",
                        "Moazawdawd",
                        "Adelawdaw",
                        "akdwmkwd@",
                        2,
                        1,
                        5,
                        "adwadwaw",
                        "dawd",
                        "adwawd",
                        "dawdaw",
                        "awdawd",
                        "adawdaw",
                        2,
                        55555,
                        "dawd",
                        "03210531510",
                        "0123156516",
                        "adw"
                        )
                        .chooseBlousesFromWomenCategory()
                        .selectAndCheckout()
                        .confirmOrder()
                        .navigateToOrdersHistoryPage(),
                "Test"
        );
    }
}
