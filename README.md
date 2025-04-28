# 🚀 Bedrock E2E Test Framework 🚀

<p align="center">
  <img src="https://media.giphy.com/media/3o7btPCcdNniyf0ArS/giphy.gif" width="200"/>
</p>

## Overview
This framework is designed for automated end-to-end testing of the Bedrock website using Selenium WebDriver, Cucumber, and Allure reporting.

## 🛠️ Technologies Used

- <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/> Java
- <img src="https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white"/> Selenium WebDriver
- <img src="https://img.shields.io/badge/Cucumber-23D96C?style=for-the-badge&logo=cucumber&logoColor=white"/> Cucumber & Gherkin
- <img src="https://img.shields.io/badge/Maven-007396?style=for-the-badge&logo=apachemaven&logoColor=white"/> Maven
- <img src="https://img.shields.io/badge/JUnit-25A162?style=for-the-badge&logo=junit5&logoColor=white"/> JUnit
- <img src="https://img.shields.io/badge/Allure-FF4B4B?style=for-the-badge&logo=allure&logoColor=white"/> Allure Reports

## 🧩 Project Structure
```
src/
└── test/
    └── java/
        ├── locators/
        │   └── HomePageLocators.java
        ├── pages/
        │   ├── BasePage.java
        │   └── HomePage.java
        ├── runners/
        │   └── TestRunner.java
        └── stepdefinitions/
            ├── Hooks.java
            └── HomePageSteps.java
    └── resources/
        └── features/
            └── BedrockHome.feature
```

## 📝 Example Test Scenario
```gherkin
Feature: Bedrock Streaming Home Page Test
  Scenario: Home page title and menu control
    Given User navigates to "https://bedrockstreaming.com/"
    When User checks the home page title
    And User sees "Solutions" tab in the menu
    And User clicks on the "Contact" button
    Then Contact page opens and the title is "Contact us"
```

## 🚀 Getting Started

### Prerequisites
- Java 11 or higher
- Maven 3.8.0 or higher
- Chrome browser installed
- Allure command-line tool installed

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/aysenur2689/E2E_Bedrock.git
   ```
2. Navigate to the project directory:
   ```bash
   cd E2E_Bedrock
   ```
3. Install dependencies:
   ```bash
   mvn clean install
   ```

### Running Tests
1. Run tests:
   ```bash
   mvn test
   ```
2. Generate Allure report:
   ```bash
   mvn allure:report
   ```
3. Serve the report:
   ```bash
   mvn allure:serve
   ```

## 🔥 Features
- Page Object Model (POM) implementation
- Automated browser testing with Selenium WebDriver
- BDD approach with Cucumber
- Detailed test reporting with Allure
- Cross-browser testing support
- Screenshot capture on test failure
- Parallel test execution capability

## 📊 Test Reports
The framework generates comprehensive test reports using Allure, including:
- Test execution steps
- Screenshots on failure
- Test duration tracking
- Environment information
- Test categorization

## 🤝 Contributing
1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📬 Contact
- [Bedrock Streaming](https://bedrockstreaming.com/)
- [GitHub Profile](https://github.com/aysenur2689)

## 📄 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

<p align="center">
  <img src="https://img.shields.io/badge/Happy%20Testing-💚-brightgreen"/>
</p>
