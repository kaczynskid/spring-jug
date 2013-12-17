package org.jug.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloJug {

    @RequestMapping("/hello")
    public String greet() {
        return "Hello Jug!";
    }

}
