package com.szymon.builder;

/**
 * Created by RENT on 2017-06-05.
 */
public class Apllication {
    public static void main(String[] args) {
        User user = User.builder()
        .firstName("Ula")
        .lastName("Rad")
        .age(30)
        .phoneNumber("3432523545")
        .build();

        System.out.println(user);


    }

}
