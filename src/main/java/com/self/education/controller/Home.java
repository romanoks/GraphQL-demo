package com.self.education.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String homePage()
    {
        return "home Sweet Home";
    }
}
