package ui.com.automationpracticesite.pages;

import helpers.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BlousesCategoryPage {

    private final WebDriver driver;

    private final By resultedProduct = By.xpath("//li//div[@class='button-container']//span[text() ='Add to cart']");
    private final By proceedingToCheckOutBtn = By.partialLinkText("Proceed to checkout");

    public BlousesCategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public ShoppingCartSummaryPage_Step1 selectAndCheckout() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('li.first-item-of-mobile-line').classList.add('hovered')");
        ElementActions.click(driver, resultedProduct);
        ElementActions.click(driver, proceedingToCheckOutBtn);
        return new ShoppingCartSummaryPage_Step1(driver);
    }

}
