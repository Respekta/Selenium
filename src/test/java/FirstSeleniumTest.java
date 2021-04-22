import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.OutputStream;
import java.util.List;
import java.util.NoSuchElementException;

public class FirstSeleniumTest {
    //        Dimension dimension = new Dimension (1400, 900);
    //        driver.manage().window().setSize(dimension);
    //        driver.findElement(By.id("newPage")).click();
//        driver.quit(); // zamyka wszystkie okna
//        driver.close(); // zamyka pierwotne okno z focusem

    @Test
    public void googleOpenTest() {
        String driverPath = "C:\\Users\\Ulcia\\Desktop\\selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C://Users//Ulcia//Desktop//selenium//zasoby//Test.html");
        checkIfElementExist(By.tagName("a"),driver);
        checkIfElementExist(By.tagName("dupa"),driver);
    }

    public boolean checkIfElementExist(By locator, WebDriver driver) {
        if(driver.findElements(locator).size() > 0) {
            System.out.println("Element istnieje na stronie");
            return true;
        }
        System.out.println("Elementu ni ma na stronie");
        return false;
    }
    public void checkIfElementExist(WebDriver driver,By locator) {
        try {
            driver.findElement(locator);
            System.out.println("Element istnieje na stronie");
        } catch (NoSuchElementException exc) {
            System.out.println("Elementu ni ma na stronie");

        }
    }
}
//        WebElement topSecretElement = driver.findElement(By.className("topSecret"));
//        if(topSecretElement.isDisplayed()) {
//            System.out.println("Element jest widoczny");
//            System.out.println(topSecretElement.getText());
//        } else {
//            System.out.println("Element nie jest widoczny");
//        }

//        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
//        if (checkbox.isSelected()) {
//            System.out.println("Checkbox jest zaznaczony");
//            checkbox.click();
//            System.out.println("Checkbox został odznaczony");
//        } else {
//            System.out.println("Checkbox nie jest zaznaczony");
//        }


        // czy element jest edytowanlny
//        WebElement firstNameInput = driver.findElement(By.name("fname"));
//        if(firstNameInput.isEnabled()) {
//            System.out.println("Element nie jest zablokowany");
//            firstNameInput.sendKeys("Alex");
//        } else {
//            System.out.println("Element jest zablokowany");
//        }




//        WebElement smile = driver.findElement(By.id("smileImage"));
//        System.out.println(smileImg.getSize().getHeight());

//        WebElement paragraph =  driver.findElement(By.className("topSecret"));
//        System.out.println("Mój tekst to " + paragraph.getAttribute("textContent"));


//        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
//        checkbox.click();
//        WebElement radioButton = driver.findElement(By.xpath("//input[@value='male']"));
//        radioButton.click();

//        Select carSelect = new Select(driver.findElement(By.tagName("select")));
//        carSelect.selectByIndex(3);
//        carSelect.selectByVisibleText("Audi");
//        WebElement firstNameInput = driver.findElement(By.id("fname"));
//        firstNameInput.sendKeys("Maciek");
//        System.out.println("Wartość to " + firstNameInput.getAttribute("value"));
//        WebElement label = driver.findElement(By.tagName("label"));
//        System.out.println("Wartość dla label to " + label.getText());
//        driver.quit();



//        WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
//        clickOnMeButton.click();
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        WebElement firstNameInput = driver.findElement(By.id("fname"));
//        firstNameInput.sendKeys("Usia");
//        firstNameInput.clear();
//        firstNameInput.sendKeys("Alex");


//        WebElement firstNameInput = driver.findElement(By.name("fname"));
//        WebElement w3SchoolLink = driver.findElement(By.linkText("Visit W3Schools.com!"));
//        WebElement googleLink = driver.findElement(By.partialLinkText("Weird"));
//        WebElement topSecretParagraph = driver.findElement(By.className("topSecret"));
//        WebElement firstInput = driver.findElement(By.tagName("input"));
//        WebElement firstLink = driver.findElement(By.tagName("a"));
//
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        if(links.size()>0) {
//            System.out.println("Linki istnieją");
//        } else {
//            System.out.println("Linki nie istnieją");
//        }
//
//        WebElement clickOnMeCss = driver.findElement(By.cssSelector("#clickOnMe"));
//        WebElement clickOnMeXpath = driver.findElement(By.xpath("//*[@id=\"clickOnMe\"]"));

//        WebElement clickOnMeCssButton = driver.findElement(By.cssSelector("#clickOnMe"));
//        WebElement links = driver.findElement(By.cssSelector("a"));
//        WebElement topSecretCss = driver.findElement(By.cssSelector(".topSecret"));
//        WebElement tdFirstChild = driver.findElement(By.cssSelector("td:first-child"));
//
//        WebElement clickOnMeXpathButton = driver.findElement(By.xpath("/html/body/button"));
//        WebElement clickOnMeXpathButton2 = driver.findElement(By.xpath("//button"));
//        WebElement linksXpath = driver.findElement(By.xpath("//a"));
//        WebElement topSecretXpath = driver.findElement(By.xpath("//p[@class='topSecret']"));
//        WebElement topSecretXpath2 = driver.findElement(By.xpath("//*[@class='topSecret']"));
//        WebElement linkText = driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));
