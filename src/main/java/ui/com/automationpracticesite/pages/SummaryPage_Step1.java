package ui.com.automationpracticesite.pages;

import helpers.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SummaryPage_Step1 {
    private final WebDriver driver;
    private final By proceedToCheckOutBtn = By.partialLinkText("Proceed to checkout");

    public SummaryPage_Step1(WebDriver driver) {
        this.driver = driver;
    }

    public AddressPage_Step3 proceedAddressStep3() {
        Actions.click(driver, proceedToCheckOutBtn);
        return new AddressPage_Step3(driver);
    }
}
