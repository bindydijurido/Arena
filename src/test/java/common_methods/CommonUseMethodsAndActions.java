package common_methods;

import driver.Root;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.LinkedList;
import java.util.List;

import static search_engine.SearchEngineLocators.searchBar;
import static search_engine.SearchEngineLocators.searchSubmit;

public class CommonUseMethodsAndActions extends Root {

    /**
     * This list is using for collecting data about product prices from Search Results.
     */

    protected static final LinkedList<String> PRODUCT_PRICES = new LinkedList<>();

    /**
     * This method simplify printing any data on console. It is much easier to write a code just with one word.
     *
     * @param text specify what data you want to print on console.
     */

    protected static void log(String text) {
        System.out.println(text);
    }

    /**
     * This method simplify searching for elements via Selenium WebDriver. It is much easier to write a code just with one word.
     *
     * @param locator specify which WebElement you want to find.
     */

    protected static WebElement let(By locator) {
        return driver.findElement(locator);
    }

    /**
     * This method opens main page for tests.
     */

    protected static void openArenaPage() {
        driver.get("https://arena.pl/");
    }

    /**
     * This method is collecting Product Names from Search Results by class name.
     */

    protected static List<WebElement> viewProductNameList() {
        return driver.findElements(By.className("product__name"));
    }

    /**
     * This method is collecting Product Prices from Search Results by class name.
     */

    protected static List<WebElement> viewProductPriceList() {
        return driver.findElements(By.className("product__price"));
    }

    /**
     * This method provide item of interest into Search Bar.
     *
     * @param productName specify a word that you want to search for during test.
     */

    protected static void searchProductByName(String productName) {
        let(searchBar()).sendKeys(productName);
        let(searchSubmit()).click();
    }

    /**
     * This method is collecting prices data from search results and adding those into {@link #PRODUCT_PRICES} list.
     * When this method is called {@link #PRODUCT_PRICES} list is dropped and fulfill with new data once again.
     */

    protected static void dumpProductPricesToList() {
        PRODUCT_PRICES.clear();

        for (int i = 0; i < viewProductPriceList().size(); i++) {

            String productPrice = viewProductPriceList()
                    .get(i)
                    .getText()
                    .split(" ")[0];

            PRODUCT_PRICES.add(productPrice);
        }
    }
}