package com.fundacionjala.pivotal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by RosarioGarcia on 6/14/2016.
 */
public abstract class BasePage {
    protected WebDriver driver;

    public BasePage(){
        driver = new FirefoxDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
