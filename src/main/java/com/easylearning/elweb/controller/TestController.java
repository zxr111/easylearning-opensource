package com.easylearning.elweb.controller;

import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/password")
    public int password(String pwd) {
        return DigestUtils.md5DigestAsHex(pwd.getBytes()).length();
    }

}
