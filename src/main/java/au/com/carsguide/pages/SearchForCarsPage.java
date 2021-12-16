package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchForCarsPage extends Utility {

    private static final Logger log = LogManager.getLogger(SearchForCarsPage.class.getName());

    public SearchForCarsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = ".listing-search-title")
    WebElement verifySearch;

    public void verifySearch(String make) {
        String expectedResult = verifySearch.getText();
        Boolean actualMessage = expectedResult.contains(make);
        Assert.assertTrue(actualMessage);
        log.info("verifying search results : " + verifySearch.toString());
    }
}
