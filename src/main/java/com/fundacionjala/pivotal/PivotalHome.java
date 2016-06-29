package com.fundacionjala.pivotal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by RosarioGarcia on 6/15/2016.
 */
public class PivotalHome extends BasePage {

    private static final String PIVOTAL_TRACKER_URL = "https://www.pivotaltracker.com/";

    @FindBy(css = "a[href='/signin']")
    private WebElement signInLink;

    public PivotalHome() {
        driver.get(PIVOTAL_TRACKER_URL);
    }

    public Login clickSignInLink() {
        signInLink.click();
        return new Login();
    }
}
