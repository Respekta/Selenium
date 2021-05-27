import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.sql.DriverManager.getDriver;

public class SeleniumTest {

    @Test
    public void openGooglePage() {
        String driverPath = "C:\\Users\\Ulcia\\Desktop\\selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        // przechodzimy do okienka z plikami cookies
        driver.switchTo().frame(0);
        // znalezienie przycisku
        WebElement agreeButton = driver.findElement(By.xpath("//span[contains(text(),'Zgadzam')]"));

        // klikniecie przycisku
        agreeButton.click();
        //powrót do pierwotnego okna
        driver.switchTo().defaultContent();
        // Znajdz pole wyszukiwania
        WebElement searchField = driver.findElement(By.name("q"));
        // wprowadz wartosc Selenium do pola
        searchField.sendKeys("Selenium");
        // zasymuluj naciśniecie przycisku Enter
        searchField.sendKeys(Keys.ENTER);
        // znalezc rezulat
        WebElement result = driver.findElement(By.xpath("//a[contains(@href,'selenium.dev')]//span"));

        Assert.assertTrue(result.isDisplayed());


    }

}
