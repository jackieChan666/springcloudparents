package com.itmayiedu.api.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface IOrderContoller {

   // public

    @GetMapping("/orderToMember")
    public String orderToMember(Integer id);

}
