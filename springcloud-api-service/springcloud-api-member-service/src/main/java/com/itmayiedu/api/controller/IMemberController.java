package com.itmayiedu.api.controller;

import com.itmayiedu.api.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface IMemberController {

    @RequestMapping("/getMember")
    public String getMember(@RequestParam("id") Integer id);
}
