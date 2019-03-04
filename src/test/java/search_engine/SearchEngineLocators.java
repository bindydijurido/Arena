package search_engine;

import common_methods.CommonUseMethodsAndActions;
import org.openqa.selenium.By;

public class SearchEngineLocators extends CommonUseMethodsAndActions {

    public static By searchBar() {
        return By.id("search-typeahead");
    }

    public static By searchSubmit() {
        return By.className("search-submit");
    }

    static By paginationInput() {
        return By.className("listing-pagination__input");
    }

    static By numberFoundPages() {
        return By.xpath("//*[@id=\"listing-app\"]/div[1]/div[2]/div[2]/div[3]/div[2]/div[2]/div[2]/span");
    }
}