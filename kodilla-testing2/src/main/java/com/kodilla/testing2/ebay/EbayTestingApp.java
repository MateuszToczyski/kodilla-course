package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbayTestingApp {

    private static final String SEARCH_FIELD = "input[class='gh-tb ui-autocomplete-input']";

    public static void main(String... args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.ebay.com/");

        WebElement searchField = driver.findElement(By.cssSelector(SEARCH_FIELD));
        searchField.sendKeys("Laptop");
        searchField.submit();
    }
}
