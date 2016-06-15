package com.fundacionjala.pivotal;

import org.openqa.selenium.By;

/**
 * Created by RosarioGarcia on 6/15/2016.
 */
public class Dashboard extends BasePage{

    private final By userNameText;

    public Dashboard() {
        userNameText = By.className("tc_dropdown_name");
    }

    public String getUserNameText() {
        return driver.findElement(userNameText).getText();
    }
}
