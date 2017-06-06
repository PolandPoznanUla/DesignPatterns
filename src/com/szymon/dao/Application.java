package com.szymon.dao;

import com.szymon.UserPredicateFactory;
import com.szymon.builder.User;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        List<List<String>> namelist = Arrays.asList(
                Arrays.asList("Szymon", "Wojciech", "Adam"),
                Arrays.asList("Anna", "Janina", "Malgorzata"));

        namelist.stream()
                .flatMap(e -> e.stream())
//                .filter(e -> e.startsWith("A"))
                .filter(UserPredicateFactory.nameStartsWith("A"))
                .sorted()
                .forEach(e -> System.out.println(e));

        Map<String, List<String>> map = new HashMap<>();
        map.put("men", Arrays.asList("Szymon", "Wojciech", "Adam"));
        map.put("women", Arrays.asList("Anna", "Janina", "Malgorzata"));

        map.entrySet()
                .stream()
                .map(e -> e.getValue())
                .flatMap(e -> e.stream())
//                .flatMap(e -> e.getValue().stream())
                .filter(UserPredicateFactory.nameStartsWith("A"))
                .sorted()
                .forEach(e -> System.out.println(e));

    }
}
