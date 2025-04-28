package locators;

import org.openqa.selenium.By;

public class HomePageLocators {
    // Home page locators
    public static final By SOLUTIONS_MENU = By.xpath("//span[normalize-space()='Solution']");
    public static final By CONTACT_BUTTON = By.xpath("//a[contains(@href, 'contact') or contains(text(), 'Contact')]");
    public static final By CONTACT_HEADER = By.xpath("//h1[contains(., 'Contact')] | //h2[contains(., 'Contact')] | //div[contains(@class, 'contact')]//h1");
    
    // Contact form locators
    public static final By FIRST_NAME_INPUT = By.cssSelector("#formFirstname");
    public static final By LAST_NAME_INPUT = By.cssSelector("#formLastname");
    public static final By COMPANY_INPUT = By.cssSelector("#formCompany");
    public static final By JOB_TITLE_INPUT = By.cssSelector("#formJob");
    public static final By EMAIL_INPUT = By.cssSelector("#formEmail");
    public static final By PHONE_INPUT = By.cssSelector("#formPhone");
    public static final By MESSAGE_TEXTAREA = By.cssSelector("textarea[placeholder='Your message *']");
    
    // Other locators can be added
    public static final By ACCEPT_COOKIES = By.xpath("//button[contains(text(), 'Accept') or contains(text(), 'Kabul')]");
    public static final By MAIN_MENU = By.xpath("//nav[contains(@class, 'main-menu')]");
    public static final By FOOTER = By.xpath("//footer");
}
