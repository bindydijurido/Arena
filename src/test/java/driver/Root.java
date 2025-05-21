package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/**
 * This class contains a driver instance. Here you can define which browser you want to use for testing purposes.
 * WebDriverManager is used to automatically manage the browser driver (e.g., chromedriver).
 * As you can see tests will start with fullscreen mode. Driver is defined to wait maximum 10 seconds for another task,
 * otherwise test will fail. When test finish driver will quit and close the browser.
 *
 * You can adapt this to use other browsers supported by WebDriverManager (e.g., geckodriver for Firefox) by changing
 * `WebDriverManager.chromedriver().setup();` to `WebDriverManager.firefoxdriver().setup();` and updating the
 * `driver = new ChromeDriver(options);` line accordingly.
 *
 * @author filipskwierczynski
 */

public class Root {

    protected static WebDriver driver;

    @BeforeClass
    public static void setupBeforeClass() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-fullscreen");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Long.parseLong("10"), TimeUnit.SECONDS);
    }

    @After
    public void driverQuit() {
        driver.quit();
    }
}
