package ui.com.automationpracticesite.pages;

import helpers.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
    WebDriver driver;
    private By blousesCategory = By.linkText("Blouses");

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public BlousesCategoryPage chooseBlousesFromWomenCategory() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#block_top_menu > ul > li:nth-child(1) > ul').setAttribute('style', 'display: block')");
        Actions.click(driver, blousesCategory);
        return new BlousesCategoryPage(driver);

    }
}