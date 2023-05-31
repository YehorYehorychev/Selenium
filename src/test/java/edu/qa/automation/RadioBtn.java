package edu.qa.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.Collections;

public class RadioBtn extends Base {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Xpath = "//tagname[@atribut='value'"


        driver.navigate().to("https://demoqa.com/radio-button");
        String txt = driver.getCurrentUrl();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.id("yesRadio"));
        Actions action = new Actions(driver);
        action.moveToElement(element).click().build().perform();
        String txtYes = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p/span")).getText();
        System.out.println(txt);
        System.out.println("Button is selected: " + txtYes);
       // driver.findElement(By.xpath("//label[@for='noRadio'")).getAttribute("disabled");

        WebElement element1 = driver.findElement(By.id("yesRadio"));
        WebElement element2 = driver.findElement(By.id("noRadio"));
        if (false) {
            System.out.println("Good - button is enabled");
        } else {
            Base.doScreenShot(driver);
            System.out.println("Bad - button is disabled");
           }










    }
}
