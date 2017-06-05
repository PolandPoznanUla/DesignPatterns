package com.szymon.dao;

import com.szymon.builder.User;

import java.io.File;
import java.util.List;

public class Application {
    private static  final String PATH = "C:\\Users\\RENT\\IdeaProjects\\wzor\\DesignPatterns\\Users";
    public static void main(String[] args) {
        UserDao userDao = new UserDaoInDaFile(new File(PATH));
        userDao.addUser(User.builder()
                    .firstName("Michal")
                    .lastName("Wisniewski")
                    .phoneNumber("35454656")
                    .age(30)
                    .build());

        List<User> alllUsers = userDao.getAllUsers();
        alllUsers.forEach(e -> System.out.println(e));
//        alllUsers.forEach(System.out::println);
    }
}
