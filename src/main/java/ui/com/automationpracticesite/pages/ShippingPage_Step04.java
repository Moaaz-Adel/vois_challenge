package ui.com.automationpracticesite.pages;

import helpers.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage_Step04 {
    private final WebDriver driver;
    private final By proceedToCheckOutBtn = By.partialLinkText("Proceed to checkout");

    public ShippingPage_Step04(WebDriver driver) {
        this.driver = driver;
    }

    public PaymentPage_Step05 proceedShippingStep5() {
        ElementActions.click(driver, proceedToCheckOutBtn);
        return new PaymentPage_Step05(driver);
    }
}
