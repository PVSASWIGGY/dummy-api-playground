package com.ultralesson.dummyapiplayground.user.create;

import com.ultralesson.dummyapiplayground.users.models.User;
import com.ultralesson.dummyapiplayground.users.services.UserService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateUserTests {
    private UserService userService;
    @BeforeClass
    public void beforeClass(){
        userService=new UserService();
    }
    @Test(groups={"sanity","create","user"})
    public void shouldCreateUser(){
        //arrange
        User user = new User().init();
        //act
        User userResponse=userService.createUser(user);
        //assert
        userResponse.assertThatUserIsCreated(user);
    }
}
