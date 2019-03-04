package sort_engine;

import com.google.common.collect.Ordering;
import common_methods.CommonUseMethodsAndActions;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static sort_engine.SortEngineLocators.dropDownMenu;

public class SortEngineActions extends CommonUseMethodsAndActions {

    public static boolean isOrdered = false;

    /**
     * This method handling dropDownMenu on results page. I am not satisfied from this solution but it works here perfectly.
     * Unfortunately I couldn't use here Selenium WebDriver DropDownMenu handling methods here, because implementation of
     * this one is not a typical <select> </select> html element. What's important here - you still has possibility to test
     * any sorting functionality available:
     *
     * @param category specify which sorting method you want to use. Available sorting methods are:
     *                 "Trafność", "Popularność", "Cena rosnąco", "Cena malejąco, "Cena z dostawą rosnąco",
     *                 "Cena z dostawą malejąco"
     */

    public static void pickFromDropDownMenu(String category) throws InterruptedException {
        let(dropDownMenu()).click();
        let(By.linkText(category)).click();
        TimeUnit.SECONDS.sleep(1);
    }

    /**
     * This method is great. Guava gives us many possibilities to test any Order type in list.
     * I used here simple Ordering method which returns us boolean value.
     * {@value #isOrdered} is used for Assert method in Test Method.
     */

    public static void checkPriceAscSortFunctionality() {
        dumpProductPricesToList();
        isOrdered = Ordering.natural().isOrdered(PRODUCT_PRICES);

        log("Prices found in zlotys: " + PRODUCT_PRICES);
    }
}
