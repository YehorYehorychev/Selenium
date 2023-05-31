package edu.qa.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MainPageTest extends Base {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.veeva.com/");
        driver.findElement(By.id("CybotCookiebotDialogBodyButtonAccept")).click();

        WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='nav-search-field']")));
        searchField.sendKeys("Webinar");
        driver.findElement(By.xpath("//div[@id='s-icon']")).click();

        WebElement webinarVideo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[@data-bind='html: title'][1]")));
        webinarVideo.click();

        WebElement videoPlayer = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[local-name()='svg'][1]")));
        videoPlayer.click();

        WebElement video = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='w-vulcan--background w-css-reset'])[1]")));
        String classAttributeValue = video.getAttribute("class");
        if (classAttributeValue.contains("w-css-reset")) {
            System.out.println("The video on this page is playing now");
            System.out.print("Test passed");
        } else {
            System.out.println("The video on this page is not playing now");
        }
    }
}
