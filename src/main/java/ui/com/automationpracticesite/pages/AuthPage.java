package ui.com.automationpracticesite.pages;

import helpers.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthPage {

    private final WebDriver driver;
    private By emailAddressField = By.id("email_create");
    private By submitCreate = By.id("SubmitCreate");


    public AuthPage(WebDriver driver) {
        this.driver = driver;
    }

    public CreateAccountPage provideEmailStep(String emailAddress) {
        Actions.type(driver, emailAddressField, emailAddress);
        Actions.click(driver, submitCreate);
        return new CreateAccountPage(driver);
    }

}
