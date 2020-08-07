package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_DAY = "//select[@id=\"day\"]";
    public static final String XPATH_MONTH = "//select[@id=\"month\"]";
    public static final String XPATH_YEAR = "//select[@id=\"year\"]";

    public static void main(String... args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        WebElement daySelectCombo = driver.findElement(By.xpath(XPATH_DAY));
        Select daySelect = new Select(daySelectCombo);
        daySelect.selectByVisibleText("10");

        WebElement monthSelectCombo = driver.findElement(By.xpath(XPATH_MONTH));
        Select monthSelect = new Select(monthSelectCombo);
        monthSelect.selectByVisibleText("maj");

        WebElement yearSelectCombo = driver.findElement(By.xpath(XPATH_YEAR));
        Select yearSelect = new Select(yearSelectCombo);
        yearSelect.selectByVisibleText("2000");
    }
}
