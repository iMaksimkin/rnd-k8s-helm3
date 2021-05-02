package com.sperasoft.ilya.maksimkin.springBootApp.springbootapp.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/api/v1/")
@RequestMapping
public class HelloRes {
    @GetMapping
    public String hello() {
        return "Hello Sperasoft!! VERSION 2 ";
    }
}
