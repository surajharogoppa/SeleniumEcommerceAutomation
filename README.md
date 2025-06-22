# 🛒 E-Commerce Test Automation Framework

![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=Selenium&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF6A00?style=for-the-badge)

A robust automation framework for testing e-commerce workflows using Selenium WebDriver, Java, and TestNG.

## 🚀 Features
- **End-to-End Testing**: Automates critical user flows (login, product search, cart management, checkout)
- **Page Object Model (POM)**: Maintainable and reusable test architecture
- **Data-Driven Testing**: Supports Excel/JSON test data for multiple scenarios
- **Parallel Execution**: TestNG-powered parallel test runs
- **Detailed Reporting**: HTML reports with screenshots for failed tests

## 🛠️ Tech Stack
- **Core**: Selenium WebDriver 4.x, Java 11+
- **Testing**: TestNG, Maven
- **Utilities**: Apache POI (Excel handling), Log4j (logging)
- **CI/CD**: GitHub Actions (sample workflow included)

## 📦 Setup
1. **Prerequisites**:
   - Java JDK 11+
   - Maven 3.8+
   - Chrome/Firefox browsers

2. **Installation**:
   ```bash
   git clone https://github.com/surajharogoppa/SeleniumEcommerceAutomation.git
   cd SeleniumEcommerceAutomation
 mvn clean install

 

📂 Project Structure
 src/
├── main/java/
│   ├── pages/      # Page Object classes
│   ├── utils/      # Helper classes
│   └── managers/   # Driver/config management
└── test/java/
    ├── tests/      # Test scripts
    └── data/       # Test data files



  
📸 Sample Test Scenario

@Test(dataProvider = "searchData")
public void testProductSearch(String product, String expectedPrice) {
    HomePage home = new HomePage(driver);
    home.searchProduct(product)
        .verifyPrice(expectedPrice);
}


🤝 Contribute
Found a bug? Want to improve the framework?

Fork the repository

Create your feature branch (git checkout -b feature/improvement)

Commit your changes (git commit -m 'Add new test cases')

Push to the branch (git push origin feature/improvement)

Open a Pull Request
