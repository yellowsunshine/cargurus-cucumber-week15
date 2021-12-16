package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CarDealersPage extends Utility {

    private static final Logger log = LogManager.getLogger(CarDealersPage.class.getName());

    public CarDealersPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy (className = "dealerListing--name")
    List<WebElement> dealerNames;

    public void verifyDealerNames(String menu) {

        for (WebElement name : dealerNames) {
            if (menu==name.getText()) {
                Assert.assertTrue(true);
                break;
            }else Assert.assertFalse(false);
        }
    }


}
