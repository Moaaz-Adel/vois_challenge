package ui.com.automationpracticesite.pages;

import helpers.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPage_Step3 {

    private final WebDriver driver;
    private final By proceedToCheckOutBtn = By.partialLinkText("Proceed to checkout");

    public AddressPage_Step3(WebDriver driver) {
        this.driver = driver;
    }

    public ShippingPage_Step04 proceedAddressStep4() {
        ElementActions.click(driver, proceedToCheckOutBtn);
        return new ShippingPage_Step04(driver);
    }

}
