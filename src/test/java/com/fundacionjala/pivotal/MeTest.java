package com.fundacionjala.pivotal;

import com.jayway.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.oauth2;


/**
 * Created by Charito on 6/28/2016.
 */
public class MeTest {

    @Before
    public void setUP() {
        String urlApi = "https://www.pivotaltracker.com/services/v5/";
        Response resp = get().oauth2("cc208743093009d653e793ba384f6f16");

    }

    @Test
    public void meDetailsTest() {
        Response resp = get("https://www.pivotaltracker.com/services/v5/me");
        System.out.println(resp);
    }
}
