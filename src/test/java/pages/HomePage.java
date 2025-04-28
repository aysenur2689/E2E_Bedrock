package pages;

import locators.HomePageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
        System.out.println("[Test] HomePage class initialized");
    }

    public String getHomePageTitle() {
        System.out.println("[Test] Getting home page title");
        return getTitle();
    }

    public boolean isSolutionsMenuVisible() {
        System.out.println("[Test] Checking Solutions menu visibility");
        WebElement solutionsMenu = driver.findElement(HomePageLocators.SOLUTIONS_MENU);
        return isDisplayed(solutionsMenu);
    }

    public void clickSolutionsMenu() {
        System.out.println("[Test] Clicking on Solutions menu");
        WebElement solutionsMenu = driver.findElement(HomePageLocators.SOLUTIONS_MENU);
        click(solutionsMenu);
    }

    public void clickContactButton() {
        System.out.println("[Test] Clicking on Contact button");
        WebElement contactButton = waitForVisibility(HomePageLocators.CONTACT_BUTTON);
        click(contactButton);
        // Wait for page load
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isContactHeaderVisible() {
        System.out.println("[Test] Checking Contact header visibility");
        try {
            WebElement contactHeader = waitForVisibility(HomePageLocators.CONTACT_HEADER);
            return contactHeader.isDisplayed();
        } catch (Exception e) {
            System.out.println("[Test] Contact header not found: " + e.getMessage());
            return false;
        }
    }

    public String getContactHeaderText() {
        System.out.println("[Test] Getting Contact header text");
        WebElement contactHeader = waitForVisibility(HomePageLocators.CONTACT_HEADER);
        return getText(contactHeader);
    }

    public void fillFirstName(String firstName) {
        System.out.println("[Test] Filling first name: " + firstName);
        try {
            Thread.sleep(2000);
            WebElement firstNameInput = waitForVisibility(HomePageLocators.FIRST_NAME_INPUT);
            System.out.println("[Test] First name input found, clicking...");
            firstNameInput.click();
            System.out.println("[Test] Clearing first name input...");
            firstNameInput.clear();
            System.out.println("[Test] Sending keys to first name input...");
            firstNameInput.sendKeys(firstName);
            System.out.println("[Test] First name filled successfully");
        } catch (InterruptedException e) {
            System.out.println("[Test] Sleep interrupted: " + e.getMessage());
            Thread.currentThread().interrupt();
        } catch (Exception e) {
            System.out.println("[Test] Error filling first name: " + e.getMessage());
            throw e;
        }
    }

    public void fillLastName(String lastName) {
        System.out.println("[Test] Filling last name: " + lastName);
        try {
            WebElement lastNameInput = waitForVisibility(HomePageLocators.LAST_NAME_INPUT);
            System.out.println("[Test] Last name input found, clicking...");
            lastNameInput.click();
            System.out.println("[Test] Clearing last name input...");
            lastNameInput.clear();
            System.out.println("[Test] Sending keys to last name input...");
            lastNameInput.sendKeys(lastName);
            System.out.println("[Test] Last name filled successfully");
        } catch (Exception e) {
            System.out.println("[Test] Error filling last name: " + e.getMessage());
            throw e;
        }
    }

    public void fillCompany(String company) {
        System.out.println("[Test] Filling company: " + company);
        try {
            WebElement companyInput = waitForVisibility(HomePageLocators.COMPANY_INPUT);
            System.out.println("[Test] Company input found, clicking...");
            companyInput.click();
            System.out.println("[Test] Clearing company input...");
            companyInput.clear();
            System.out.println("[Test] Sending keys to company input...");
            companyInput.sendKeys(company);
            System.out.println("[Test] Company filled successfully");
        } catch (Exception e) {
            System.out.println("[Test] Error filling company: " + e.getMessage());
            throw e;
        }
    }

    public void fillJobTitle(String jobTitle) {
        System.out.println("[Test] Filling job title: " + jobTitle);
        try {
            WebElement jobTitleInput = waitForVisibility(HomePageLocators.JOB_TITLE_INPUT);
            System.out.println("[Test] Job title input found, clicking...");
            jobTitleInput.click();
            System.out.println("[Test] Clearing job title input...");
            jobTitleInput.clear();
            System.out.println("[Test] Sending keys to job title input...");
            jobTitleInput.sendKeys(jobTitle);
            System.out.println("[Test] Job title filled successfully");
            
            // Scroll down the page
            System.out.println("[Test] Scrolling down after filling job title...");
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300);");
            try {
                Thread.sleep(1000); // Short wait for scroll operation to complete
            } catch (InterruptedException e) {
                System.out.println("[Test] Sleep interrupted: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        } catch (Exception e) {
            System.out.println("[Test] Error filling job title: " + e.getMessage());
            throw e;
        }
    }

    public void fillEmail(String email) {
        System.out.println("[Test] Filling email: " + email);
        try {
            WebElement emailInput = waitForVisibility(HomePageLocators.EMAIL_INPUT);
            System.out.println("[Test] Email input found, clicking...");
            emailInput.click();
            System.out.println("[Test] Clearing email input...");
            emailInput.clear();
            System.out.println("[Test] Sending keys to email input...");
            emailInput.sendKeys(email);
            System.out.println("[Test] Email filled successfully");
        } catch (Exception e) {
            System.out.println("[Test] Error filling email: " + e.getMessage());
            throw e;
        }
    }

    public void fillPhone(String phone) {
        System.out.println("[Test] Filling phone: " + phone);
        try {
            WebElement phoneInput = waitForVisibility(HomePageLocators.PHONE_INPUT);
            System.out.println("[Test] Phone input found, clicking...");
            phoneInput.click();
            System.out.println("[Test] Clearing phone input...");
            phoneInput.clear();
            System.out.println("[Test] Sending keys to phone input...");
            phoneInput.sendKeys(phone);
            System.out.println("[Test] Phone filled successfully");
        } catch (Exception e) {
            System.out.println("[Test] Error filling phone: " + e.getMessage());
            throw e;
        }
    }

    public void fillMessage(String message) {
        System.out.println("[Test] Filling message: " + message);
        try {
            WebElement messageTextarea = waitForVisibility(HomePageLocators.MESSAGE_TEXTAREA);
            System.out.println("[Test] Message textarea found, clicking...");
            messageTextarea.click();
            System.out.println("[Test] Clearing message textarea...");
            messageTextarea.clear();
            System.out.println("[Test] Sending keys to message textarea...");
            messageTextarea.sendKeys(message);
            System.out.println("[Test] Message filled successfully");
        } catch (Exception e) {
            System.out.println("[Test] Error filling message: " + e.getMessage());
            throw e;
        }
    }
}
