package com.fundacionjala.pivotal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by RosarioGarcia on 6/15/2016.
 */
public class PivotalHome extends BasePage{

    @FindBy(css = "a[href='/signin']")
    private WebElement signInLink;

    public PivotalHome() {
        PageFactory.initElements(driver, this);
    }

    public Login clickSignInLink() {
        signInLink.click();
        return new Login();
    }
}
