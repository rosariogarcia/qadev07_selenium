package com.fundacionjala.pivotal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by RosarioGarcia on 6/15/2016.
 */
public abstract class BasePage {


    protected WebDriver driver;

    public BasePage(){
        driver = DriverManager.getInstance().getDriver();
        PageFactory.initElements(driver,this);
    }
}
