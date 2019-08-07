package com.itmayiedu.api.controller;

import com.itmayiedu.api.entity.User;
import com.itmayiedu.api.service.IMemberService;
import com.itmayiedu.api.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class MemberController implements IMemberController{


    @Value("${server.port}")
    private Integer serverPort;

//    @GetMapping("/getMember1")
//  public String getMember1(){
//        return "会员服务，"+serverPort;
//    }

    @Autowired
    private MemberService memberService;


    @RequestMapping("/getMember")
    public String getMember(@RequestParam("id") Integer id){

       System.out.println("Controller层id："+id);

        User user=memberService.getMember(id);

        if(user!=null){
            return "我是会员服务，人员信息："+user.toString()+"，端口号："+serverPort;
        }else{
            return "我是会员服务，人员信息："+null+"，端口号："+serverPort;
        }

    }
}
