package com.fundacionjala.pivotal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by RosarioGarcia on 6/14/2016.
 */
public class DriverManager {

    private static DriverManager instance;
    private WebDriver driver;
    //private WebDriver mozilla = null;

    private DriverManager(){}

    public static DriverManager getInstance(){
        if(instance==null){
            instance = new DriverManager();
        }
        return instance;
    }

    public void initWebDriver(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
