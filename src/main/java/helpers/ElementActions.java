package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementActions {

    public static void click(WebDriver driver, By elementLocator) {
        ElementHelpers.click(driver, elementLocator);
    }

    public static void type(WebDriver driver, By elementLocator, String text) {
        ElementHelpers.type(driver, elementLocator, text);
    }

    public static void selectFromDropDown(WebDriver driver, By elementLocator, int index) {
        var availableOptions = (new Select(driver.findElement(elementLocator))).getOptions();
        new Select(driver.findElement(elementLocator)).selectByIndex(index);
    }

    public static void hover(WebDriver driver, By elementLocator) {
        Actions actions = new Actions(driver);
        new Actions(driver).moveToElement(driver.findElement(elementLocator)).perform();
    }

    public static void hoverThenClick(WebDriver driver, By elementLocator, By elementToBeClicked) {
        Actions actions = new Actions(driver);
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
        WebElement myLoc = driver.findElement(elementLocator);
        WebElement myLoc2 = driver.findElement(elementToBeClicked);
        actions.moveToElement(myLoc).moveToElement(myLoc2).click().perform();
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(elementToBeClicked));
        actions.moveToElement(myLoc2).click().build().perform();
    }


}
