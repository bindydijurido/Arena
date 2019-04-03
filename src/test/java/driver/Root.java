package driver;

import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/**
 * This class contains a driver instance. Here you can define which browser you want to use for testing purposes.
 * As you can see tests will start with fullscreen mode. Driver is defined to wait maximum 10 seconds for another task,
 * otherwise test will fail. When test is finished driver will quit and close the browser.
 *
 *
 *   for Windows systems replace 32 line with the one below:
 *
 *     System.setProperty("webdriver.chrome.driver", "libs/chromedriver.exe");
 *
 * Please remember that you don't have to limit yourself only to Chrome Browser. Just try a different driver for another one, i.e geckodriver for Firefox Browser etc. : )
 *
 * @author filipskwierczynski
 */

public class Root {

    protected static WebDriver driver;

    @BeforeClass
    public static void setupBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-fullscreen");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Long.parseLong("10"), TimeUnit.SECONDS);
    }

    @After
    public void driverQuit() {
        driver.close();
        driver.quit();
    }
}
