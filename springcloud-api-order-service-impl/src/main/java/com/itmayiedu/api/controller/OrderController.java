package com.itmayiedu.api.controller;

import com.itmayiedu.api.feign.OrderToMemberFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController implements IOrderContoller{

    @Value("${server.port}")
    private Integer serverPort;


    @Autowired
    private OrderToMemberFeign orderToMemberFeign;

    @GetMapping("/getOrder")
    public String getOrder(){
        return "我是订单服务，端口号："+serverPort;
    }

    @RequestMapping("/orderToMember")
    public String orderToMember(Integer id){

        String res =orderToMemberFeign.getMember(id);

        return res;
    }

}
