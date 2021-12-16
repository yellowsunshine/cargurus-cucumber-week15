package au.com.carsguide.cucumber.Steps;

import au.com.carsguide.pages.CarDealersPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class FindDealerSteps {
    @Then("^I navigate to ‘car-dealers’ page$")
    public void iNavigateToCarDealersPage() {
    }

    @And("^I should see the dealer names \"([^\"]*)\" are display on page$")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(String dealer)  {
        new CarDealersPage().verifyDealerNames(dealer);

    }
}
