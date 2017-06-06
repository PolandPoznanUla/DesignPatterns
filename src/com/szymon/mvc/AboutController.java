package com.szymon.mvc;

import com.szymon.builder.User;

/**
 * Created by RENT on 2017-06-06.
 */
public class AboutController implements Controller{
    @Override
    public Object handle() {
        return new User("q34", "235", "354", 13);
    }
}
