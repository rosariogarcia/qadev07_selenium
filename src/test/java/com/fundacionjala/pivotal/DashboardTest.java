package com.fundacionjala.pivotal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by RosarioGarcia on 6/15/2016.
 */
public class DashboardTest {
    private  Dashboard dashboard;
    private ProjectMain project;
    @Before
    public void setUP(){
        dashboard = Login.loginAS("walter_mercado_jala","P@ssw0rd"); //transporter design pattern
    }
    @Test
    public void testNewProject(){

        dashboard.newProject();
        String projectName = "rosario project";
        dashboard.setProjectNameTextField(projectName);
        dashboard.setNewAccountTextField(projectName);
        project = dashboard.clickNewProjectButton();
        assertEquals("Rosario Project", project.getProjectNameText());
    }

    @After
    public void postCondition(){

        ProjectSettings projectSettings = project.goToProjectSettings();
        projectSettings.deleteProject();
    }
}
