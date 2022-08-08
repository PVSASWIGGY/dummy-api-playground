package com.ultralesson.dummyapiplayground.users.clients;

import com.ultralesson.dummyapiplayground.users.models.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserClient {
    private String appId="62e91453bbc7a02d6fb21d0a";
    private String url="https://dummyapi.io/data/v1";
    public Response createUser(User user){
        Response response=given()
                            .log().all()
                            .header("app-id",appId)
                            .contentType(ContentType.JSON)
                            .body(user)
                        .when()
                            .post(url+"/user/create");
        response
                .then()
                .log().body();
        return response;
    }
}