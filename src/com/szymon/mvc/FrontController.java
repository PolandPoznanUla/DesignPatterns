package com.szymon.mvc;

import com.szymon.builder.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by RENT on 2017-06-06.
 */
public class FrontController {

    private Map<String, Controller> controllers;
    private Map<String, View> views;

    public FrontController() {
        controllers = new HashMap<>();
        views = new HashMap<>();

        setupControllers();
        setupViews();
    }

    private void setupViews() {
        views.put("json", new JsonView());
        views.put("html", new HtmlView());
    }

    private void setupControllers() {
        controllers.put("home", new HomeController());
        controllers.put("about", new AboutController());
    }

//    handle("home.json")
    public void handle(String vslue) {
        String[] split = vslue.split(" ");
        Object object;
        if (controllers.containsKey(split[0])) {

            Controller controller = controllers.get(split[0]);
            object = controller.handle();

            if (views.containsKey(split[1])) {
                View view = views.get(split[1]);
                System.out.println(view.home((User) object));
            }
        } else {
            System.out.println("Controller for " + split[0] + "not found");
        }

    }

}
