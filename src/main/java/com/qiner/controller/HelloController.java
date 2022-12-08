package com.qiner.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yayee
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }
}
