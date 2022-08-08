package com.ultralesson.dummyapiplayground.users.services;

import com.ultralesson.dummyapiplayground.users.clients.UserClient;
import com.ultralesson.dummyapiplayground.users.models.User;
import io.restassured.response.Response;

public class UserService {

    public User createUser(User user){
        Response response=new UserClient().createUser(user);
        User userResponse=response.as(User.class);
        userResponse.setStatusCode(response.statusCode());
        return userResponse;
    }
}
