# ArenaTask Automation Tests
This project contains web automation tests for the Arena.pl website, implemented using Java, Selenium WebDriver, and JUnit. It demonstrates automated testing for functionalities such as product search and specific data verification tasks.

## Key Features & Structure
*   **Language/Framework:** Java, JUnit 4
*   **Browser Automation:** Selenium WebDriver
*   **Test Design:** The tests follow a Page Object Model-like pattern, with actions encapsulated in separate classes (`SearchEngineActions`, `MathTaskActions`) for better maintainability. Common utility methods are stored in `CommonUseMethodsAndActions`.
*   **Driver Management:** WebDriverManager is used for automatic browser driver (ChromeDriver) setup.

# Go directly to Tests
https://github.com/bindydijurido/Arena/tree/master/src/test/java/tests
# 

# Technical Stack

This project utilizes the following libraries and tools:

*   **Java SE Development Kit 8:** [http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
*   **Selenium WebDriver (Java Bindings, e.g., v3.4.0):** [http://www.seleniumhq.org/download/](http://www.seleniumhq.org/download/) - _WebDriver browser drivers are managed automatically by WebDriverManager._
*   **Selenium StandAlone Server (e.g., v3.4.0):** [http://www.seleniumhq.org/download/](http://www.seleniumhq.org/download/) - _May be needed for advanced Selenium Grid configurations, but not required for running tests locally with this setup._
*   **JUnit 4.12:** [https://mvnrepository.com/artifact/junit/junit/4.12](https://mvnrepository.com/artifact/junit/junit/4.12)
*   **WebDriverManager:** Integrated via Gradle to manage browser driver binaries automatically. This project uses WebDriverManager to automatically handle browser driver (e.g., ChromeDriver) downloads and setup, so manual configuration is no longer needed.
*   **IDE:** IntelliJ Community 2018.3 (or any other Java IDE)

Dependencies are managed via Gradle.
#

**Enjoy and feel free to comment everything you want :)**

Best,

bindydijurido
