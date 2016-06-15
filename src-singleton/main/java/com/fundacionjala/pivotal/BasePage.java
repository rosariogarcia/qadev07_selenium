package com.fundacionjala.pivotal;

import org.openqa.selenium.WebDriver;

/**
 * Created by RosarioGarcia on 6/15/2016.
 */
public abstract class BasePage {
    private static final String PIVOTAL_TRACKER_URL = "https://www.pivotaltracker.com/";
    private DriverManager driverManager = DriverManager.getInstance();
    protected WebDriver driver;

    public BasePage(){
        driver = driverManager.openBrowser();
        driver.get(PIVOTAL_TRACKER_URL);
    }
}
