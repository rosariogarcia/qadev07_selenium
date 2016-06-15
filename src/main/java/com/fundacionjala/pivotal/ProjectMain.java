package com.fundacionjala.pivotal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by RosarioGarcia on 6/15/2016.
 */
public class ProjectMain extends BasePage {
    @FindBy(className = "raw_context_name")
    private WebElement projectNameText;

    public String getProjectNameText() {
         return projectNameText.getText();
    }
}
