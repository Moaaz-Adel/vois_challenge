package ui.base;

import com.github.javafaker.Faker;
import org.openqa.selenium.Dimension;
import ui.helpers.Helpers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTests extends Helpers {

    protected WebDriver driver;
    protected Faker faker = new Faker();

    @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1024,768));
//        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }


}
