package com.fundacionjala.pivotal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by RosarioGarcia on 6/15/2016.
 */
public class ProjectMain extends BasePage {
    @FindBy(className = "raw_context_name")
    private WebElement projectNameText;

    @FindBy(xpath = "html/body/div[1]/div[2]/div[1]/div/div[1]/header/div/a[3]")
    private WebElement settingsLink;

    public String getProjectNameText() {
         return projectNameText.getText();
    }

    public ProjectSettings goToProjectSettings(){
        settingsLink.click();
        return new ProjectSettings();
    }
}
