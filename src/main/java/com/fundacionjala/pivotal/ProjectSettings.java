package com.fundacionjala.pivotal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Charito on 6/16/2016.
 */
public class ProjectSettings extends BasePage {

    @FindBy(id = "tc_header_project_name")
    private WebElement headerProjectName;

    @FindBy(id = "delete_link")
    private WebElement deleteProjectLink;

    @FindBy(id = "confirm_delete")
    private WebElement confirmDeleteButton;

    @FindBy(id = "project_name")
    private WebElement projectName;

    @FindBy(id = "project_description")
    private WebElement projectDescription;

    @FindBy(className = "save_bar__submit")
    private WebElement saveChanges;

    public String getHeaderProjectName(){
        return headerProjectName.getText();
    }

    public Dashboard deleteProject() {
        deleteProjectLink.click();
        confirmDeleteButton.click();
        return new Dashboard();
    }

    public void setProjectName(String newProjectName){
        projectName.clear();
        projectName.sendKeys(newProjectName);
    }

    public void setProjectDescription(String newProjectDescription){
        projectDescription.clear();
        projectDescription.sendKeys(newProjectDescription);
    }

    public ProjectSettings saveEditProjectSettings(){
        saveChanges.click();
        return new ProjectSettings();
    }
}
