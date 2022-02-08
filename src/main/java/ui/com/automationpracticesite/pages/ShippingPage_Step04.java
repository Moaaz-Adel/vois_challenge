package ui.com.automationpracticesite.pages;

import helpers.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage_Step04 {
    private final WebDriver driver;

    private final By termsOfService = By.id("uniform-cgv");
    private final By proceedToCheckOutBtn = By.name("processCarrier");

    public ShippingPage_Step04(WebDriver driver) {
        this.driver = driver;
    }

    public PaymentPage_Step05 proceedShippingStep5() {
        Actions.click(driver, termsOfService);
        Actions.click(driver, proceedToCheckOutBtn);
        return new PaymentPage_Step05(driver);
    }
}
