package ui.com.automationpracticesite.pages;

import helpers.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderConfirmationPage {

    private final WebDriver driver;

    private By orders = By.partialLinkText("Back to orders");

    public OrderConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public OrderHistoryPage navigateToOrdersHistoryPage() {
        ElementActions.click(driver, orders);
        return new OrderHistoryPage(driver);
    }

}
