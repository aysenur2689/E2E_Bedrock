# Bedrock E2E Test Framework

## Overview
This framework is designed for automated end-to-end testing of the Bedrock website using Selenium WebDriver, Cucumber, and Allure reporting.

## Prerequisites
- Java 11 or higher
- Maven 3.8.0 or higher
- Chrome browser installed
- Allure command-line tool installed

## Project Structure
```
src/
├── main/
│   └── java/
│       └── com/
│           └── bedrock/
│               └── utils/
│                   ├── ConfigReader.java
│                   └── WebDriverManager.java
└── test/
    └── java/
        ├── com/
        │   └── bedrock/
        │       ├── hooks/
        │       │   └── Hooks.java
        │       ├── locators/
        │       │   └── HomePageLocators.java
        │       ├── pages/
        │       │   ├── BasePage.java
        │       │   └── HomePage.java
        │       └── steps/
        │           └── HomePageSteps.java
        └── resources/
            └── features/
                └── BedrockHome.feature
```

## Configuration
- `config.properties`: Contains test configuration parameters
- `pom.xml`: Maven configuration with dependencies and plugins

## Dependencies
- Selenium WebDriver 4.16.1
- Cucumber 7.14.0
- WebDriverManager 5.6.2
- Allure Cucumber7 JVM 2.24.0
- JUnit 4.13.2

## Running Tests
1. Open a terminal in the project root directory
2. Run the following command:
   ```bash
   mvn clean test
   ```

## Generating and Viewing Allure Reports
1. After running tests, generate the Allure report:
   ```bash
   mvn allure:report
   ```
2. To serve the report and open it in your default browser:
   ```bash
   mvn allure:serve
   ```

## Test Features
- Home page navigation
- Solutions menu interaction
- Contact form filling
- Form validation
- Page title verification

## Allure Reporting
The framework uses Allure for test reporting with the following features:
- Detailed test execution steps
- Screenshots on failure
- Test duration tracking
- Environment information
- Test categorization

## Batch File Usage
A batch file (`run-tests.bat`) is provided for easy test execution:
1. Double-click `run-tests.bat` or
2. Run from command line:
   ```bash
   .\run-tests.bat
   ```
This will:
- Run the tests
- Generate the Allure report
- Open the report in your default browser

## Troubleshooting
If you encounter issues:
1. Check Chrome browser version compatibility
2. Verify Java and Maven installations
3. Ensure all dependencies are properly downloaded
4. Check the Allure report for detailed error information

## Contributing
1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## License
This project is licensed under the MIT License - see the LICENSE file for details.

<p align="center">
  <img src="https://media.giphy.com/media/3o7btPCcdNniyf0ArS/giphy.gif" width="200"/>
</p>

<h1 align="center">🚀 Bedrock Streaming Test Framework 🚀</h1>

---

## 🛠️ Technologies Used

- <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/> Java
- <img src="https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white"/> Selenium WebDriver
- <img src="https://img.shields.io/badge/Cucumber-23D96C?style=for-the-badge&logo=cucumber&logoColor=white"/> Cucumber & Gherkin
- <img src="https://img.shields.io/badge/Maven-007396?style=for-the-badge&logo=apachemaven&logoColor=white"/> Maven
- <img src="https://img.shields.io/badge/JUnit-25A162?style=for-the-badge&logo=junit5&logoColor=white"/> JUnit

## 🧩 Page Object Model (POM)
- **BasePage**: Common functions (navigate, click, type, wait, scroll, refresh, etc.)
- **Locators**: All locators are kept in separate classes
- **Page**: Page-specific functions
- **Step Definitions**: Java code corresponding to Gherkin steps

## 📝 Example Gherkin Scenario

```gherkin
Feature: Bedrock Streaming Home Page Test
  Scenario: Home page title and menu control
    Given User navigates to "https://bedrockstreaming.com/"
    When User checks the home page title
    And User sees "Solutions" tab in the menu
    And User clicks on the "Contact" button
    Then Contact page opens and the title is "Contact us"
```

## 🔥 BasePage Functions
- goToUrl
- getTitle
- click
- type
- getText
- isDisplayed
- hover
- scrollTo
- waitForVisibility
- waitForInvisibility
- waitForText
- getElements
- refresh
- back
- forward

## 🚦 How to Run

1. `mvn clean install`
2. `mvn test`

> 💡 **Note:** Set the ChromeDriver path according to your system.

## 🎨 Live Banner and Icons

<p align="center">
  <img src="https://media.giphy.com/media/3o7btPCcdNniyf0ArS/giphy.gif" width="200"/>
</p>

---

## 📣 Contributing
You can send pull requests or open issues!

---

## 📬 Contact
- [Bedrock Streaming](https://bedrockstreaming.com/)

---

<p align="center">
  <img src="https://img.shields.io/badge/Happy%20Testing-💚-brightgreen"/>
</p>
