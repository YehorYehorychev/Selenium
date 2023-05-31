package edu.qa.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class Button extends Base {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/automation-practice-form");

        WebElement checkBox = driver.findElement(By.id("firstName"));
        WebElement checkBox2 = driver.findElement(By.id("lastName"));
        checkBox.sendKeys("Yehor");
        checkBox.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        checkBox.sendKeys(Keys.chord(Keys.CONTROL, "c"));
        checkBox2.sendKeys(Keys.chord(Keys.CONTROL, "v"));

        driver.navigate().to("https://demoqa.com/alerts");
        driver.findElement(By.id("promtButton")).click();

        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        driver.switchTo().alert().sendKeys("Yehor Serega");
        alert.accept();







    }
}