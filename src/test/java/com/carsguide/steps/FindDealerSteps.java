package com.carsguide.steps;

import com.carsguide.pages.FindDealerPage;
import com.carsguide.pages.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class FindDealerSteps {
    @And("^I click ‘Find a Dealer’$")
    public void iClickFindADealer() throws InterruptedException {
        new HomePage().clickOnFindDealer();
    }

    @Then("^I navigate to car-dealers page$")
    public void iNavigateToCarDealersPage() {
    }



    @And("^I should see the dealer names <dealersName> are display on page$")
    public void iShouldSeeTheDealerNamesDealersNameAreDisplayOnPage(DataTable dataTable) throws InterruptedException {
        new FindDealerPage().getDealerName(dataTable);
    }
}
