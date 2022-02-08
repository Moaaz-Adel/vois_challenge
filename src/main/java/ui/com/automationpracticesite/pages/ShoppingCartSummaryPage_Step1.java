package ui.com.automationpracticesite.pages;

import helpers.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartSummaryPage_Step1 {

    private final WebDriver driver;
    private final By proceedToCheckOutBtn = By.partialLinkText("Proceed to checkout");

    public ShoppingCartSummaryPage_Step1(WebDriver driver) {
        this.driver = driver;
    }

    public AddressPage_Step3 proceedToCheckout() {
        ElementActions.click(driver, proceedToCheckOutBtn);
        return new AddressPage_Step3(driver);
    }
}
