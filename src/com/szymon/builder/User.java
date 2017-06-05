package com.szymon.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
@AllArgsConstructor
public class User {

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private int age;

}
