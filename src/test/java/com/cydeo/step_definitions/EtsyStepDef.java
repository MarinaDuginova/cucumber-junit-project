package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyStepDef {

EtsySearchPage etsySearchPage = new EtsySearchPage();
    @Given("User in on Etsy home page")
    public void user_in_on_etsy_home_page() {
        Driver.getDriver().get("\"https://www.etsy.com ");

    }

    @Then("User sees title is as expected.")
    public void user_sees_title_is_as_expected() {

        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        Assert.assertEquals("Title verification failed!", expectedTitle, Driver.getDriver().getTitle());
    }
    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {

        String expectedTitle = "Wooden Spoon";

        Assert.assertTrue("Title verification failed!", Driver.getDriver().getTitle().contains(expectedTitle));

    }
    @When("User clicks search button")
    public void user_clicks_search_button(String searchButton) {



    }

    @When("User types {string} in the search box")
    public void user_types_in_the_search_box(String searchKeyword) {

        etsySearchPage.searchBox.sendKeys(searchKeyword);


    }

    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title(String expectedTitle) {

        Assert.assertEquals("Title verification failed!" , Driver.getDriver().getTitle().contains(expectedTitle));
    }


}
