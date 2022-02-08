package ui.com.automationpracticesite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OrderHistoryPage {

    private WebDriver driver;
    private By rows = By.cssSelector("#order-list > tbody > tr");

    public OrderHistoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public int count() {
        List<WebElement> countOfRows = driver.findElements(rows);
        return countOfRows.size();
    }

}
