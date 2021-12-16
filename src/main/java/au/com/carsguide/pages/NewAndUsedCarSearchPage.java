package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.WeakHashMap;


public class NewAndUsedCarSearchPage extends Utility {

    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());

    public NewAndUsedCarSearchPage() {
        PageFactory.initElements(driver , this);
    }

    @CacheLookup
    @FindBy (xpath = "//select[@id='makes']")
    WebElement makes;

    @CacheLookup
    @FindBy (xpath = "//select[@id='models']")
    WebElement models;

    @CacheLookup
    @FindBy (xpath = "//select[@id='locations']")
    WebElement locations;

    @CacheLookup
    @FindBy (xpath = "//select[@id='priceTo']")
    WebElement priceMax;

    @CacheLookup
    @FindBy (id = "search-submit")
    WebElement findMyNextCar;



    public void selectMake(String make) {
        pmSelectByVisibleTextFromDropDown(makes, make);
    }

    public void selectModel(String model) {
        pmSelectByVisibleTextFromDropDown(models, model);
    }

    public void selectLocation(String location) {
        pmSelectByContainsTextFromDropDown(locations, location);
    }

    public void selectPriceMax(String price) {
        pmSelectByContainsTextFromDropDown(priceMax, price);
    }

    public void clickOnFindMyNextCar(){
        pmClickOnElement(findMyNextCar);
    }


}
