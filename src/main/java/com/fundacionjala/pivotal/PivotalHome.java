package com.fundacionjala.pivotal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by RosarioGarcia on 6/14/2016.
 */
public class PivotalHome {
    private static final String PIVOTAL_TRACKER_URL = "https://www.pivotaltracker.com/";

    private WebDriver driver;

    @FindBy(css = "a[href='/signin']")
    private WebElement signInLink;

    public PivotalHome() {
        driver = new FirefoxDriver();
        driver.get(PIVOTAL_TRACKER_URL);
        PageFactory.initElements(driver, this);
    }

    public Login clickSignInLink() {
        signInLink.click();
        return new Login(driver);
    }
}
