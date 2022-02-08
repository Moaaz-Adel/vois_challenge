package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ElementHelpers {

    public static void click(WebDriver driver, By elementLocator) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(elementLocator));
        driver.findElement(elementLocator).click();
    }

    public static void selectFromDropDown(WebDriver driver, By elementLocator, int index) {
        List<WebElement> availableOptions = (new Select(driver.findElement(elementLocator))).getOptions();
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(elementLocator));
        for (int i = 0; i < availableOptions.size(); i++) {
            new Select(driver.findElement(elementLocator)).selectByIndex(index);
            index = i;
        }
    }

    public static void type(WebDriver driver, By elementLocator, String text) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementLocator));
        driver.findElement(elementLocator).sendKeys(text);
    }
}
