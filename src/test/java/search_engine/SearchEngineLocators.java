package search_engine;

import common_methods.CommonUseMethodsAndActions;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.*;

public class SearchEngineLocators extends CommonUseMethodsAndActions {

    public static By searchBar() { return id("search-typeahead"); }

    public static By searchSubmit() { return className("search-submit"); }

    static By paginationInput() {
        return className("listing-pagination__input");
    }

    static By numberFoundPages() { return xpath("//*[@id=\"listing-app\"]/div[1]/div[2]/div[2]/div[3]/div[2]/div[2]/div[2]/span");
    }
}
