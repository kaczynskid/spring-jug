package org.jug.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloJug {

    private final Application.Settings settings;

    @Autowired
    public HelloJug(Application.Settings settings) {
        this.settings = settings;
    }

    @RequestMapping("/hello")
    public String greet() {
        return settings.getGreeting() + " Jug!";
    }

}
