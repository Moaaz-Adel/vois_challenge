package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Actions {

    /**
     * This Method will wait up to 10 seconds before clicking on the element located by the locator
     * */
    public static void click(WebDriver driver, By elementLocator) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(elementLocator));
        driver.findElement(elementLocator).click();
    }

    /**
     * This Method will wait up to 10 seconds before typing on the element the specified text
     * */
    public static void type(WebDriver driver, By elementLocator, String text) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementLocator));
        driver.findElement(elementLocator).sendKeys(text);
    }

    /**
     * This Method will select from a drop-down the specified index number
     * */
    public static void selectFromDropDown(WebDriver driver, By elementLocator, int index) {
        new Select(driver.findElement(elementLocator)).selectByIndex(index);
    }


}
