package com.szymon.mvc;

import com.szymon.builder.User;

/**
 * Created by RENT on 2017-06-06.
 */
public class HtmlView implements View<User> {
    @Override
    public String home(User model) {
        return new StringBuilder()
                .append("<h1>" + model.getFirstName() + " " + model.getLastName() + "</h1\n>")
                .append("<h3>" + model.getAge() + "</h3\n")
                .append("<p>Phonenumber: " + model.getPhoneNumber() + "</p\n")
                .toString();
    }
}
