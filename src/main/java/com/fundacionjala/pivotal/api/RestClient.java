package com.fundacionjala.pivotal.api;

import org.openqa.selenium.remote.Response;
import static com.jayway.restassured.RestAssured.baseURI;
import static com.jayway.restassured.RestAssured.expect;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by Charito on 6/29/2016.
 */
public class RestClient {
    private RestClient instance;

    private RestClient(){

    }

    public RestClient getInstance() {
        if (instance == null){
            return new RestClient();
        }
        return instance;
    }

    public void init(){

        Response response = given().relaxedHTTPSValidation()
                .proxy("http://172.20.240.5:8080")
                .header("X-TrackerToken", "cc208743093009d653e793ba384f6f16")
                .when().then().statuscode(200) ;
    }
}
