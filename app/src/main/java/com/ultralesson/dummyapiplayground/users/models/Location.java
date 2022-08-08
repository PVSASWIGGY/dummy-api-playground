package com.ultralesson.dummyapiplayground.users.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Location {
    private String street;
    private String city;
    private String state;
    private String country;
    private String timezone;
}
