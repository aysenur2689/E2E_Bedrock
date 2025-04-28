package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import pages.HomePage;

public class HomePageSteps {
    HomePage homePage;

    @Given("User navigates to {string}")
    public void user_navigates_to(String url) {
        try {
            System.out.println("[Test] Navigating to: " + url);
            homePage = new HomePage(Hooks.driver);
            homePage.goToUrl(url);
            System.out.println("[Test] Page title: " + homePage.getHomePageTitle());
        } catch (Exception e) {
            System.err.println("[ERROR] WebDriver could not be started or page could not be opened: " + e.getMessage());
            throw e;
        }
    }

    @When("User checks the home page title")
    public void user_checks_the_home_page_title() {
        String title = homePage.getHomePageTitle();
        System.out.println("[Test] Page title: " + title);
        Assert.assertTrue("Page title does not contain 'Bedrock'", title.contains("Bedrock"));
    }

    @When("User sees {string} tab in the menu")
    public void user_sees_tab_in_the_menu(String menu) {
        boolean isVisible = homePage.isSolutionsMenuVisible();
        System.out.println("[Test] Is Solutions menu visible: " + isVisible);
        Assert.assertTrue("Solutions menu is not visible", isVisible);
    }

    @When("User clicks on the Solutions menu")
    public void user_clicks_on_the_solutions_menu() {
        System.out.println("[Test] Clicking on Solutions menu...");
        homePage.clickSolutionsMenu();
    }

    @When("User clicks on the {string} button")
    public void user_clicks_on_the_button(String button) {
        System.out.println("[Test] Clicking on Contact button...");
        homePage.clickContactButton();
    }

    @When("User fills first name as {string}")
    public void user_fills_first_name(String firstName) {
        System.out.println("[Test] Filling first name...");
        homePage.fillFirstName(firstName);
    }

    @When("User fills last name as {string}")
    public void user_fills_last_name(String lastName) {
        System.out.println("[Test] Filling last name...");
        homePage.fillLastName(lastName);
    }

    @When("User fills company as {string}")
    public void user_fills_company(String company) {
        System.out.println("[Test] Filling company...");
        homePage.fillCompany(company);
    }

    @When("User fills job title as {string}")
    public void user_fills_job_title(String jobTitle) {
        System.out.println("[Test] Filling job title...");
        homePage.fillJobTitle(jobTitle);
    }

    @When("User fills email as {string}")
    public void user_fills_email(String email) {
        System.out.println("[Test] Filling email...");
        homePage.fillEmail(email);
    }

    @When("User fills phone as {string}")
    public void user_fills_phone(String phone) {
        System.out.println("[Test] Filling phone...");
        homePage.fillPhone(phone);
    }

    @When("User fills message as {string}")
    public void user_fills_message(String message) {
        System.out.println("[Test] Filling message...");
        homePage.fillMessage(message);
    }

    @Then("Contact page opens and the title is {string}")
    public void contact_page_opens_and_the_title_is(String expectedHeader) {
        boolean isVisible = homePage.isContactHeaderVisible();
        System.out.println("[Test] Is Contact header visible: " + isVisible);
        Assert.assertTrue("Contact header is not visible", isVisible);
        
        String actualHeader = homePage.getContactHeaderText();
        System.out.println("[Test] Expected header: " + expectedHeader);
        System.out.println("[Test] Actual header: " + actualHeader);
        Assert.assertEquals("Contact header does not match expected value", expectedHeader, actualHeader);
    }
}
