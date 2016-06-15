package com.fundacionjala.pivotal;

import org.junit.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by RosarioGarcia on 6/14/2016.
 */
public class TestLogin {
    @Test
    public void testLogin(){
        PivotalHome pivotalHome = new PivotalHome();
        Login login = pivotalHome.clickSignInLink();
        login.setUserNameTextField("walter_mercado_jala");
        login.setPasswordTextField("P@ssw0rd");
        Dashboard dashboard = login.clickSignInButton();
        String expectedUsername = "WALTER_MERCADO_JALA";
        assertEquals(expectedUsername, dashboard.getUserNameText());
    }
}
