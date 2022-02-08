package ui.com.automationpracticesite.pages;

import helpers.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlousesCategoryPage {

    private final WebDriver driver;

    private final By resultedProduct = By.xpath("//li//div[@class='button-container']//span[text() ='Add to cart']");
    private final By proceedingToCheckOutBtn = By.partialLinkText("Proceed to checkout");

    public BlousesCategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public OrderSummaryPage selectAndCheckout() {
        ElementActions.click(driver, resultedProduct);
        ElementActions.click(driver, proceedingToCheckOutBtn);
        return new OrderSummaryPage(driver);
    }

}
