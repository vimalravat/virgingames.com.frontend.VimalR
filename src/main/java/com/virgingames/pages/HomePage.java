package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Accept')]")
    WebElement acceptCookies;
    @CacheLookup
    @FindBy(xpath = "//header/div[1]/a[1]/div[1]/picture[1]/img[1]")
    WebElement virginGamesLogoOnTheHomePage;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'All Games')]")
    WebElement allGamesTabOnHomePage;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Online Slots')]")
    WebElement onlineSlotsTextOnAllGamesPage;

    public void clickOnCookiesBannerToAccept() {
        clickOnElement(acceptCookies);
    }

    public void companyLogoOnHomePage() {
        verifyThatElementIsDisplayed(virginGamesLogoOnTheHomePage);
    }
    public void clickOnAllGamesTabOnHomePage() {
        clickOnElement(allGamesTabOnHomePage);
    }
    public String getOnlineSlotsTextOnAllGamesPage() {
        return getTextFromElement(onlineSlotsTextOnAllGamesPage);
    }

}
