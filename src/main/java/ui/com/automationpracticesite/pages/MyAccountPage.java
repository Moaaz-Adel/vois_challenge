package ui.com.automationpracticesite.pages;

import helpers.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyAccountPage {
    WebDriver driver;

    private By womenCategory = By.linkText("Women");
    private By blousesCategory = By.linkText("Blouses");


    WebElement ele1 = driver.findElement(By.linkText("Women"));
    WebElement ele2 = driver.findElement(By.linkText("Blouses"));

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public BlousesCategoryPage chooseBlousesFromWomenCategory() {
//        ElementActions.hoverThenClick(driver, womenCategory, blousesCategory);
        ElementActions.hoverThenClick(driver, womenCategory, blousesCategory);

//        ElementActions.click(driver, blousesCategory);
        return new BlousesCategoryPage(driver);

    }
}