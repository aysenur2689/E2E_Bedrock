package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.actions = new Actions(driver);
    }

    public void goToUrl(String url) {
        System.out.println("[Test] Navigating to URL: " + url);
        driver.get(url);
    }

    public String getTitle() {
        String title = driver.getTitle();
        System.out.println("[Test] Page title: " + title);
        return title;
    }

    public void click(WebElement element) {
        System.out.println("[Test] Clicking on element: " + element);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void type(WebElement element, String text) {
        System.out.println("[Test] Typing text: " + text);
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    public String getText(WebElement element) {
        String text = wait.until(ExpectedConditions.visibilityOf(element)).getText();
        System.out.println("[Test] Element text: " + text);
        return text;
    }

    public boolean isDisplayed(WebElement element) {
        try {
            boolean isVisible = element.isDisplayed();
            System.out.println("[Test] Is element visible: " + isVisible);
            return isVisible;
        } catch (Exception e) {
            System.out.println("[Test] Element is not visible: " + e.getMessage());
            return false;
        }
    }

    public void hover(WebElement element) {
        System.out.println("[Test] Hovering over element");
        actions.moveToElement(element).perform();
    }

    public void scrollTo(WebElement element) {
        System.out.println("[Test] Scrolling to element");
        actions.moveToElement(element).perform();
    }

    public WebElement waitForVisibility(By locator) {
        System.out.println("[Test] Waiting for element to be visible: " + locator);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForInvisibility(WebElement element) {
        System.out.println("[Test] Waiting for element to be invisible");
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void waitForText(WebElement element, String text) {
        System.out.println("[Test] Waiting for element text to be: " + text);
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    public List<WebElement> getElements(List<WebElement> elements) {
        return elements;
    }

    public void refresh() {
        System.out.println("[Test] Refreshing page");
        driver.navigate().refresh();
    }

    public void back() {
        System.out.println("[Test] Going back to previous page");
        driver.navigate().back();
    }

    public void forward() {
        System.out.println("[Test] Going forward to next page");
        driver.navigate().forward();
    }
}
