package ui.com.automationpracticesite.pages;

import helpers.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage_Step05 {
    private final WebDriver driver;
    public PaymentPage_Step05(WebDriver driver) {
        this.driver = driver;
    }
    private final By proceedToCheckOutBtn = By.partialLinkText("Proceed to checkout");
    private final By termsOfServiceCheckbox = By.id("cgv");
    private final By bankWireOption = By.partialLinkText("Pay by bank wire");


    public PaymentPage_Step05 checkoutFinalStep() {
        ElementActions.click(driver, bankWireOption);
        ElementActions.click(driver, termsOfServiceCheckbox);
        ElementActions.click(driver, proceedToCheckOutBtn);
        return new PaymentPage_Step05(driver);
    }
}
