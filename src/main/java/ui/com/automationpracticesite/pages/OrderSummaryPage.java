package ui.com.automationpracticesite.pages;

import helpers.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSummaryPage {


    private final WebDriver driver;
    private By confirmingOrderBtn = By.partialLinkText("I confirm my order");

    public OrderSummaryPage(WebDriver driver) {
        this.driver = driver;
    }

    public OrderConfirmationPage confirmOrder() {
        ElementActions.click(driver, confirmingOrderBtn);
        return new OrderConfirmationPage(driver);
    }

}
