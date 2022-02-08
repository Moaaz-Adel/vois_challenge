package ui.com.automationpracticesite.pages;

import helpers.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage_Step05 {
    private final WebDriver driver;

    public PaymentPage_Step05(WebDriver driver) {
        this.driver = driver;
    }
    private final By bankWireOption = By.partialLinkText("Pay by bank wire");

    public OrderSummaryPage checkoutFinalStep() {
        ElementActions.click(driver, bankWireOption);
        return new OrderSummaryPage(driver);
    }
}
