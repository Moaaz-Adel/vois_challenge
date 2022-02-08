package ui.com.automationpracticesite.pages;

import helpers.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyAccountPage {
    WebDriver driver;
    private By blousesCategory = By.linkText("Blouses");

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public BlousesCategoryPage chooseBlousesFromWomenCategory() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#block_top_menu > ul > li:nth-child(1) > ul').setAttribute('style', 'display: block')");
        ElementActions.click(driver, blousesCategory);
        return new BlousesCategoryPage(driver);

    }
}