package com.fundacionjala.pivotal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by RosarioGarcia on 6/15/2016.
 */
public class ProjectMain {
    private WebDriver driver;

    @FindBy(className = "raw_context_name")
    private WebElement projectNameText;

    public ProjectMain(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String getProjectNameText() {
        return projectNameText.getText();
    }
}
