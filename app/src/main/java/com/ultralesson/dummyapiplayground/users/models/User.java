package com.ultralesson.dummyapiplayground.users.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.testng.Assert;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String title;
    private String dateOfBirth;
    private String registerDate;
    private String updatedDate;
    private String phone;
    private String picture;
    private Location location;
    private int statusCode;

    public User init(){
        return this.toBuilder()
                .firstName("dummy")
                .lastName("user")
                .email(UUID.randomUUID()+"@gmail.com")
                .build();
    }

    public void assertThatUserIsCreated(User user) {
        Assert.assertEquals(this.firstName,user.getFirstName());
        Assert.assertEquals(this.lastName,user.getLastName());
        Assert.assertEquals(this.email,user.getEmail());
        Assert.assertNotNull(this.id);
        Assert.assertFalse(this.id.isEmpty());
        Assert.assertFalse(this.registerDate.isEmpty());
        Assert.assertFalse(this.updatedDate.isEmpty());
    }
}