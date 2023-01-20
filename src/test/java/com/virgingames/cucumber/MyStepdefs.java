package com.virgingames.cucumber;

import com.virgingames.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I accept cookies$")
    public void iAcceptCookies() {
        new HomePage().clickOnCookiesBannerToAccept();
    }

    @And("^verify company logo displayed on home page$")
    public void verifyCompanyLogoDisplayedOnHomePage() {
        new HomePage().companyLogoOnHomePage();
    }

    @And("^click on all games tab on the homepage$")
    public void clickOnAllGamesTabOnTheHomepage() {
        new HomePage().clickOnAllGamesTabOnHomePage();
    }

    @And("^verify online slots text displayed$")
    public void verifyOnlineSlotsTextDisplayed() {
        Assert.assertEquals("Such text not displayed", "Online Slots", new HomePage().getOnlineSlotsTextOnAllGamesPage());
    }
}

